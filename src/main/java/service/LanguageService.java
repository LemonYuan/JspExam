package service;

import java.sql.Connection;
import java.util.List;

import dao.LanguageDAO;
import util.ConnectionFactory;

public class LanguageService {
    private LanguageDAO languageDAO=new LanguageDAO();
    ConnectionFactory factory=ConnectionFactory.getFactory();
    Connection conn=factory.getConn();
    public List getLanguageList(){
    	List list=null;
		try {
			list = languageDAO.getLanguage(conn);
			System.out.println("查出的list有："+list.size());
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return list;
    }
}
