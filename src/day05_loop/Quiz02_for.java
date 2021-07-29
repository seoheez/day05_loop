package day05_loop;

public class Quiz02_for {

	public static void main(String[] args) {


		int sum = 0;
		for(int i=0 ; i<=100 ; i++) {
			sum+=i;
//			System.out.println(i+ " : " + sum);
			if(sum == 528) {
				System.out.println(i);
			}
		}

	}

}