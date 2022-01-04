package mine;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeCollection {
	public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 1; i <= 10; i++)
            l.add(i); // ������ �߰�

        System.out.println(l);

        for (int i = 0; i < l.size(); i++) // ũ�� �� ��ȯ
            System.out.print(l.get(i) + " "); // i��° �����͸� ��ȯ ��
        System.out.println();

        l.remove(0); // 0��° ������ ����
        System.out.println(l);

        System.out.println(l.contains(5)); // ���⿡ 5��� ���� �ִ��� �˻�

        Collections.shuffle(l); // ������ ����
        System.out.println(l);
        Collections.reverse(l); // ������ �������� ����
        System.out.println(l);
        Collections.sort(l); // ������ ����
        System.out.println(l);

        System.out.println(Collections.binarySearch(l, 5)); // 5 �� ã��



        System.out.println(l.isEmpty()); // ����ִ��� Ȯ��
        l.clear(); // ��� ���� �����
        System.out.println(l.isEmpty());
    }
}
