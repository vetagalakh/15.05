package com.company;

import files.exception.SimpleException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void strreview(String str) {

        String s = null;

        try
        {
            String strArr[] = str.split(" ");
            int numArr[] = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                numArr[i] = Integer.parseInt(strArr[i]);
                // System.out.println(numArr[i]);
            }
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }

        Triangle ObjectName = new Triangle();

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
