package com.edu.spring.springboot;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user.do")
public class UserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws IOException{
		resp.getWriter().print("user servlet");
	}

}
