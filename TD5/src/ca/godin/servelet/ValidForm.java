package ca.godin.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidForm
 */
@WebServlet("/ValidForm")
public class ValidForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("index.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		if(user.equals("admin") &&pass.equals("admin")) {
			response.sendRedirect("welecome.html");
			//this.getServletContext().getRequestDispatcher("/welcome.html").forward(request, response);
		}
		else {
			try(PrintWriter out=response.getWriter()){
			 out.println("error ");
			 RequestDispatcher rd=request.getRequestDispatcher("index.html");
			 rd.include(request,response);
				//doGet(request, response);	
		//request.setAttribute("error", "login invalid");
			
				//out.println("login invalid");
				
				
			}
			
			//this.getServletContext().getRequestDispatcher("index.html").forward(request, response);
		};
	}

}
