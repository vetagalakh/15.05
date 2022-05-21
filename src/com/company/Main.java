package com.company;

import files.exception.SimpleException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void strreview(String str) {

        String s = null;

        int[] numArr;
        try {
            String strArr[] = str.split(" ");
            numArr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                numArr[i] = Integer.parseInt(strArr[i]);
                Triangle ObjectName = new Triangle();
                ObjectName.a.x = numArr[0];
                ObjectName.a.y = numArr[1];
                ObjectName.b.x = numArr[2];
                ObjectName.b.y = numArr[3];
                ObjectName.c.x = numArr[4];
                ObjectName.c.y = numArr[5];
                ObjectName.square();
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }



    }
    public static void main(String[] args) throws SimpleException {


        String input = "./resources/input.txt";
        SimpleFileReader reader = new SimpleFileReader();
        List<String> list;


        try {
            list = reader.readALL(input);
            for (String string : list) {

                strreview(string);

            }
        } catch (SimpleException e) {
            throw new SimpleException("Exception in Main", e);
        }


    }
}
