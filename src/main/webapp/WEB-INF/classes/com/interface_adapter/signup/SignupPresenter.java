package com.interface_adapter.signup;

import com.use_case.signup.SignupOutputBoundary;
import com.use_case.signup.SignupOutputData;
import com.view.SignupServlet;

import java.io.IOException;

public class SignupPresenter implements SignupOutputBoundary {
    SignupServlet signupServlet;

    public SignupPresenter(SignupServlet signupServlet) {
        this.signupServlet = signupServlet;
    }

    @Override
    public void execute(SignupOutputData outputData) {
        try {
            signupServlet.sendToProfileScreen(outputData);
        } catch (IOException e) {
            System.out.println("Error in sending user to ProfileScreen");
        }
    }
}