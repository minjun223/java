package mine;

interface AutoCloseable{
	
}
class Reso implements AutoCloseable{
	void show() {
		System.out.println("�ڿ����");
	}
	
	public void close() throws Exception{
		System.out.println("�ڿ� �ݱ�");
	}
}
public class TryCatch4Demo {

	public static void main(String[] args) {
		Reso reso = new Reso();
		
		
		try{
			reso.show();
		}catch(Exception e) {
			System.out.println("���� ó��");
		}

	}

}
