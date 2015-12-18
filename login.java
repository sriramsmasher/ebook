package org.me.webapps.bookstore;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
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
		try
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String u=request.getParameter("na");
			String p=request.getParameter("pa");
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bookdb", "root", "root" );

			 PreparedStatement titlesQuery = connection
					.prepareStatement("SELECT * from register where uname=? and pwd=?");
			 titlesQuery.setString(1, u);
			 titlesQuery.setString(2, p);
			 ResultSet rs=titlesQuery.executeQuery();
			 if(rs.next())
			 {
				 RequestDispatcher rd=request.getRequestDispatcher("index.html");
				 rd.forward(request, response);
				
			 }
			 else
			 {
				 RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				 rd.include(request, response);
			 }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
