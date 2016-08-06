package service;

import java.sql.Connection;

import dao.LoginDAO;
import entity.Customer;
import util.ConnectionFactory;

public class LoginService {
         ConnectionFactory factory=ConnectionFactory.getFactory();
         Connection conn=factory.getConn();
         LoginDAO loginDAO=new LoginDAO();
         public boolean login(Customer c)
         {
        	boolean isValidated=false;
			try {
				isValidated = loginDAO.login(conn, c);
				return isValidated;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return isValidated;
         }
}
