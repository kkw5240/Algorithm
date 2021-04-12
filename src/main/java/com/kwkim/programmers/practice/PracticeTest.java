package main.java.com.kwkim.programmers.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*https://programmers.co.kr/learn/courses/30/lessons/42840*/
public class PracticeTest {

    private static final ArrayList<StudentWhoGaveUpMath> students;

    static {
        students = new ArrayList<>(
            Arrays.asList(
                    new StudentWhoGaveUpMath(1, new int[]{1, 2, 3, 4, 5}),
                    new StudentWhoGaveUpMath(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5}),
                    new StudentWhoGaveUpMath(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5})
            )
        );
    }

    public int[] solution(int[] answers) {
        int[] answer;

        scores(answers);

        Object[] winners = findWinners();

        answer = new int[winners.length];
        for (int i = 0; i < winners.length; i++) {
            answer[i] = (int) winners[i];
        }

        return answer;
    }

    private Object[] findWinners() {
        int max = students.stream()
                .max(Comparator.comparingInt(StudentWhoGaveUpMath::getScore))
                .orElse(new StudentWhoGaveUpMath(0, new int[]{}))
                .getScore();

        return students.stream()
                .filter(s -> s.getScore() == max)
                .map(StudentWhoGaveUpMath::getId)
                .toArray();
    }

    private void scores(int[] answers) {
        for (int i = 0; i < answers.length; i++) {
            int index = i;
            students.forEach(s -> {
                if (answers[index] == s.guess(index)) {
                    s.addScore();
                }
            });
        }
    }
}

class StudentWhoGaveUpMath {
    private final int id;
    private final int[] rule;
    private int score;

    protected StudentWhoGaveUpMath(int id, int[] rule) {
        this.id = id;
        this.rule = rule;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return this.score;
    }
    public void addScore() {
        this.score++;
    }

    public int guess(int index) {
        return rule[index % rule.length];
    }
}

/*

모의고사
문제 설명
    수포자는 수학을 포기한 사람의 준말입니다.
    수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
    수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

    1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
    가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
    시험은 최대 10,000 문제로 구성되어있습니다.
    문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
    가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

입출력 예
answers	    return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]

입출력 예 설명
    입출력 예 #1
        수포자 1은 모든 문제를 맞혔습니다.
        수포자 2는 모든 문제를 틀렸습니다.
        수포자 3은 모든 문제를 틀렸습니다.
        따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

    입출력 예 #2
        모든 사람이 2문제씩을 맞췄습니다.

*/
