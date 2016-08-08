package dao;

import java.sql.Connection;
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
   
   
   
   
   
	public void deleteFilm(Connection conn, Film f) throws SQLException{
		System.out.println("DAO film_id:"+f.getFilm_id());
		deleteFilm_Catagory(conn,f.getFilm_id());
		deleteFilm_Actor(conn,f.getFilm_id());
		deleteInventory(conn,f.getFilm_id());
		PreparedStatement st=conn.prepareCall("delete from film where film_id=?");
		st.setInt(1,f.getFilm_id());
		boolean b2=st.execute();
	}
	public void deleteFilm_Catagory(Connection conn, int film_id) throws SQLException{
		PreparedStatement st=conn.prepareCall("delete from film_category where film_id=?");
		st.setInt(1, film_id);
		boolean b=st.execute();
		System.out.println("category delete："+b);
	}
	public void deleteFilm_Actor(Connection conn,int film_id) throws SQLException{
		PreparedStatement st=conn.prepareCall("delete from film_actor where film_id=?");
		st.setInt(1, film_id);
		boolean b=st.execute();
		System.out.println("actor delete："+b);
	}
	public void deleteInventory(Connection conn, int film_id) throws SQLException{
		PreparedStatement st=conn.prepareCall("select inventory_id from inventory where film_id=?");
        st.setInt(1, film_id);
        ResultSet rs=st.executeQuery();
        while(rs.next())
        {
        	deleteRental(conn,rs.getInt(1));
        }
        st=conn.prepareCall("delete from inventory where film_id=?");
        st.setInt(1, film_id);
        boolean b=st.execute();
        System.out.println("inventory delete："+b);
	}
	public void deleteRental(Connection conn, int inventory_id) throws SQLException{
		PreparedStatement st=conn.prepareCall("select rental_id from rental where inventory_id=?");
        st.setInt(1, inventory_id);
        ResultSet rs=st.executeQuery();
        while(rs.next())
        {
        	deletePayment(conn,rs.getInt(1));
        }
        st=conn.prepareCall("delete from rental where inventory_id=?");
        st.setInt(1, inventory_id);
        boolean b=st.execute();
        System.out.println("retal delete："+b);
	}
	public void deletePayment(Connection conn, int rental_id) throws SQLException{
		PreparedStatement st=conn.prepareCall("delete from payment where rental_id=?");
	        st.setInt(1, rental_id);
	        boolean b=st.execute();
	        System.out.println("paymeny delete："+b);
	}
} 
