package com.company;

public class CustomStack1 {

    class Customnull {
    }

    Object[] array;
    private int lastindex;

    public CustomStack1() {
        this.array = new Object[10];
        this.lastindex = 0;
    }

    public void add(Object element) {
        if (lastindex == array.length) {
            resize();
        }
        this.array[lastindex] = element;
        this.lastindex++;
    }

    private void resize() {
        Object[] newArray = new Object[Math.round(array.length * 1.5f)];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void pop(int index) {
        if (index < 0 || index >= lastindex) {
            throw new IndexOutOfBoundsException();
        } else if (index == lastindex - 1) {
            array[index] = new Customnull();
            lastindex--;
        } else {
            for (int i = index; i < lastindex; i++) {
                array[i] = array[i + 1];
            }
            array[--lastindex] = new Customnull();
        }
    }

    public void popByValue(Object element) {
        for (int i = 0; i < lastindex; i++) {
            if (array[i].equals(element) || array[i] == null ) {
                pop(i);
            }

        }
    }

}