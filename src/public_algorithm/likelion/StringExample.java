package public_algorithm.likelion;

public class StringExample {
    public static void main(String[] args) {
        String stringName = new String("JYM");
        String upperName = stringName.toUpperCase(); // loweCase 문자가 발견되지 않아 true 반환
        String literalName = "JYM"; // 리터럴 선언 객체
        String valueOfName = String.valueOf("JYM"); // null인지 아닌지 확인 후 toString 호출 -> String.toString()은 this를 호출

        System.out.println(stringName == upperName); // true
        System.out.println(stringName.equals(upperName)); // ture

        System.out.println(stringName == literalName); // 다른객체 false
        System.out.println(stringName.equals(literalName)); // 문자열은 같지만 다른 객체 true

        System.out.println(literalName == valueOfName); // true
        System.out.println(literalName.equals(valueOfName)); // true

        System.out.println("----------------------");

        String a = "a";
        String b = a;
        String c = new String("a");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
