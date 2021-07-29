package day05_loop;

public class Quiz04_for_gugudan {

	public static void main(String[] args) {
		
		int a, b;
		for(a=2 ; a<10 ; a++) {
			System.out.println("구구단" + a + " 단");
			System.out.println("****************");
			
			for(b=1 ; b<10 ; b++) {
				System.out.println(a + "x" + b + "= " + a*b );
			}
		}
	}

}
