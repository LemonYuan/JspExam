package servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Film;
import service.FilmService;

/**
 * Servlet implementation class GetAllFilmsServlet
 */
public class GetAllFilmsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       FilmService filmService=new FilmService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllFilmsServlet() {
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
		ResultSet rs=filmService.getAllFilms();
		List<Film> list=new ArrayList<Film>();
		int i=0;
		try {
			while(rs.next())
			{
				Film film=new Film();
				film.setFilm_id(rs.getShort(1));
				film.setTitle(rs.getString(2));
				film.setDescription(rs.getString(3));
				film.setLanguage(rs.getString(4));
				list.add(film);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("结果有："+list.size());
		if(rs!=null)
		{
            request.setAttribute("films", list);
			RequestDispatcher rd=request.getRequestDispatcher("3/show_films.jsp");
			rd.forward(request, response);
		}
	}

}
