package public_algorithm.kakaoGoorm.daily.day01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
    private static final int NUM_OF_ELEMENTS = 1000000;

    public static void main(String[] args) {
        System.out.println("ArrayList 와 LinkedList 성능 비교 (" + NUM_OF_ELEMENTS + "개 요소) \n");
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

//        ArrayList에 요소 추가
        System.out.println("요소 추가중");
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList 추가 시간" + (end - start) + "ms");

//        LinkedList에 요소 추가
        System.out.println("요소 추가중");
        start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 추가 시간" + (end - start) +"ms");


        System.out.println("요소 검색 중...");

        start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            arrayList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList 검색 시간" + (end - start) + "ms");

        System.out.println("요소 검색 중...");

        start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 검색 시간" + (end - start) + "ms");

        System.out.println("요소 식제 중...");

        start = System.currentTimeMillis();
        for (int i = NUM_OF_ELEMENTS -1; i >= 0; i--) {
            arrayList.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList 삭제 시간" + (end - start) + "ms");

        System.out.println("요소 삭제 중...");

        start = System.currentTimeMillis();
        for (int i = NUM_OF_ELEMENTS -1; i >= 0; i--) {
            linkedList.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 삭제 시간" + (end - start) + "ms");
    }
}
