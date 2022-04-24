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
        CustomStack1 customStack1 = new CustomStack1();
        for (Integer i = 0; i < 50; i++) {
            customStack1.add(i);
        }
        customStack1.pop(2);
        customStack1.pop(48);

    }
}
