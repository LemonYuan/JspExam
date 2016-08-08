package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FilterOne
 */
public class FilterOne implements Filter {

    /**
     * Default constructor. 
     */
    public FilterOne() {
     System.out.println("=======this is constructor=======");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("=====this is destroy method=====");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
         System.out.println("=====this is dofilter method=====");
		 Object user=request.getAttribute("user");
//		 if(user==null)
//		 {
//			 response.
//		 }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("=======這裡是init方法========");
	}

}
