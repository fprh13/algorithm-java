package public_algorithm.kakaoGoorm.first_class.javaEx01;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("0112323456", "홍길동", 2024);
        student.show();
        System.out.println(student.getStdName());
    }
}
