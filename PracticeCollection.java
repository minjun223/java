package mine;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeCollection {
	public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 1; i <= 10; i++)
            l.add(i); // 데이터 추가

        System.out.println(l);

        for (int i = 0; i < l.size(); i++) // 크기 값 반환
            System.out.print(l.get(i) + " "); // i번째 데이터를 반환 함
        System.out.println();

        l.remove(0); // 0번째 데이터 삭제
        System.out.println(l);

        System.out.println(l.contains(5)); // 여기에 5라는 값이 있는지 검사

        Collections.shuffle(l); // 데이터 섞기
        System.out.println(l);
        Collections.reverse(l); // 데이터 역순으로 정렬
        System.out.println(l);
        Collections.sort(l); // 데이터 정렬
        System.out.println(l);

        System.out.println(Collections.binarySearch(l, 5)); // 5 값 찾기



        System.out.println(l.isEmpty()); // 비어있는지 확인
        l.clear(); // 모든 값을 지우기
        System.out.println(l.isEmpty());
    }
}
