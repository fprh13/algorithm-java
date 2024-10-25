package public_algorithm.kakaoGoorm.daily.day05;

public class RecursionEx {
    public static void main(String[] args) {
        printCharReverse("Hello Java!");
    }
    public static void printCharReverse(String str) {
//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i));
//        }
        if (str.length() == 0) {
            return;
        }
        if (str.length() != 0) {
            printCharReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
}
