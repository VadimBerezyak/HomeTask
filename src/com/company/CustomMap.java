package com.company;

public class CustomMap {
    private CustomStack1 keyStack;
    private  CustomStack1 valueStack;


    public CustomMap() {
        keyStack = new CustomStack1();
        valueStack = new CustomStack1();
    }

    public void get2(Object key){
        int index = keyStack.get(key);        // переделать методы из void --> int
        Object value = valueStack.get(index); // переделать методы из void --> Object
        System.out.println(value);
    }

    public void pop2(Object key){
        int index = keyStack.get(key);
        valueStack.pop(index);
        keyStack.pop(index);
    }

    public void put(Object key, Object value){
        keyStack.add(key);
        valueStack.add(value);
    }

}
