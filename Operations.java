package com.viktor.leonov;

import java.util.function.BinaryOperator;

public enum Operations implements BinaryOperator<Integer> {
    MULTIPLY("*" ,) {
        public Integer apply(Integer num1, Integer num2) {
            return (num1 * num2);
        }
    },
    ADD("+", ) {
        public Integer apply(Integer num1, Integer num2) {
            return (num1 + num2);
        }
    },
    DIVISION(":", ) {
            public Integer apply(Integer num1, Integer num2) {
                return num1 / num2;
            }
        },
    SEGMENTATION("-", ) {
        public Integer apply(Integer num1, Integer num2) {
            return (num1 - num2);
        }
    };
    public BinaryOperator <Integer> function;

    public final String sign;

    Operations(String sign1, BinaryOperator<Integer> function1)  {
        this.sign = sign1;
        this.function = function1;
    }
}