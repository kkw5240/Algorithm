package com.kwkim.sanhait2020;

public class MaxNumber {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        for (int i=0; i<numbers.length; i++) {
            for (int j=i; j<numbers.length; j++) {
                int curr = numbers[i] > 10 ? Integer.parseInt((numbers[i]+"").split("")[0]) : numbers[i];
                int next = numbers[j] > 10 ? Integer.parseInt((numbers[j]+"").split("")[0]) : numbers[j];

                if (curr < next) {
                    int tmp = numbers[i];
                    numbers[i] = next;
                    numbers[j] = tmp;
                //} else if (curr == next && ) {

                }
            }
        }

        for (int number : numbers) {
            answer.append(number);
        }

        return answer.toString();
    }
}
