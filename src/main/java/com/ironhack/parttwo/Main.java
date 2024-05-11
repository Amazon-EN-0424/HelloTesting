package com.ironhack.parttwo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        int[] myArray = {1, 2};

//        System.out.println(myArray[3]);

//        try {
//            FileReader fr = new FileReader("hello.txt");
//        } catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }

        try {
            hello("");
        } catch (NameEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void hello(String name) {
        if (name.isEmpty()){
            throw new NameEmptyException("Name cannot be empty");
        } else {
            System.out.println("Hello " + name);
        }
    }
}
