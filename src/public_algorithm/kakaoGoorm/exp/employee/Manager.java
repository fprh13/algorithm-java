package public_algorithm.kakaoGoorm.exp.employee;

public class Manager extends Employee{

    /**
     * 1. 직원 클래스를 작성합니다. 직원 클래스에는 이름, 연봉, 직급 등의 필드가 포함되어야 합니다.
     * 2. 관리자 클래스를 작성합니다. 관리자 클래스는 직원 클래스를 상속받아야 하며, 추가로 관리하는 직원 수 필드가 포함되어야 합니다.
     * 3. 직원 클래스와 관리자 클래스에 적절한 생성자와 메서드를 정의합니다.
     * 4. 직원 객체와 관리자 객체를 각각 생성하고, 오버라이딩된 메서드(예: 급여 인상 메서드)를 호출하여 그 결과를 출력합니다.
     */

    private int employeesCount;

    public Manager(String name, int salary, String rank) {
        super(name, salary, rank);
        plusEmployeesCount();
    }

    /**
     * 직원수 증가 메서드
     */
    protected void plusEmployeesCount() {
        this.employeesCount += 1;
    }

    public int getEmployeesCount() {
        return this.employeesCount;
    }

    @Override
    public void check() {
        super.check();
        System.out.println("현재 회사 집계 현황 : " + this.employeesCount + "명");
    }
}
