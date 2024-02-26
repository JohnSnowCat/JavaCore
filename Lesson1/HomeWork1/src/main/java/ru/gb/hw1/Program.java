package ru.gb.hw1;

import ru.gb.hw1.services.Calculator;
import ru.gb.hw1.utils.PrintResult;

public class Program {
    public static void main(String[] args) {
        PrintResult result = new PrintResult();
        System.out.println(result.printResult(Calculator.add(4, 6)));
        System.out.println(result.printResult(Calculator.subtraction(4, 6)));
        System.out.println(result.printResult((Calculator.multiply(4, 6))));
        System.out.println(result.printResult(Calculator.divide(4, 6)));
    }
}