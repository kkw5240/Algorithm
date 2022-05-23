package com.kwkim.programmers.devmaching2021.pre;


public class Spin {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};

        int[][] map = initializeMap(rows, columns);

        for (int[] query : queries) {
            int y1 = query[0] - 1;
            int x1 = query[1] - 1;
            int y2 = query[2] - 1;
            int x2 = query[3] - 1;

            int width = x2 - x1;
            int height = y2 - y1;

            int length = (width + height) * 2;

            int tx = x1;
            int ty = y1;

            int prev = map[y1+1][x1];

            for (int i = 0; i < length; i++) {
                System.out.println("{ "+ty+", "+tx+" }");
                int temp = map[ty][tx];
                map[ty][tx] = prev;
                prev = temp;

                DIRECTIONS directions = getDirections(width, height, i);
                switch (directions) {
                    case RIGHT -> tx++;
                    case DOWN -> ty++;
                    case LEFT -> tx--;
                    case UP -> ty--;
                    default -> {
                    }
                }
            }

            for (int x = 0; x < 6; x++) {
                for (int y = 0; y < 6; y++) {
                    System.out.print(map[y][x]+" ");
                }
                System.out.println();
            }

        }


        return answer;
    }

    private DIRECTIONS getDirections(int width, int height, int i) {
        DIRECTIONS directions;
        if (i < width - 1) {
            directions = DIRECTIONS.RIGHT;
        } else if (i <= width + height - 1) {
            directions = DIRECTIONS.DOWN;
        } else if (i <= width*2 + height - 2) {
            directions = DIRECTIONS.LEFT;
        } else {
            directions = DIRECTIONS.UP;
        }
        return directions;
    }

    private int[][] initializeMap(int rows, int columns) {
        int[][] map = new int[rows][columns];

        int number = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                map[j][i] = number++;
            }
        }

        return map;
    }

    enum DIRECTIONS {
        RIGHT, DOWN, LEFT, UP
    }
}
