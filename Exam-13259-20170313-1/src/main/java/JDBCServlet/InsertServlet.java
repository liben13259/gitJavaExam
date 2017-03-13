package JDBCServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JDBCEntity.Message;
import JDBCService.checkService;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private checkService cs = new checkService();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
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
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String name = request.getParameter("name");
		Message msg = new Message();
		if(title == "" || description == "" || name == ""){
			msg.setMsg("不能为空!");
			RequestDispatcher rd = request.getRequestDispatcher("msg_select.jsp");
			rd.forward(request, response);
			return;
		}
		cs.insert(title, description, name);
		RequestDispatcher rd = request.getRequestDispatcher("msg_success.jsp");
		rd.forward(request, response);
	}

}
