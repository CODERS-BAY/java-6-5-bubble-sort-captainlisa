package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {4, 76, -33, 18, 0, -5};
        System.out.println(Arrays.toString(numbers));
        int temp = 0;

        sortArray(numbers);
    }


    private static void sortArray(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}
