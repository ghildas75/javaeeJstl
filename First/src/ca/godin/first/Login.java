package ca.godin.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("user");
		String pass=  request.getParameter("pass");
		System.out.println("user = "+user +" pass= "+pass);
		if(user==null) user="";
		if(pass==null) pass="";
		System.out.println("user = "+user +" pass= "+pass);
		response.setContentType("text/html");
	try (PrintWriter out=response.getWriter()){
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> first servelet </title>");
		out.println("<link rel='stylesheet' href='style.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> please connect</h1>");
		out.println("<h2>"+new Date()+"</h2>");
		
		out.println("<form method='post' action='login'>");
		out.println("<label for='user'> login</label>");
		out.println("<input type='text'  id='user' name='user' value='"+user+"' autofocus><br><br>");
		out.println("<label for='pass'> password</label>");
		out.println("<input type='password'  id='pass' name='pass' value='"+pass+"'><br><br>");
		out.println("<input type='submit'value='submit'>");
		
		
	}
	
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		if(user.equals("user") &&pass.equals("pass")) {
			response.setContentType("text/html");
			try (PrintWriter out=response.getWriter()){
			out.println("yes");
			
		}
			
		}
		else {doGet(request, response);}
	}

}
