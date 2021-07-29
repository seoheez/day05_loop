package day05_loop;

public class Quiz05 {

	public static void main(String[] args) {
		
		int i, j;
		for(i=1 ; i<=5 ; i++) {
			System.out.println();
			for(j=1 ; j<=5 ; j++) {
				System.out.print(i * j + "\t");
			}
		}
	}

}

// 계속 엉뚱하게 나와서 포기하려다가 차근차근 다시 생각해서 해보니 성공한 문제. 