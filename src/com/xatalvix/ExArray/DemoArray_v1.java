package com.xatalvix.ExArray;

public class DemoArray_v1 {
    public static void main(String[] args) {
        int[] arrayInt = {1,2,3,4,5,6,7,8,9,10};
        String[] arrayString = {"Чернова", "Елена", "Асаинов", "Ренат"};
        for (int arrayInt_i : arrayInt) {
            System.out.println(arrayInt_i);
        }
        for (String arrayString_s : arrayString) {
            System.out.println(arrayString_s);
        }
    }
}

