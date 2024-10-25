package public_algorithm.kakaoGoorm.exp.employee;

public class Employee {
    /**
     * 1. 직원 클래스를 작성합니다. 직원 클래스에는 이름, 연봉, 직급 등의 필드가 포함되어야 합니다.
     * 2. 관리자 클래스를 작성합니다. 관리자 클래스는 직원 클래스를 상속받아야 하며, 추가로 관리하는 직원 수 필드가 포함되어야 합니다.
     * 3. 직원 클래스와 관리자 클래스에 적절한 생성자와 메서드를 정의합니다.
     * 4. 직원 객체와 관리자 객체를 각각 생성하고, 오버라이딩된 메서드(예: 급여 인상 메서드)를 호출하여 그 결과를 출력합니다.
     */
    private String name;
    private int salary;
    private String rank;

    public Employee() {
    }

    protected Employee(String name, int salary, String rank) {
        this.name = name;
        this.salary = salary;
        this.rank = rank;
    }

    public static Employee createEmployee(String name, int salary, String rank) {
        return new Employee(name, salary, rank);
    }

    public void check() {
        System.out.println(this.name + this.rank + "님의 봉급은 " + this.salary + "입니다.");
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
