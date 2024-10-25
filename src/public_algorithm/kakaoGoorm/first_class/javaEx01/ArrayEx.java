package public_algorithm.kakaoGoorm.first_class.javaEx01;


public class ArrayEx {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};

        System.out.println("배열의 길이 : " + numbers.length);

        System.out.println("배열의 첫번째 요소 : " + numbers[0]);
        System.out.println("배열의 첫번째 요소 : " + numbers[1]);
        System.out.println("배열의 첫번째 요소 : " + numbers[2]);
        System.out.println("배열의 첫번째 요소 : " + numbers[3]);
        System.out.println("배열의 첫번째 요소 : " + numbers[numbers.length -1]);

        // 배열 요소 수정
        // 첫째를 1로 변경
        numbers[0] = 1;
        System.out.println("변경 후 배열의 첫 번째 요소 : " + numbers[0]);

        // 베열 요소 순회
        // for - 통상
        System.out.println("배열 요소 순회 : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();

        // for each
        System.out.println("배열 요소 순회 (for each) : ");
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println();

        // 배열의 동적 할당
        String[] names = new String[5];

        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Jorn";
        names[3] = "Koko";
        names[4] = "Lio";

        System.out.println("Stirng 배열 요소 : ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
