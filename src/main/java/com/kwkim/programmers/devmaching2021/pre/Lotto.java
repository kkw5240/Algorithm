package com.kwkim.programmers.devmaching2021.pre;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int unknownCounter = 0;
        Set<Integer> lottoSet = new HashSet<>();
        for (int lotto : lottos) {
            lottoSet.add(lotto);
            if (lotto == 0) unknownCounter++;
        }

        int wins = 0;
        for (int win_num : win_nums) {
            if (lottoSet.contains(win_num)) {
                wins++;
            }
        }

        int maxWins = wins + unknownCounter;
        int minWins = wins;

        return new int[] { getRanking(maxWins), getRanking(minWins) };
    }

    private int getRanking(int wins) {
        return switch (wins) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}