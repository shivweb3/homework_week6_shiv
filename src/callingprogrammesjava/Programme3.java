package callingprogrammesjava;

/*Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/

public class Programme3 {


    int a = 12; //first instance variable
    static int b = 99; //second instance variable


    public static void main(String[] args) {

        Programme3 obj = new Programme3();
        obj.method1();
        method2();


    }

    //instance method
    public void method1() {
        System.out.println(a);
        System.out.println(b);

    }
    //static method
    public static void method2() {
        Programme3 obj = new Programme3();
        System.out.println(obj.a);
        System.out.println(b);
    }

}
