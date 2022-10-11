package callingprogrammesjava;

/* 15. Write a Java program to swap two variables. */


import java.util.Scanner;

public class Programme15 {
public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number a:");
    int a = sc.nextInt();
    System.out.println("Enter second number b:");
    int b= sc.nextInt();
    int c;
    c=a;
    a=b;
    b=c;
    System.out.println("Swapped values are:" +" a:" +a+" b:" +b);



}


}
