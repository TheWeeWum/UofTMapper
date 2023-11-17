package com.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BuildingsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Perform data retrieval or processing here
//        outputdata
        // Set the variables as request attributes
        HttpSession session = request.getSession();
        //session;
        // Send user to the next page
        response.sendRedirect("buildings.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // gets the username and password from the input fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // TODO: all of this needs to be changed to the clean architecture setup.

        // Create a session and store the username
        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        // Redirect to the user profile page (you can replace this URL)
        // TODO: send to the personal users page
        response.sendRedirect("profile.jsp");
    }
}