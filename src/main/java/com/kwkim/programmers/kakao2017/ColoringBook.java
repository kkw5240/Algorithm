package main.java.com.kwkim.programmers.kakao2017;

import lombok.Getter;

import java.util.LinkedList;
import java.util.Queue;

public class ColoringBook {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] mapChecker = new boolean[m][n];

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        for (int y=0; y<m; y++) {
            for (int x=0; x<n; x++) {
                if (!mapChecker[y][x] && picture[y][x] != 0) {
                    numberOfArea++;

                    Queue<Coordinate> coordinateQueue = new LinkedList<>();
                    coordinateQueue.add(new Coordinate(x, y));

                    int counter = 0;
                    while (!coordinateQueue.isEmpty()) {
                        Coordinate coordinate = coordinateQueue.poll();
                        for (int d=0; d<4; d++) {
                            int nx = coordinate.getX() + dx[d];
                            int ny = coordinate.getY() + dy[d];

                            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                            if (mapChecker[ny][nx]) continue;
                            if (picture[ny][nx] != picture[y][x]) continue;

                            counter++;
                            mapChecker[ny][nx] = true;

                            coordinateQueue.add(new Coordinate(nx, ny));
                        }
                    }

                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, counter);
                }
            }
        }

        return new int[]{
                numberOfArea,
                maxSizeOfOneArea
        };
    }
}

@Getter
class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}