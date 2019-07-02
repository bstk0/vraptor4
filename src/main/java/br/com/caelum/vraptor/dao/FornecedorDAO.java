package br.com.caelum.vraptor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.dbUtil.ElephantSQLClient;
import br.com.caelum.vraptor.entity.Fornecedor;
import br.com.dbengine.vraptor.interfaces.DAOInterface;

public class FornecedorDAO implements DAOInterface<Fornecedor> {

	private static ElephantSQLClient connDb = new ElephantSQLClient();

	@Override
	public List<Fornecedor> getList() {
		final String SQL_SELECT = "SELECT * FROM FORNECEDOR order by id_fornec";
		List<Fornecedor> listFornecedor = new ArrayList<Fornecedor>();
		Fornecedor fornecedor;
		Connection db = connDb.getConnection();
		try {
			Statement st = db.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT);
			while (rs.next()) {
				fornecedor = new Fornecedor(rs.getString(1), rs.getString(2));
				// System.out.print("Column 1 returned ");
				// System.out.println(rs.getString(1));
				// System.out.print("Column 2 returned ");
				// System.out.println(rs.getString(2));
				listFornecedor.add(fornecedor);
			}
			rs.close();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listFornecedor; // new ArrayList<Fornecedor>();
	}

	@Override
	public void add(Fornecedor fornecedor) {
		final String SQL_INSERT = "INSERT INTO FORNECEDOR (NOME) VALUES (?)";

		try (Connection conn = connDb.getConnection();
				PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

			preparedStatement.setString(1, fornecedor.getNome());
			// preparedStatement.setBigDecimal(2, new BigDecimal(799.88));
			// preparedStatement.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

			int row = preparedStatement.executeUpdate();

			// rows affected
			System.out.println(row); // 1

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Fornecedor fornecedor) {
		final String SQL_UPDATE = "UPDATE FORNECEDOR SET NOME=? WHERE ID_FORNEC=?";

		try (Connection conn = connDb.getConnection();
				PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE)) {

			// preparedStatement.setBigDecimal(1, new BigDecimal(999.99));
			preparedStatement.setString(1, fornecedor.getNome());
			preparedStatement.setInt(2, Integer.parseInt(fornecedor.getId_fornec()));

			int row = preparedStatement.executeUpdate();

			// rows affected
			System.out.println(row);

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Fornecedor getItem(String id) {
		Fornecedor fornecedor = null;
		Connection db = connDb.getConnection();
		try {
			Statement st = db.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM FORNECEDOR WHERE id_fornec = " + id);
			while (rs.next()) {
				fornecedor = new Fornecedor(rs.getString(1), rs.getString(2));
			}
			rs.close();
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fornecedor; // new ArrayList<Fornecedor>();
	}

	@Override
	public String getCount() {
		//
		Connection db = connDb.getConnection();
		String retorno = "0";
		Integer count = 0;
		try {
			Statement st = db.createStatement();
			ResultSet rs = st.executeQuery("select count(*) as total FROM FORNECEDOR");
			while (rs.next()) {
				count = rs.getInt("total");
			}
			retorno = count.toString();
			rs.close();
			st.close();
			return retorno;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;
	}

	@Override
	public String delete(String id) {
		final String sql = "delete from fornecedor where id_fornec = " + id;

		try (Connection conn = connDb.getConnection(); Statement stmt = conn.createStatement();) {

			stmt.executeUpdate(sql);
			System.out.println("Record deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "delete";
	}

	public void connectionTest() {
		connDb.testConnection();
	}

}
