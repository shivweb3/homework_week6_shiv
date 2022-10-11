package callingprogrammesjava;

/* 10. Write a Java program that takes a number as input and prints its
multiplication table up to 10. */

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any number");
        int z = s.nextInt();
        int a = z*1;
        System.out.println(z+ "*1=" +a);

        int b = z*2;
        System.out.println(z+ "*2=" +b);

        int c = z*3;
        System.out.println(z+ "*3=" +c);

        int d = z*4;
        System.out.println(z+ "*4=" +d);

        int e = z*5;
        System.out.println(z+ "*5=" +e);

        int f = z*6;
        System.out.println(z+ "*6=" +f);

        int g = z*7;
        System.out.println(z+ "*7=" +g);

        int h = z*8;
        System.out.println(z+ "*8=" +h);

        int i = z*9;
        System.out.println(z+ "*9=" +i);

        int j = z*10;
        System.out.println(z+ "*10=" +j);



    }






}
