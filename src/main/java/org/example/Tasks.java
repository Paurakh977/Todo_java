package org.example;

import models.Todos;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    public static void ask(String Usernname) throws SQLException {
        Scanner sc=new Scanner(System.in);
        List <String> tasks=new ArrayList<>();
        List <String> task_description=new ArrayList<>();
        System.out.println("How many Tasks do you want to enter?");
        int no_of_tasks= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < no_of_tasks; i++) {
            System.out.println("Title of you Task "+(i+1));
            String title= sc.nextLine();
            tasks.add(title);
            System.out.println("Description:");
            String desc= sc.nextLine();
            task_description.add(desc);
        }
        Todos t1=new Todos(tasks,task_description,Usernname);

        t1.insertTasks();

    }
}
