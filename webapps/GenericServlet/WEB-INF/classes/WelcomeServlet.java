import javax.servlet.*;
import java.io.*;
public class  WelcomeServlet extends GenericServlet
{
			public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
			{
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				out.println("<html><body><h1><center>");
				out.println("<font size='10' color='red'>");
				out.println("<marquee>");
				out.println("WELCOME TO SERVLET");
				out.println("<br><br><strong><i>");
				out.println("WELCOME PRATIK");
				out.println("</i></strong></marquee></font>");
				out.println("</center></h1></body></html>");
			}

}
