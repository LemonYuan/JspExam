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
	   PreparedStatement st=conn.prepareCall("insert into film(title,description,language_id,rental_duration,rental_rate,replacement_cost,last_update)"
	   		+ "values(?,?,?,?,?,?,?)");
       st.setString(1, film.getTitle());
       st.setString(2, film.getDescription());
       st.setInt(3, film.getLanguage_id());
       st.setByte(4, (byte) 6);
       st.setInt(5,1);
       st.setDouble(6,20.99);
       st.setDate(7,new Date(0));
       ResultSet rs=st.executeQuery();
       return rs.next();
   }
	public boolean delete(Connection conn, Film f) throws SQLException{
		PreparedStatement st=(PreparedStatement) conn.prepareCall("delete from film where id=?");
		st.setShort(1,f.getFilm_id());
		return st.execute();
	}
} 
