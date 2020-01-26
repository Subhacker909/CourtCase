package com.servlets;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet {
    public void init(ServletConfig con)
    {
    
}
    public void doPost(HttpServletRequest req, HttpServletResponse res)
     {
         PrintWriter out=null;
        try{
            out=res.getWriter();
              res.setContentType("text/html"); 
              String username=req.getParameter("uname");
              String pass=req.getParameter("pass");
              Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/court_case","root","root");
              Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from admin_login where username='"+username+"' and pass='"+pass+"'");
            if(rs.next())
            {
                  out.println("<script type=\"text/javascript\">");  
                  out.println(" alert('Login Successfully');");  
                  out.println("</script>");
                RequestDispatcher rd=req.getRequestDispatcher("page-5.html");
                rd.include(req, res);
                out.close();
                    
            } 
            else
            {
               
                  out.println("<script type=\"text/javascript\">");  
                  out.println(" alert('Invalid Login');");  
                  out.println("</script>");
                  
                  RequestDispatcher rd=req.getRequestDispatcher("index.html ");
                rd.include(req, res);
                  
                out.close();
                
            }
        }catch(SQLException e)
        {
            out.print(e);
        }
     catch(Exception e)
        {
            out.print(e);
            
        }
    }

    

}
