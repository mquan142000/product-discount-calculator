package com.example.productdiscountcalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductDiscountCalculator", value = "/calculate")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        double price = Double.parseDouble(request.getParameter("price"));
        double amount = Double.parseDouble(request.getParameter("percent"));
        double price1 = price * amount * 0.01;
        request.setAttribute("kqua",price1);
        request.getRequestDispatcher("ketqua.jsp").forward(request, response);
    }
}
