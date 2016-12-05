package com.faisal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Add extends HttpServlet{

    private static Logger logger = Logger.getLogger(Add.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        logger.log(Level.INFO,request.getParameter("comments"));

        try {

            File file = new File("/Users/jasperhessellund/IdeaProjects/Technology1_startup_project/src/main/java/com/faisal/Comments.txt");



            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            logger.log(Level.INFO, file.getAbsoluteFile().toString());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(request.getParameter("comments"));
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
