package com.viktor.leonov;
import java.util.function.BiFunction;

public enum Operations implements BiFunction<Integer, Integer, Integer> {

    MUlTIPLY ("*") {
        public Integer apply(Integer num1, Integer num2) {
            return (num1 * num2);
        }
    },
    ADD ("+") {
        public Integer apply(Integer num1, Integer num2) {
            return (num1 + num2);
        }
    },
    DIVISION(":") {
        public Integer apply(Integer num1, Integer num2) {
            return (num1 / num2);
        }
    },
    SEGMENTATION("-") {
        public Integer apply(Integer num1, Integer num2) {
            return (num1 - num2);
        }
    };
    final String sign;
    Operations (String sign) {
        this.sign = sign;
    }
    public static Enum fromString(String signOfOperation) {
        switch (signOfOperation) {
            case (Operations.ADD.sign): // Constant expression required
               return Operations.ADD;
            break;
            case (Operations.DIVISION.sign) : // Constant expression required
                return Operations.DIVISION;
            break;
            case (Operations.SEGMENTATION.sign) : // Constant expression required
                return Operations.SEGMENTATION;
            break;
            case (Operations.MUlTIPLY.sign) : // Constant expression required
                return Operations.MUlTIPLY;
            break;
        }
        return ; // хз как вернуть итоговый енам
    }
}
