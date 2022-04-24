package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // test add new element
//      CustomStack1 customStack1 = new CustomStack1();
//      customStack1.add("123");
//      customStack1.add("321");
//        System.out.println(customStack1);

        // test resize array
//        CustomStack1 customStack1 = new CustomStack1();
//        for (Integer i = 0; i < 10; i++) {
//            customStack1.add(i);
//        }
        CustomStack1 customStack1 = new CustomStack1();
        Object b = new Object();
        b = "2";
        for (Integer i = 0; i < 5; i++) {
            customStack1.add(i);
        }
        customStack1.add("2");
        customStack1.get(b);
    }
}
