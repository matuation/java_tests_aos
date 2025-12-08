package com.matuation;


public class FirstClass {
    public static void main(String[] args) {
        //применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int val1 = 2, val2 = 5;
        int sumResult = val1 + val2, subResult = val1 - val2;
        int mulResult = val1 * val2, divResult = val1 / val2;
        System.out.println("===========");
        System.out.println("val1 + val2 is: " + sumResult);
        System.out.println("val1 - val2 is: " + subResult);
        System.out.println("val1 * val2 is: " + mulResult);
        System.out.println("val1 \\ val2 is: " + divResult);
        System.out.println("===========");
        //применить несколько арифметических операций над int и double в одном выражении
        double doubleVal = 4.55;
        double operationsResult = divResult / subResult + doubleVal - divResult * sumResult - mulResult;
        System.out.println("operationsResult is: " + operationsResult);
        System.out.println("===========");
        //применить несколько логических операций ( < , >, >=, <= )
        boolean lessVal = val1 < val2;
        boolean greatVal = val1 > val2;
        boolean leeqVal = val1 <= val2;
        boolean greqVal = val1 >= val2;
        System.out.println(val1 + " < " + val2 + " is: " + lessVal);
        System.out.println(val1 + " > " + val2 + " is: " + greatVal);
        System.out.println(val1 + " <= " + val2 + " is: " + leeqVal);
        System.out.println(val1 + " => " + val2 + " is: " + greqVal);
        System.out.println("===========");
        //получить переполнение при арифметической операции
        int maxIntVal = Integer.MAX_VALUE;
        int valOverflow = maxIntVal + 1;
        System.out.println("valOverflow is: " + valOverflow);
        System.out.println("===========");
    }
}