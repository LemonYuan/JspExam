package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.Film;



public class FilmDAO {
    public ResultSet getAllFilms(Connection conn)throws Exception
    {
    	 Statement st=conn.createStatement();
         ResultSet rs=st.executeQuery("select f.film_id,f.title,f.description,l.name from film f,language l where  f.language_id=l.language_id");
         System.out.println("DAO层结果："+rs.toString());
         if(rs.next())
         {
        	 return rs;
         }
         else
         {
        	 return null;
         }
    }
   public boolean insert(Connection conn ,Film film)throws Exception{
	   PreparedStatement st=conn.prepareCall("insert into film(title,description,language_id)"
	   		+ "values(?,?,?)");
       st.setString(1, film.getTitle());
       st.setString(2, film.getDescription());
       st.setInt(3, film.getLanguage_id());     
       boolean rs=st.execute();
       return rs;
   }
	public boolean delete(Connection conn, Film f) throws SQLException{
		PreparedStatement st=(PreparedStatement) conn.prepareCall("delete from film where id=?");
		st.setShort(1,f.getFilm_id());
		return st.execute();
	}
} 
