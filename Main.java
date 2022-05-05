package com.viktor.leonov;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        input = scan.nextLine();
        int num11 = Integer.parseInt(input.substring(0,1));
        int num22 = Integer.parseInt(input.substring(2,3));
        String singOfOperation = input.substring(1, 2);
        Operations[] operations = Operations.values();
        List<Operations> list2 = Arrays.asList(operations);

        Optional <Operations> operation = list2.stream().filter(s -> s.equals(singOfOperation)).findAny();
        }
    public BinaryOperator<Integer> getFunction() {
        return Operations.function;
    }
    }