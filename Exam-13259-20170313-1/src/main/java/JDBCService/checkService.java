package JDBCService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCDao.JDBCUserDao;
import JDBCDaoImpl.JDBCUserDaoImpl;
import JDBCEntity.FilmLanguage;
import JDBCUtil.ConnectionFactory;

	public class checkService {
		
		private JDBCUserDao dao = new JDBCUserDaoImpl();
		Connection conn = ConnectionFactory.getInstance().getConnection();
		ResultSet rs = null;
		
		public boolean find(String name){	
			try {		
				rs = dao.fndByName(conn, name);		
				if(rs.next()){			
					System.out.println(6);		
					return true;	
				}else{
					System.out.println(7);
					return false;			
				}					
			} catch (SQLException e) {		
				e.printStackTrace();
			}	
			return false;	
		}
		
		public List<FilmLanguage> findAll(){
			List<FilmLanguage> list  = new ArrayList<FilmLanguage>();
			try {
				rs=dao.findAll(conn);
				while(rs.next()){
					FilmLanguage fl = new FilmLanguage();
					fl.setFilmId(rs.getInt("film_id"));
					fl.setTitle(rs.getString("title"));
					fl.setLanguageId(rs.getInt("language_id"));
					fl.setDescription(rs.getString("description"));
					fl.setName(rs.getString("name"));
					list.add(fl);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}
		
		public boolean deleteById(int id){
			boolean flag= false; 
			try {
				flag = dao.deleteById(conn, id);
				return flag;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return flag;
		}
		public void insert(String title,String description,String name){
			FilmLanguage fl = new FilmLanguage();
			fl.setTitle(title);;
			fl.setDescription(description);;
			fl.setName(name);;
			try {
				dao.insert(conn, fl);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

