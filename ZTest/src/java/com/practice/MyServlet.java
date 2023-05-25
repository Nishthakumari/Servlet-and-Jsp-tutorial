/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet {
   
    @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
       
       System.out.println("this is get method ..........");
       
       response.setContentType("text/html");
       
        PrintWriter out = response.getWriter();
        out.println("<h1> This is get method of myservlet</h1>");
   }
    
}
