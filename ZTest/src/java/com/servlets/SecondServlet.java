/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Nishtha
 */
public class SecondServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("this is servlet created from Generic Servlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>this is generic servlet</h1>");
    }
    
    
}
