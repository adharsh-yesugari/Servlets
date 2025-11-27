package main.com.servletlifecycle;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lifeCycle")
public class LifeCycleServlet extends HttpServlet {
    static {
        System.out.println("Servlet is loaded");
    }

    public LifeCycleServlet() {
        System.out.println("Class object is created");
    }
    public void init(ServletConfig con) throws ServletException{
        System.out.println("Servlet method is created internally");
    }
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       System.out.println("Post method is created to add users into the servlet");
    }
    public void destroy(){
        System.out.println("Destroy method is called at last to destroy the servlet");
    }
}
