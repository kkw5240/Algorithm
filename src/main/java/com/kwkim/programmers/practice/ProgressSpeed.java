package main.java.com.kwkim.programmers.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

//https://programmers.co.kr/learn/courses/30/lessons/42586
public class ProgressSpeed {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int lengthOfJob = progresses.length;

        Queue<Integer> leftDaysQueue = new ConcurrentLinkedDeque<>();
        for (int i=0; i<lengthOfJob; i++) {
            leftDaysQueue.add(leftDays(progresses[i], speeds[i]));
        }

        int prev = leftDaysQueue.poll();
        int processCounter = 1;
        List<Integer> answerList = new LinkedList<>();

        while (!leftDaysQueue.isEmpty()) {
            int curr = leftDaysQueue.poll();
            if (prev < curr) {
                answerList.add(processCounter);
                processCounter = 1;
                prev = curr;
                continue;
            }
            processCounter++;
        }

        answerList.add(processCounter);
        answer = new int[answerList.size()];
        for (int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private int leftDays(int progress, int speed) {
        int remainJob = 100 - progress;
        return remainJob / speed + (remainJob % speed > 0 ? 1 : 0);
    }
}

/*
제한 사항
    작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
    작업 진도는 100 미만의 자연수입니다.
    작업 속도는 100 이하의 자연수입니다.
    배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
입출력 예
    progresses	speeds	return
    [93, 30, 55]	[1, 30, 5]	[2, 1]
    [95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
입출력 예 설명
입출력 예 #1
    첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
    두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
    세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.

    따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.

입출력 예 #2
    모든 기능이 하루에 1%씩 작업이 가능하므로, 작업이 끝나기까지 남은 일수는 각각 5일, 10일, 1일, 1일, 20일, 1일입니다. 어떤 기능이 먼저 완성되었더라도 앞에 있는 모든 기능이 완성되지 않으면 배포가 불가능합니다.

    따라서 5일째에 1개의 기능, 10일째에 3개의 기능, 20일째에 2개의 기능이 배포됩니다.

    ※ 공지 - 2020년 7월 14일 테스트케이스가 추가되었습니다.
*/
