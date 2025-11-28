package main.com.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class ServletToDispatch extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Controller in Second Servlet");
        HttpSession session = request.getSession(false);
        String name = (String)session.getAttribute("name");
        String city = (String)session.getAttribute("city");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Response from Second Servlet</h1>");
        writer.println("<h1> You name is " + name + "</h1>");
        writer.println("<h1> You are from " + city + "</h1>");

    }
}
