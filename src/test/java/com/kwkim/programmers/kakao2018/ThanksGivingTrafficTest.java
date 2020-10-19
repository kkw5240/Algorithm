package test.java.com.kwkim.programmers.kakao2018;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThanksGivingTrafficTest {
    @Test
    public int solution(String[] lines) {
        int answer = 0;

        List<Log> logList = new ArrayList<>();
        int len = lines.length;
        long[] chkPointList = new long[len * 2];

        for (int i=0; i<len; i++) {
            Log log = new Log(lines[i]);

            logList.add(log);

            chkPointList[i * 2] = log.getStart();
            chkPointList[i * 2 + 1] = log.getEnd();

            //chkPointList = insertionSort(chkPointList);
        }

        for (Long l : chkPointList) {
            long temp = logList.stream()
                    .filter(log -> log.isIn(l, l+999))
                    .count();
            System.out.println(temp);

            answer = (answer > temp) ? answer : (int) temp;
        }

        return answer;
    }

    long[] insertionSort(long[] array) {
        int len = array.length;

        for (int i=1; i<len; i++) {
            long key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return array;
    }

    @Getter @Setter
    static class Log {
        private long start;
        private long proc;
        private long end;

        public Log(String timeInfo) {
            Pattern pattern = Pattern.compile("([0-9\\-]+ [0-9:.]+) ([0-9.:]+)s");
            Matcher matcher = pattern.matcher(timeInfo);

            if (matcher.matches()) {
                this.end = Timestamp.valueOf(matcher.group(1)).getTime();
                this.proc = (long) (Double.parseDouble(matcher.group(2)) * 1000);
                this.start = end - proc;
            }
        }

        public boolean isIn(long chkStart, long chkEnd) {
            return (this.start <= chkEnd && this.end >= chkStart);
        }
    }

    @Test
    void test() {
        assertAll("test",
                () -> assertEquals(1, solution(
                        new String[]{
                                "2016-09-15 01:00:04.001 2.0s",
                                "2016-09-15 01:00:07.000 2s"
                        })),
                () -> assertEquals(2, solution(
                        new String[]{
                                "2016-09-15 01:00:04.002 2.0s",
                                "2016-09-15 01:00:07.000 2s"
                        })),
                () -> assertEquals(7, solution(
                        new String[]{
                                "2016-09-15 20:59:57.421 0.351s",
                                "2016-09-15 20:59:58.233 1.181s",
                                "2016-09-15 20:59:58.299 0.8s",
                                "2016-09-15 20:59:58.688 1.041s",
                                "2016-09-15 20:59:59.591 1.412s",
                                "2016-09-15 21:00:00.464 1.466s",
                                "2016-09-15 21:00:00.741 1.581s",
                                "2016-09-15 21:00:00.748 2.31s",
                                "2016-09-15 21:00:00.966 0.381s",
                                "2016-09-15 21:00:02.066 2.62s"
                        }))
        );
    }
}