package public_algorithm.kakaoGoorm.first_class.javaEx01;

public class StudentScore {
    public static void main(String[] args) {
        // 3명의 학생이 있고 각 학생은 4개의 과목 점수를 가짐
        int[][] scores = {
                {90, 70, 80, 100}, // 1 번 학생의 과목별 점수
                {100, 20, 40, 59}, // 2 번 학생의 과목별 점수
                {11, 23, 45, 67} // 3 번 학생의 과목별 점수
        };

        // 학생별로 평균 점수를 계산하고 출력
        // 2차원이라 for문을 두번
        for(int i = 0; i < scores.length; i++) { // 각학생 별로 반복
            int sum = 0; // 학생의 총점을 저장할 변수 초기화
            for (int j = 0; j < scores[i].length; j++) { // 해당학생의 점수 반복
                sum += scores[i][j];
            }
            double avg = sum / (double) scores[i].length;
            System.out.println(i + 1 + "번째 학생의 평균 점수 : " + avg);
        }
    }
}
