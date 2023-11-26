package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Todo_NotesTaker;
import com.helper.FactoryProvider;

public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveNoteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// title,content fetch
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			Todo_NotesTaker Todo_NotesTaker = new Todo_NotesTaker(title, content, new Date());
			System.out.println(Todo_NotesTaker.getId() + " : " + Todo_NotesTaker.getTitle());
			// hibernate:save()
//			Session s = FactoryProvider.getFactory().openSession();
//			Transaction tx = s.beginTransaction();
//			s.save(Todo_NotesTaker);
//			tx.commit();
//			s.close();
//			response.setContentType("text/html");
//			PrintWriter out=response.getWriter();
//			out.println("<h1 style='text-align:center;'>Todo_NotesTaker is added successfully</h1>");
//			out.println("<h1 style='text-align:center;'><a href='all_Todo_NotesTakers.jsp'>View all Todo_NotesTakers</a></h1>");


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
