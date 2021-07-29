package day05_loop;

public class Quiz03_for {

	public static void main(String[] args) {


		for(int n=1 ; n<=25 ; n++) {
			/*System.out.print(n+ "\t");

		if(n%5 == 0) {
			System.out.println();
		}*/
			if(n%5 == 0) {
				System.out.println(n);
			}else {
				System.out.print(n+"\t");
			}
		}

	}
}
