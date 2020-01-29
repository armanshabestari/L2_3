package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nPlease enter your full name");
        System.out.println("\t*Example (alikarami)*");
        Scanner in=new Scanner(System.in);
        String name;
        name=in.next();
        if (name.equals("armandizaji")){
            System.out.println(name);
            stu student=new stu();
            student.course();
            student.average();
            student.years();
        }
        else{
            System.out.println("\nERROR!");
        }
    }
}
