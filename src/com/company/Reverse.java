package com.company;

import java.util.Scanner;

public class Reverse {
    public void reversestring() {
        String name;
        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        StringBuffer sb = new StringBuffer(name);

        System.out.println(sb.reverse());
    }
}
