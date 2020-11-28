package com.demo;
import com.demo.Student;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=gb2312");
        ServletContext context=getServletContext();
        Student student=(Student) context.getAttribute("Student");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("学号："+student.getSno()+"<br>");
        out.println("姓名："+student.getName()+"<br>");
        out.println("<a href=/bookstore_war_exploded/html/input.html>回到输入界面</a>");
        out.println("</body></html>");
    }
}

