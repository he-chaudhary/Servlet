package com.hh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/add")
public class AddServlet extends HttpServlet{
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i+j;
//		
//		PrintWriter out = res.getWriter();
//		
//		out.println("result is "+ k);
//		
//	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
//		k *=k;
		
		
		
		
//		Cookie cookie = new Cookie("k",k+"");
//		res.addCookie(cookie);
//		
//		
////		HttpSession session = req.getSession();
////		session.setAttribute("k", k);
//		
//		res.sendRedirect("sq");
		
		
//		req.setAttribute("k", k);
		PrintWriter out = res.getWriter();
		
		out.println("<html><body bgcolor='cyan'>");
		out.println("Output : "+k);
		out.println("</body></html>");
////		
//		out.println("result is "+ k);
//		
//		
//		//Req dispatcher and redirect
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req,res);
		
	}
}
