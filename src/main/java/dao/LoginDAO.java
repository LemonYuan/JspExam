package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.Customer;

public class LoginDAO {
         public boolean login(Connection conn,Customer c)throws Exception{
        	 PreparedStatement st=conn.prepareCall("select * from customer where first_name=?");
             st.setString(1, c.getFirst_name());
             ResultSet rs=st.executeQuery();
             if(rs.next())
             {
            	 return true;
             }
             else
             {
            	 return false;
             }
         }
}
