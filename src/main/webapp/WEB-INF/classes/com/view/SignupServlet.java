package com.view;

import com.interface_adapter.signup.SignupController;
import com.use_case.signup.SignupOutputData;
import com.app.SignupSetup;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SignupServlet extends HttpServlet {
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Perform data retrieval or processing here

        // Set the variables as request attributes

        // Send user to the next page

        // TODO: old. but new not implemented yet
        response.sendRedirect("signup.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // save the request and response for use later in
        // sendToProfileScreen and signupFailed
        this.request = request;
        this.response = response;

        // get the username password and repeatedPassword from the input
        // fields in the jsp file.
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repeatedPassword = request.getParameter("repeated password");

        // Initialize the loop for the use_case
        SignupController controller = SignupSetup.setup(this);

        // call the SignupController passing it the inputs
        controller.execute(username, password, repeatedPassword);
    }

    public void sendToProfileScreen(SignupOutputData outputData) throws IOException {
        // get the session to change the data on
        HttpSession session = request.getSession();

        // sets the username field on the jsp
        session.setAttribute("username", outputData.getUsername());

        // Redirect to the user profile page
        response.sendRedirect("profile.jsp");
    }

    public void signupFailed(SignupOutputData outputData) throws IOException {
        // TODO: not implemented yet
        response.sendRedirect("signup.jsp");
    }

}

