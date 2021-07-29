package day05_loop;

public class Quiz003 {

	public static void main(String[] args) {


		//for문을 이용해 30까지 3의 배수의 합을 구하세요
		int sum=0;
		for(int su=0 ; su <=30 ; su+=3 ) {	
			sum+=su;
		}
		System.out.println("1~30까지 3의 배수의 합: " + sum);
		
		/* if 사용 또 다른 방법
		int sum =0;
		for(int i=1 ; i <=30 ; i++) {
			if(i%3 == 0) {
				sum +=i;
			}
		}
		System.out.println("1~30까지 3의 배수의 합: " + sum);
		*/

	}

}



