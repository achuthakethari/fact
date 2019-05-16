package Factorial;

import java.io.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        int fact = 1;

        System.out.println("enter the number: ");
        Scanner ui = new Scanner(System.in);
        int num1 = ui.nextInt();
        int temp=num1;

        if (num1 == 0)
            fact = 0;
        else if (num1 == 1)
            fact = 1;
        else if (num1 > 0) {
            while (num1 != 0) {
                fact = fact * num1;
                num1--;
            }
        }

        System.out.println("the factorial of given no. " + temp + " is: " + fact);

    }
}