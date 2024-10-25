package public_algorithm.kakaoGoorm.first_class.javaEx01;

public class Student {

    private String stdNo;
    private String stdName;
    private int stdYear;

    // 매개변수가 있는 생성자
    public Student(String stdNo, String stdName, int stdYear) {
        super(); // 자바의 모든 클래스는 object클래스를 기본적으로 상속 받아서 super가 가능함 (명시적인 extend가 없는 것 뿐.)
        this.stdNo = stdNo;
        this.stdName = stdName;
        this.stdYear = stdYear;
    }
    // 생성자: 클래스 이름과 동일한 메서드 / 맴버필드를 초기화 할 때 사용
    // 객체가 생성될 때 맴버 필드에 값을 저장하기 위해 사용
    // 호출하지 않아도 객체 생성될 때 자동 호출
    // 반환형 없음


    public String getStdNo() {
        return stdNo;
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdYear() {
        return stdYear;
    }

    public void setStdYear(int stdYear) {
        this.stdYear = stdYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdNo='" + stdNo + '\'' +
                ", stdName='" + stdName + '\'' +
                ", stdYear=" + stdYear +
                '}';
    }

    public void show() {
        System.out.print("Student{" +
                "stdNo='" + stdNo + '\'' +
                ", stdName='" + stdName + '\'' +
                ", stdYear=" + stdYear +
                '}');
    }
}
