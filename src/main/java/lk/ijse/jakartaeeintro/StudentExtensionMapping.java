package lk.ijse.jakartaeeintro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "*.student")
public class StudentExtensionMapping extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Context Path: " + req.getServletPath());
        System.out.println("Served Path: " + req.getServletPath());
        System.out.println("PathInfo: " + req.getPathInfo());
    }
}
