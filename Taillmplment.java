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
    	
        System.out.println(p + " 너일러와봐");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
    public void action() {
        System.out.println("힘으로 다 제압해주지");
    }
}

public class Taillmplment {
    public static void main(String[] args) {
        Victim v1 = new Victim("찬우야");
        Victim v2 = new Victim("환빈아");
        
        v1.sleep();
        v1.danger();
        v2.danger();
        v1.action();
    }
}

