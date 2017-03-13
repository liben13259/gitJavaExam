//package JDBCFiler;
//
//import java.io.IOException;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
///**
// * Servlet Filter implementation class CheckLoginFilter
// */
//public class CheckLoginFilter implements Filter {
//
//    /**
//     * Default constructor. 
//     */
//    public CheckLoginFilter() {
//    }
//
//    /**
//	 * @see Filter#init(FilterConfig)
//	 */
//	public void init(FilterConfig fConfig) throws ServletException {
//		
//	}
//	
//	/**
//	 * @see Filter#destroy()
//	 */
//	public void destroy() {
//	}
//
//	/**
//	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
//	 */
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		HttpServletRequest req = (HttpServletRequest)request;
//		HttpServletResponse resp = (HttpServletResponse)response;
//		HttpSession session = req.getSession();
//		if(session.getAttribute("firstName") == "" ||session.getAttribute("firstName") == null){
//			resp.sendRedirect("login.jsp");
//		}
//		chain.doFilter(request, response);
//	}
//
//
//}
