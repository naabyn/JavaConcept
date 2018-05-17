package com.company;

import javax.xml.soap.Detail;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayString {
    Scanner scanner =new Scanner(System.in);



    public void ArraysString(){
        ArrayList<com.company.Detail> element=new ArrayList<>();
        for (int i=0;i<1;i++){
            com.company.Detail detail=getMyDetail();
            element.add(detail);

               }
        
        for(com.company.Detail arrayString: element){
            System.out.println(arrayString.getAddress().toString());
            System.out.println(arrayString.getAddress().toString());
            //System.out.println(element.size());
            System.out.println(element.contains("nabin"));
        }
    }

    public com.company.Detail getMyDetail() {
        com.company.Detail detail = new com.company.Detail();
        System.out.println("Enter Name");
        detail.setName(scanner.next());
        System.out.println("Enter address");
        detail.setAddress(scanner.next());
        return detail;

    }


}
