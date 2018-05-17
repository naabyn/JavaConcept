package com.company;

import java.util.HashSet;

public class Intersection {

    public void commonelement() {
        String[] s1 = {"nabin", "sabrin", "prashant", "rajim"};

        String[] s2 = {"avishek", "chandan", "rajim", "arjun", "bibek"};

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < s1.length; i++)
        {
            for (int j = 0; j < s2.length; j++)
            {
                if(s1[i].equals(s2[j]))
                {
                    set.add(s1[i]);
                }
            }
        }

        System.out.println("The common element is "+set);
    }
}
