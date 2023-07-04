package learnjava;
// PascalConvention
// camelCodeConvention

// importing Scanner class
import java.util.Scanner;

public class Basics {
    public static void main(String args[]) {

        // // PART 1: TAKING USER INPUT
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // int a = sc.nextInt();
        // // float a = sc.nextFloat();
        // System.out.println("Enter number 2");
        // int b = sc.nextInt();
        // // float b = sc.nextFloat();

        // int sum = a + b;
        // // float sum = a + b;
        // System.out.println("The sum of these numbers is");
        // System.out.println(sum);
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        // // String str = sc.next();
        // String str = sc.nextLine();
        // System.out.println(str);
        // sc.close();

        // // PART 2: OPERATORS
        // // 1. Arithmetic Operators
        // // int a = 4;
        // // int b = 6 % a; // Modulo Operator
        // // 4.8%1.1 --> Returns Decimal Remainder

        // // 2. Assignment Operators
        // int b = 9;
        // b *= 3;
        // System.out.println(b);

        // // 3. Comparison Operators
        // // System.out.println(64<6);

        // // 4. Logical Operators
        // // System.out.println(64>5 && 64>98);
        // System.out.println(64 > 5 || 64 > 98);

        // // 5. Bitwise Operators
        // System.out.println(2 & 3);
        // // 10
        // // 11
        // // --
        // // 10

        // PART 3 : Strings
        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        // System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
        // String st = sc.next();
        // String st = sc.nextLine();
        // System.out.println(st);
        sc.close();
    }
}