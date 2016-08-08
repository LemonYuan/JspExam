package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.FilmDAO;
import entity.Film;
import util.ConnectionFactory;

public class FilmService {
	 ConnectionFactory factory=ConnectionFactory.getFactory();
     Connection conn=factory.getConn();
     FilmDAO filmDAO=new FilmDAO();
     
      public ResultSet getAllFilms(){
    	 ResultSet rs=null;
		try {
			rs = filmDAO.getAllFilms(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return rs;
      }
      public boolean deleteFilm(Film f){
     	boolean b=false;
    	  try {
			return filmDAO.delete(conn, f);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	  return b;
       }
      public boolean insertFilm(Film f){
    	  boolean b=false;
    	  try {
    		  return filmDAO.insert(conn, f);
    	  } catch (SQLException e) {
    		  e.printStackTrace();
    	  } catch (Exception e) {
			e.printStackTrace();
		}
    	  return b;
      }
}
