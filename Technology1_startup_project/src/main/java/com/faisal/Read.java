package com.faisal;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Read extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            Scanner s = new Scanner(new File("/Users/jasperhessellund/IdeaProjects/Technology1_startup_project/web/WEB-INF/users.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Using POST Method to Read Form Data";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>Username</b>: "
                + request.getParameter("username") + "\n" +
                "  <li><b>Password</b>: "
                + request.getParameter("password") + "\n" +
                "</ul>\n" +
                "</body></html>");



    }

}