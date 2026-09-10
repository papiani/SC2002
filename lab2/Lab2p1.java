
import java.util.Scanner;

public class Lab2p1 {
public static void main(String[] args)
{
    int choice;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Perform the following methods:");
        System.out.println("1: multiplication test");
        System.out.println("2: quotient using division by subtraction");
        System.out.println("3: remainder using division by subtraction");
        System.out.println("4: count the number of digits");
        System.out.println("5: position of a digit");
        System.out.println("6: extract all odd digits");
        System.out.println("7: quit");
        choice = sc.nextInt();
        switch (choice) {
            case 1: /* add mulTest() call */
                mulTest();
            break;
            case 2: /* add divide() call */
                divide();
            break;
            case 3: /* add modulus() call */
                modulus();
            break;
            case 4: /* add countDigits() call */
                countDigits();
            break;
            case 5: /* add position() call */
                position();
            break;
            case 6: /* add extractOddDigits() call */
                extractOddDigits();
            break;
            case 7: System.out.println("Exiting program");
            break;
        }
    } while (choice < 7);
    sc.close();
}
/* add method code here */
public static void mulTest() {
    Scanner sc = new Scanner(System.in);
    int correct = 0;
    for (int i = 0; i < 5; i++) {
        System.out.println("Multiplication Test");
        int num1 = (int) (Math.random() * 10); // generates a random number between 0 and 9
        int num2 = (int) (Math.random() * 10); // generates a random number between 0 and 9
        System.out.println("What is " + num1 + " * " + num2 + "?");
        int answer = sc.nextInt();
        if (answer == num1 * num2) {
            correct++;
        }

    }
    System.out.println(correct + " out of 5 correct.");
    sc.close();
    // method implementation
}
public static void divide() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the dividend: ");
    int dividend = sc.nextInt();
    System.out.println("Enter the divisor: ");
    int divisor = sc.nextInt();
    if (divisor == 0) {
        System.out.println("Error: Division by zero is not allowed.");
        return;
    }
    int quotient = 0;
    while (dividend >= divisor) {
        dividend -= divisor;
        quotient++;
    }
    System.out.println("The quotient is: " + quotient);
    sc.close();
}
public static void modulus() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the dividend: ");
    int dividend = sc.nextInt();
    System.out.println("Enter the divisor: ");
    int divisor = sc.nextInt();
    if (divisor == 0) {
        System.out.println("Error: Division by zero is not allowed.");
        return;
    }
    while (dividend >= divisor) {
        dividend -= divisor;
    }
    System.out.println("The remainder is: " + dividend);
    sc.close();
}

public static void countDigits() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    int count = 0;
    while (number >= 1) {
        number /= 10;
        count++;
    }
    System.out.println("The number of digits is: " + count);
    sc.close();
}
public static void position() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    System.out.println("Enter a digit to find its position: ");
    int digit = sc.nextInt();
    int position = -1;
    int index = 0;
    while (number > 0) {
        if (number % 10 == digit) {
            position = index;
            break;
        }
        number /= 10;
        index++;
    }
    if (position != -1) {
        System.out.println("The position of the digit is: " + position);
    } else {
        System.out.println("The digit is not found in the number.");
    }
    sc.close();
}
public static void extractOddDigits() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    int[] oddDigits = new int[10]; // assuming a maximum of 10 odd digits
    int count = 0;
    while (number >= 1) {
        int digit = number % 10;
        if (digit % 2 != 0) {
            oddDigits[count] = digit;
            count++;
        }
        number /= 10;
    }
    int newnum = 0;
    for (int i = 0; i < count; i++) {
        newnum += oddDigits[i]*Math.pow(10, i); // reconstruct the number from odd digits
    }
    System.out.println("The number formed by the odd digits is: " + newnum);
    sc.close();
}
}
