package callingprogrammesjava;
/*
5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Programme5 obj = new Programme5();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = sc.nextInt();
        System.out.println("Print enter second number");
        int b = sc.nextInt();

        obj.addition(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);

    }

    public void addition(int a, int b) {
        System.out.println("Addition of two number is : " + (a + b));
    }
    public void subtraction(int a, int b) {
        int x = a - b;
        System.out.println("subtraction: " + x);
    }
    public void multiplication(int a, int b) {
        int z = +a * b;
        System.out.println("multiplication  : " + z);
    }
    public void division(int a, int b) {
        int u = +a / b;
        System.out.println("division  : " + u);
    }

}
