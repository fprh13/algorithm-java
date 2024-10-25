package public_algorithm.study.thisTest;

public class Book {
    private String title;
    private int price;

    public Book() {
        this("미입력", -1);
    }

    /**
     * 비매품일 경우 가격 0으로 지정 하고 싶음
     */
    public Book(String title) {
        this(title, 0); // 다은 생성자 호출
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void showPrice() {
        System.out.println(title + "의 가격은 " + price + "원 입니다.");
    }
}
