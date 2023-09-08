package fr.nanterre.miage.fsr.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        if (name.equals(password)) {
            RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
            rd.forward(request, response);
        }
        else
            response.sendRedirect("index.html");
    }
}