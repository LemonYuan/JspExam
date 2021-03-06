package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Film;
import service.FilmService;

/**
 * Servlet implementation class DeleteFilm
 */
public class DeleteFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  FilmService filmService=new FilmService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFilm() {
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
		Film film =new Film();
		int i= Integer.parseInt(request.getParameter("film_id"));
		film.setFilm_id(i);
		try {
			filmService.deleteFilm(film);
			response.sendRedirect("3/success.jsp");
		} catch (Exception e) {
			response.sendRedirect("3/error.jsp");
		}
	}

}
