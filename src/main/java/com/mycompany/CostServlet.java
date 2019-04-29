/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class CostServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String priceAsString=request.getParameter("price");
        String kgAsString=request.getParameter("kg");
        
        int price=Integer.parseInt(priceAsString);
        double kg=Double.parseDouble(kgAsString);
        
        double cost=price*kg;
        
        PrintWriter printWriter=response.getWriter();
        printWriter.write("<h1>Cost:</h1>");
        printWriter.write("<h2>"+cost+"</h2>");
    }

}
