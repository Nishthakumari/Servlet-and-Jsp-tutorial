/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
        
        
public class RegisterServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Welcome to register servlet</h1>");
        
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        
        String cond = req.getParameter("condition");
        
        if(cond!=null){
        if(cond.equals("checked"))
        {
            out.println("<h2> Name " + name +  "</h2>");
            out.println("<h2> Email " + email +"</h2>");
            out.println("<h2> Password " + password + "</h2>");
            out.println("<h2> Gender " + gender+ "</h2>");
            out.println("<h2> Course " + course + "</h2>");
            
            RequestDispatcher rd = req.getRequestDispatcher("success");
            rd.forward(req, resp);
            
        }else{
            out.println("<h1>You have not accepted terms and conditions.");
        }
        }else{
            out.println("<h1>You have not accepted terms and conditions.");
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            rd.include(req, resp);
        }
               
    }
    
    
}
