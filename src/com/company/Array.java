package com.company;

import java.util.ArrayList;

public class Array {
    public void ArrayList() {

        ArrayList<String> element = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            element.add("i");
        }

        ArrayList<String> element1 = new ArrayList<>();
        for (int j = 51; j < 100; j++) {
            element.add("j");
        }
        ArrayList<String> element2 = new ArrayList<>();

            element2.addAll(element);
            element2.addAll(element1);
        System.out.println(element2);
        }


    }


