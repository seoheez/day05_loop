package day05_loop;

public class Ex03_for {

	public static void main(String[] args) {
		int evenSum=0, oddSum=0;
		for(int su=1 ; su<=10 ; su++) {
			if(su%2 == 0) {
				evenSum += su;
			}else {
				oddSum += su;
			}
		}
		System.out.println("1~10 짝수합: " + evenSum);
		System.out.println("1~10 홀수합: " + oddSum);

	}

}
