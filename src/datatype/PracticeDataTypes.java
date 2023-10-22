package datatype;

import java.math.BigDecimal;
import java.math.BigInteger;

import static datatype.Calculator.division;
import static datatype.Calculator.multiply;

public class PracticeDataTypes {

    public static void main(String[] args) {
        /* About Integer */
        int primitiveInteger = 5;
        Integer wrapperInteger = 9;
        System.out.println("Primitive Integer: " + primitiveInteger);
        System.out.println("Object Integer: " + wrapperInteger);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        /* About Long */
        long primitiveLong = 30000000000L;
        Long wrapperLong = 4000000002L;
        System.out.println("Primitive Long: " + primitiveLong);
        System.out.println("Wrapper Long: " + wrapperLong);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        /* About Double and Float*/
        double primitiveDouble = 3.45672;
        Double wrapperDouble = 1.23456789;
        float primitiveFloat = 3.45672F;
        Float wrapperFloat = 1.23456789F;
        System.out.println("Primitive Double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Primitive Float: " + primitiveFloat);
        System.out.println("Wrapper Float: " + wrapperFloat);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        /* About Short */
        System.out.println("Short Maximum :" + Short.MAX_VALUE);
        System.out.println("Short Minimum :" + Short.MIN_VALUE);
        /* About Big Integer and Big Decimal */
        BigInteger bigInteger = new BigInteger("100002");
        BigDecimal bigDecimal = new BigDecimal("12345678910");
        /* About String and Character */
        String string = new String();
        String stringLiteral = "";
        Character character = 'N';
        System.out.println("Calculator Outputs:");
        long answer = Calculator.add(112,3099999);
        System.out.println(answer);
        long answer2 = Calculator.subtract(4, 2);
        System.out.println(answer2);
        long answer3 = multiply(23000, 2);
        System.out.println(answer3);
        long answer4 = division(432, 2);
        System.out.println(answer4);
    }
}
