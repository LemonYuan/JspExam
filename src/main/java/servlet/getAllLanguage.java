package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LanguageService;

/**
 * Servlet implementation class getAllLanguage
 */
public class getAllLanguage extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private LanguageService languageService=new LanguageService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAllLanguage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List l=languageService.getLanguageList();
		request.setAttribute("languages", l);
		RequestDispatcher rd=request.getRequestDispatcher("3/insert.jsp");
		rd.forward(request, response);
	}

}
