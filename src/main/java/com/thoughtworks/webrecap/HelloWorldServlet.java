package com.thoughtworks.webrecap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");

        PrintWriter out = response.getWriter();

        if (userName.equals("Congyu")) {
            out.println("<h1>" + "Hello " + userName + "!" + "</h1>");
        } else {
            out.println("<h1> Sorry, you can not register not under Congyu's name.</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
