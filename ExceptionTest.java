package mine;

public class ExceptionTest {

	public void call(int j) throws ArrayIndexOutOfBoundsException{
		int [] i = {1,2,3};
		System.out.println("call value :" + i[j]);
	}
	public static void main(String[] args) {
		ExceptionTest er = new ExceptionTest();
		try {
			er.call(3);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ũ�⿡ �´� ���� �Է��ϼ���!");
			
		}finally {
			System.out.println("�ش� ������ ������ ����");
		}
	}

}
