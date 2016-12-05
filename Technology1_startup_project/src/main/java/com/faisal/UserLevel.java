package com.faisal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class UserLevel {

    public int level(String username, String password) throws FileNotFoundException {

        Scanner s = new Scanner(new File("/Users/jasperhessellund/IdeaProjects/Technology1_startup_project/web/users.txt"));

        while(s.hasNext()) {

            String usernameFromFile = s.next();
            String passwordFromFile = s.next();
            int isAdmin = s.nextInt();

            if(usernameFromFile.equals(username) && passwordFromFile.equals(password)) {
                if(isAdmin == 1) {
                    return 1;
                }

                return 0;
            }

        }

        return -1;

    }
}
