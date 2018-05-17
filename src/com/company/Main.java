package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EqualityArray equalityArray= new EqualityArray();
       // equalityArray.equalityofarray();

        Reverse reverse = new Reverse();
        //reverse.reversestring();

        ArrayString arrayString=new ArrayString();
        arrayString.ArraysString();

        Intersection intersection =new Intersection();
       // intersection.commonelement();

        String[] element = {"nabin", "sabrin", "prashant", "nabin", "sabrin", "rajim"};

        for (int i = 0; i < element.length-1; i++)
        {
            for (int j = i+1; j < element.length; j++)
            {
                if( (element[i].equals(element[j])) && (i != j) )
                {
                    System.out.println("Duplicate String is: "+element[j]);
                }
            }
        }
    }
}
