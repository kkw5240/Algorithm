package main.java.com.kwkim.programmers.practice;

public class TriangularSnail {
    public int[] solution(int n) {
        int number = 1;
        int x = 0;
        int y = -1;

        int[][] snailArray = getTriangleArray(n);

        for (int i = 0; i < n; i++) {
            int type = i % 3;
            int k = i;

            if (type == 0) {
                while(k < n){
                    snailArray[y+1][x] = number;
                    k++;
                    y++;
                    number++;
                }
            } else if ( type == 1) {
                while(k < n){
                    snailArray[y][x+1] = number;
                    k++;
                    x++;
                    number++;
                }
            } else {
                while(k < n){
                    snailArray[y-1][x-1] = number;
                    k++;
                    y--;
                    x--;
                    number++;
                }
            }
        }

        int[] answer = new int[n*(n+1)/2];
        int index = 0;
        for (int[] floor : snailArray) {
            for (int value : floor) {
                answer[index++] = value;
            }
        }
        return answer;
    }

    int[][] getTriangleArray(int n) {
        int[][] triangleArray = new int[n][];
        for (int i = 0; i < n; i++) {
            triangleArray[i] = new int[i+1];
        }
        return triangleArray;
    }
}
/*
삼각 달팽이
문제 설명
정수 n이 매개변수로 주어집니다. 다음 그림과 같이 밑변의 길이와 높이가 n인 삼각형에서 맨 위 꼭짓점부터 반시계 방향으로 달팽이 채우기를 진행한 후, 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 하도록 solution 함수를 완성해주세요.

1

1
2	3

1
2	6
3	4	5

1
2	9
3	10	8
4	5	6	7

1
2	12
3	13	11
4	14	15	10
5	6	7	8	9

1
2	15
3	16	14
4	17	21	13
5	18	19	20	12
6	7	8	9	10	11


제한사항
n은 1 이상 1,000 이하입니다.
입출력 예
n	result
4	[1,2,9,3,10,8,4,5,6,7]
5	[1,2,12,3,13,11,4,14,15,10,5,6,7,8,9]
6	[1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11]
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다.
입출력 예 #2

문제 예시와 같습니다.
입출력 예 #3

문제 예시와 같습니다.*/
/*
function solution (n) {
    let number = 1;
    let x = 0;
    let y = -1;

    let snailArray = getTriangleArray(n);

    for (let i = 0; i < n; i++) {
        let type = i % 3;
        let k = i;

        if (type === 0) {
            while(k < n){
                snailArray[y+1][x] = number;
                k++;
                y++;
                number++;
            }
        } else if ( type === 1) {
            while(k < n){
                snailArray[y][x+1] = number;
                k++;
                x++;
                number++;
            }
        } else {
            while(k < n){
                snailArray[y-1][x-1] = number;
                k++;
                y--;
                x--;
                number++;
            }
        }
    }
    const answer = snailArray.reduce((result, row)=> [...result, ...row], []);
    return answer;
}

function getTriangleArray(n) {
    let triangleArray = [];
    for (let i=0; i<n; i++) {
        triangleArray.push(Array.from({length: i+1}, () => 0));
    }
    return triangleArray;
}
*/
