package callingprogrammesjava;
/* 17.  Write a Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101 */

public class Programme17 {
    public static void main(String[] args) {
        int d = 5;
        String abc =Integer.toBinaryString(d);
        System.out.println(abc);
    }

}
