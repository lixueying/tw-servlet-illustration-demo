package com.thoughtworks.webrecap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");

        PrintWriter out = response.getWriter();

        if (userName == null) {
            out.println("<h1>Please specify a register username after the userName query parameter after url.</h1>");
        } else if (userName.equals("Congyu")) {
            out.println("<h1>" + "Hello " + userName + "!" + "</h1>");
        } else {
            out.println("<h1> Sorry, you can not register not under Congyu's name.</h1>");
        }
    }
}
