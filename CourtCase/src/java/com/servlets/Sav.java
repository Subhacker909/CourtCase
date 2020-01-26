package com.servlets;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Sav extends HttpServlet {
    public void init(ServletConfig con)
    {
    
}
    public void doGet(HttpServletRequest request, HttpServletResponse response)
     {
         PrintWriter out=null;
        try{
            out=response.getWriter();
              response.setContentType("text/html"); 
              out.print("Saved");
              response.sendRedirect("page11step2.html");
                  
        }catch(Exception e)
        {
            out.print(e);
        }
         
     }
}

