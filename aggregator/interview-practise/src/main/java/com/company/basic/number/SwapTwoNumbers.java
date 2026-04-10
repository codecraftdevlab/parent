package com.company.basic.number;

public class SwapTwoNumbers {

    public static void main() {
        SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbers();
        int a = 1;
        int b = 2;
        swapTwoNumbers.swap(a, b);
    }

    public void swap(int a, int b) {
        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
