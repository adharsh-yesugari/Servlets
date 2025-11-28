package com.requestdispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class RequestDispatcherForwardInclude extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Controller in First Servlet");
        String userName = request.getParameter("userName");
        String userCity = request.getParameter("userCity");
        RequestDispatcher rd = request.getRequestDispatcher("/secondServlet");
        HttpSession session = request.getSession();
        session.setAttribute("userName", userName);
        session.setAttribute("userCity", userCity);
        rd.forward(request, response);
        PrintWriter writer = response.getWriter();
        writer.println("<h1> First Servlet</h1>");
    }
}
