package com.servlets;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class addcase extends HttpServlet {
    public void init(ServletConfig con)
    {
    
}
    public void doPost(HttpServletRequest req, HttpServletResponse res)
     {
         PrintWriter out=null;
        try{
            out=res.getWriter();
              res.setContentType("text/html"); 
              String casenum=req.getParameter("casenum");
              String type=req.getParameter("type");
               String hear=req.getParameter("hear");
               String cname=req.getParameter("cname");
                String aadhaar=req.getParameter("aadhaar");
                 String address=req.getParameter("address");
                  String summary=req.getParameter("summary");
               Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/court_case","root","root");
              Statement st=c.createStatement();
             int b=st.executeUpdate("insert into addcase_details( casenum,type,hear,aadhaar,address,summary,cname)values('"+casenum+"','"+type+"','"+hear+"','"+aadhaar+"','"+address+"','"+summary+"','"+cname+"')");
           if(b==1)
           {
             out.println("<script type=\"text/javascript\">");  
                  out.println(" alert(' New Case Added Successfully');");  
                  out.println("</script>");
                 
           }
           else
           { out.println("<script type=\"text/javascript\">");  
                  out.println(" alert('Enter Unique Case ID');");  
                  out.println("</script>");
               
           }
             
            out.close();
               
        }
     catch(Exception e)
        {
            out.print(e);
            
        }
    }

    

}


