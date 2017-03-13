package JDBCDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBCEntity.FilmLanguage;



public interface JDBCUserDao {
	
	public ResultSet fndByName(Connection conn,String firstName) throws SQLException;
	
	public ResultSet findAll(Connection conn) throws SQLException;
	
	public boolean deleteById(Connection conn,int id) throws SQLException;
	
	public void insert(Connection conn,FilmLanguage fl) throws SQLException;
	
	public int findById(Connection conn,int filmId) throws SQLException;
}
