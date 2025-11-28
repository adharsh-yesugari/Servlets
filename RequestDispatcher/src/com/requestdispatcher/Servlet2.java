package com.requestdispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/secondServlet")
public class Servlet2 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        String name = (String)session.getAttribute("userName");
        String city = (String)session.getAttribute("userCity");
        PrintWriter writer = response.getWriter();
        writer.println("<h1> Second Servlet</h1>");
        writer.println("<h1> Hi " + name + "</h1>");
        writer.println("<h1> You are from " + city + "</h1>");

    }

}
