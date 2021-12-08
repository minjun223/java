package chap10;
interface Tail {
    void danger();
    void sleep();
    void action();
}

class Victim<T> implements Tail {
    protected T p;

    public Victim(T p) {
        this.p = p;
    }

    public void danger() {
    	
        System.out.println(p + " ���Ϸ��ͺ�");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
    public void action() {
        System.out.println("������ �� ����������");
    }
}

public class Taillmplment {
    public static void main(String[] args) {
        Victim v1 = new Victim("�����");
        Victim v2 = new Victim("ȯ���");
        
        v1.sleep();
        v1.danger();
        v2.danger();
        v1.action();
    }
}

