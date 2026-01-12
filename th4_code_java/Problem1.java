/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th4_code_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Problem1 {

    public static long applyOp(char op, long b, long a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    public static long solve(String expression) {
        Stack<Long> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (Character.isDigit(c)) {
                long num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                values.push(num);
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (ops.peek() != '(') {
                    long val2 = values.pop();
                    long val1 = values.pop();
                    char op = ops.pop();
                    values.push(applyOp(op, val2, val1));
                }
                ops.pop();
            } else {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    long val2 = values.pop();
                    long val1 = values.pop();
                    char op = ops.pop();
                    values.push(applyOp(op, val2, val1));
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            long val2 = values.pop();
            long val1 = values.pop();
            char op = ops.pop();
            values.push(applyOp(op, val2, val1));
        }

        return values.pop();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BIEUTHUC.in"));

        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}
