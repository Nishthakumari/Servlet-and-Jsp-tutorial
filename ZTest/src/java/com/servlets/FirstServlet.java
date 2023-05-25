/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
public class FirstServlet implements Servlet{

    
    ServletConfig conf;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.conf = config;
        System.out.println("creating objects....");
        
    }


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is my output from servlet method</h1>");
        
    }
    
      
    @Override
    public void destroy(){
        System.out.println("going to destroy servlet object");
        
    }
    
    //non-lifecycle method
    @Override
    public ServletConfig getServletConfig(){
        return this.conf;
    }
      
    @Override
    public String getServletInfo(){
        return "This servlet is created by Nishtha Kumari";
    }
    
}
