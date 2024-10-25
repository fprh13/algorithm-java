package public_algorithm.kakaoGoorm.first_class.javaEx01;

public class CallByRefEx {

    public static void main(String[] args) {
        int[] originalArr = {1,2,3};
        System.out.println("Before method : " + originalArr[0]);
        modifyArray(originalArr);
        System.out.println("After method : " + originalArr[0]);
    }

    // 배열 내용을 변경하는 메서드
    public static void modifyArray(int[] array) {
        array[0] = 9; // 메모리 주소를 전달하기 때문에 원본 객체에 영향을 준다.
        System.out.println("Inside method" + array[0]);
    }
}
