package chap11;

import java.util.HashMap;
import java.util.Map;

public class HashMap1Demo {

	public static void main(StringDemo[] args) {
		Map<StringDemo, Integer> m = new HashMap<>();
		
		m.put("���", 5);
		m.put("�ٳ���", 3);
		m.put("����", 10);
		m.put("����", 1);
		
		System.out.println(m.size()+"������ ������ �ֽ��ϴ�.");

		for (StringDemo key:m.keySet())
			System.out.println(key+"��"+m.get(key)+"�� �ֽ��ϴ�.");
		
		String key ="�ٳ���";
		if(m.containsKey(key))
			System.out.println(key+"�� "+m.get(key)+"�� �ֽ��ϴ�.");
		
		m.remove("���");
		System.out.println("����� ���� �� ������ "+ m.size() + "�����Դϴ�");
		
		m.clear();
		System.out.println("��� ������ ������ " + m.size() +"�����Դϴ�.");
	}

}
