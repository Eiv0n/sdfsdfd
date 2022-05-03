package com.viktor.leonov;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        int result;
        input = scan.nextLine();
        int num1 = Integer.parseInt(input.substring(0,1));
        int num2 = Integer.parseInt(input.substring(2,3));
        String singOfOperation = input.substring(1, 2);
        Operations.fromString(singOfOperation).apply(num1 , num2); // Cannot resolve method 'apply' in 'Enum'
    }
}
