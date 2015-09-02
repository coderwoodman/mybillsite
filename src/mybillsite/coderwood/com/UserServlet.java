package mybillsite.coderwood.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {

	// init method
	public void init() throws ServletException {
		System.out.println("init method is runing!");
	}

	// get method
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get method is runing!");
		PrintWriter out = response.getWriter();
		out.println("get method");
	}

	// post method
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post method is runing!");
		PrintWriter out = response.getWriter();
		out.println("post method");
	}
	
	//destroy method
	public void destroy(){
		super.destroy();
		System.out.println("destroy method is running");
	}	

}
