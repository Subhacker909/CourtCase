package com.servlets;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class save extends HttpServlet {
    public void init(ServletConfig con)
    {
    
}
    public void doPost(HttpServletRequest request, HttpServletResponse response)
     {
         PrintWriter out=null;
        try{
         response.setContentType("text/html");
         out=response.getWriter();
         String bar=request.getParameter("bar");
         String fname=request.getParameter("fname");
         String lname= request.getParameter("lname");
         String gender=request.getParameter("gender");
          String dob=request.getParameter("dob");
           String mobile=request.getParameter("mobile");
           String aadhaar=request.getParameter("aadhaar");
           String email=request.getParameter("email");
           String pan=request.getParameter("pan");
           String address=request.getParameter("address");
           String city=request.getParameter("city");
           String pin=request.getParameter("pin");
           String state=request.getParameter("state");
           
           if(bar.length()==7) 
           {
               Class.forName("com.mysql.jdbc.Driver");
              Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/court_case","root","root");
              Statement st=c.createStatement();
              st.executeUpdate
 ("insert into lawyer_details(bar,fname,lname,gender,dob,mobile,aadhaar,email,pan,address,city,pin,state) values('"+bar+"','"+fname+"','"+lname+"','"+gender+"','"+dob+"','"+mobile+"','"+aadhaar+"','"+email+"','"+pan+"','"+address+"','"+city+"','"+pin+"','"+state+"')");
               out.println("<script type=\"text/javascript\">");  
                  out.println(" alert(' Saved Successfully');");  
                  out.println("</script>");
                  out.close();
               
           }
           else
           {
               response.sendRedirect("home.html");
                  out.close();
           }
                  
        }catch(Exception e)
        {
            out.print(e);
        }
         
         
         
    }
    }  

