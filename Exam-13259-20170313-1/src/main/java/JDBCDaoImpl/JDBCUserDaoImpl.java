package JDBCDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBCDao.JDBCUserDao;
import JDBCEntity.FilmLanguage;



public class JDBCUserDaoImpl implements JDBCUserDao {

	public ResultSet fndByName(Connection conn,String name) throws SQLException {
		String sql = "select * from actor where first_name = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,name);
		ResultSet rs = ps.executeQuery();
		System.out.println(5);
		return rs;
	}

	public ResultSet findAll(Connection conn) throws SQLException {
		String sql = "select f.film_id,f.title,f.language_id,f.description,l.name from film f,language l where f.language_id = l.language_id";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return rs;
	}

	public boolean deleteById(Connection conn,int id) throws SQLException {
		String sql = "delete film where language_id = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		boolean flag = ps.execute();
		return flag;
	}

	public void insert(Connection conn, FilmLanguage fl) throws SQLException {
		String sql = "insert into film(title,description) "
				   + "values(?,?) where film_id = ? ";
		int languageId = findById(conn,fl.getLanguageId());
		String sql1 = "insert into language(name) "
				    + "values(?) where language_id = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, fl.getTitle());
		ps.setString(2, fl.getDescription());
		ps.setInt(3, fl.getFilmId());
		ps.executeUpdate();
		ps = conn.prepareStatement(sql1);
		ps.setString(1, fl.getName());
		ps.setInt(2, languageId);
		ps.executeUpdate();
		
	}

	public int findById(Connection conn, int filmId) throws SQLException {
		String sql = "select language_id from film where film_id = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		Integer languageId = null;
		while(rs.next()){
			languageId = rs.getInt("language_id");
		}
		return languageId;
	}

}
	

	







   


