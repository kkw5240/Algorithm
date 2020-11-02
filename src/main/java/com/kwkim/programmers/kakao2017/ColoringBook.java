package main.java.com.kwkim.programmers.kakao2017;

public class ColoringBook {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] mapChecker = new boolean[m][n];

        for (int y=0; y<m; y++) {
            for (int x=0; x<n; x++) {
                System.out.print(picture[y][x]);
                if (mapChecker[y][x] == false) {
                    for (int t=0; t<m; t++) {

                    }
                }
            }
            System.out.println("");
        }




        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}
