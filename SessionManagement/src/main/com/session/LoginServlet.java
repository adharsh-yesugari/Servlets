package main.com.session;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Controller in login servlet");
        String name = request.getParameter("userName");
        String city = request.getParameter("userCity");
        RequestDispatcher rd = request.getRequestDispatcher("/loginServlet");
        HttpSession session = request.getSession();
        session.setAttribute(name, "name");
        session.setAttribute(city, "city");
        rd.forward(request, response);
    }
}
