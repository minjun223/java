package mine;

public class Array {

	public static void main(String[] args) {
		//1¹ø¹æ½Ä
//		int[] scores = { 83, 90, 87 };
//
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
//		
//		int sum = 0;
//		for(int i=0; i<3; i++) {
//			sum+=scores[i];
//		}
//		System.out.println("ÃÑÇÕ : " + sum);
//		double avg = (double) sum /3;
//		System.out.println("Æò±Õ : " + avg);
		//2¹ø¹æ½Ä
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 =0 ;
		for(int i=0; i<3 ; i++)
		{
			sum1 += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum1);
		
		
		int sum2 = add(new int[] { 83, 90, 87});
		System.out.println("ÃÑÇÕ : " + sum2);
		System.out.println();
	}
		public static int add(int[]scores)
		{
			int sum=0;
			for (int i=0; i<3; i++){
					sum += scores[i];
				}
				return sum;
	}
		
	}
	
	
