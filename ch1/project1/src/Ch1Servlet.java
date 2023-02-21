import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ch1Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
					HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println("<html>" +
				"<body>" + 
				"<h1 align=center>HF\'s Chapter 1 Servlet</h1>"
				+ "<br>" + today + "</body>" + "</html>");
		
	}

}
