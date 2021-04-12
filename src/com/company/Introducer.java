package com.company;

import java.util.Scanner;

public class Introducer {

    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
System.out.print ("Please write your name: ");
String Name = in.nextLine();
System.out.println("Hello, " + Name);
in.close();
    }
}



