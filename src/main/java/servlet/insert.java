package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Film;
import service.FilmService;

/**
 * Servlet implementation class insert
 */
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private FilmService filmService=new FilmService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert() {
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
		    String title=(String) request.getParameter("title");
		    String description=(String) request.getParameter("description");
		    int language_id=Integer.parseInt(request.getParameter("language").toString());
		    Film film=new Film();
		    film.setTitle(title);
		    film.setDescription(description);
		    film.setLanguage_id(language_id);
		    boolean b=filmService.insertFilm(film);
		    if(b)
		    {
		    	response.sendRedirect("3/error.jsp");
		    }
		    else
		    {
		    	response.sendRedirect("3/success.jsp");
		    }
	}

}
