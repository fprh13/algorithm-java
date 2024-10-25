package public_algorithm.kakaoGoorm.exp.employee;

public class EmployeeEx {
    public static void main(String[] args) {


        Manager m = new Manager("매매매", 50000, "매니져");
        System.out.println("매니져가 회사에 입사 하였습니다.");
        System.out.println("사원 체크 시작 ...");

        Employee e1 = Employee.createEmployee("김김김", 10000, "대리");
        m.plusEmployeesCount();
        System.out.println("첫번 째 사원 추가");

        Employee e2 = Employee.createEmployee("박박박", 20000, "차장");
        m.plusEmployeesCount();
        System.out.println("두번 째 사원 추가");

        Employee e3 = Employee.createEmployee("이이이", 30000, "부장");
        m.plusEmployeesCount();
        System.out.println("세번 째 사원 추가");

        System.out.println("=====집계 종료 =======");

        e1.check();
        e2.check();
        e3.check();
        m.check();
    }
}
