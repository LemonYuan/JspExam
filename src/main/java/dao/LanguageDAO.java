package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Language;

public class LanguageDAO {
    public List getLanguage(Connection conn)throws Exception{
    	Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select language_id,name from language");
        System.out.println("DAO层结果："+rs.toString());
        List list=new ArrayList<Language>();
        while(rs.next())
        {
        	Language l=new Language();
        	l.setLanguage_id(rs.getInt(1));
        	l.setName(rs.getString(2));
        	list.add(l);
        }
        return list;
    }
}
