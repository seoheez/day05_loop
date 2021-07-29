package day05_loop;

public class Quiz002 {

	public static void main(String[] args) {

		
//			for문을 사용해서 2부터 20까지 합을 구하세요
//			1. 2부터 20까지 합을 구합니다를 입력받고 
//			2. 2부터 20까지 합은 ~입니다 라고 출력하세요
		
		System.out.println("2부터 20까지 합을 구합니다.");
		int sum=0;
		for(int i=2 ; i<=20 ; i++) {
			 
			sum+=i;	
		}
		System.out.println("2부터 20까지의 합은" + sum + "입니다.");
		
	}

}
