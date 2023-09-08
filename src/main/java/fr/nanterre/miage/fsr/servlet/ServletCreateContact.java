package fr.nanterre.miage.fsr.servlet;

import fr.nanterre.miage.fsr.services.ServiceContact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletCreateContact", value = "/ServletCreateContact")
public class ServletCreateContact extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long idContact =Long.parseLong(request.getParameter("idContact"));
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String email=request.getParameter("email");

        ServiceContact sc=new ServiceContact();
        sc.createContact(idContact, fname, lname, email);
    }
}