package com.demo;
import com.demo.Student;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet{
    ServletContext context=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=gb2312");
        String name=request.getParameter("name");
        String num=request.getParameter("num");
        Student student=new Student(name,num);
        context=getServletContext();
        context.setAttribute("Student",student);
        RequestDispatcher dispatcher=context.getRequestDispatcher("/secondServlet.do");
        dispatcher.forward(request,response);
    }
}
