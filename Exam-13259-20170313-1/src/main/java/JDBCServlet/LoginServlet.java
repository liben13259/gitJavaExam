package JDBCServlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JDBCEntity.Message;
import JDBCService.checkService;

/**
 * Servlet implementation class ServletLogin
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private checkService cs = new checkService(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String firstName = request.getParameter("firstName");
		Message msg = new Message();
		if(firstName == ""){
			msg.setMsg("用户名为空");
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
			return;
		}
		
		boolean flag = cs.find(firstName);
		if(flag){
			msg.setMsg("登陆成功");
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
			HttpSession session = request.getSession();
			session.setAttribute("firstName", firstName);
			return;
		}else{
			msg.setMsg("用户名错误");
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
			System.out.println(msg);
			return;
		}
		
	}

}
