package ciclos;

public class buclesJava {
	
	public static void main(String[] arg) {
	
		int num = 0;
		
		while (num < 10) {
			System.out.println(num);
			num++;
		}
		
		do {
			System.out.println(num);
			num--;
		}while(num > 0);
		
		for (num = 0; num < 10; num++) {
			System.out.println(num);
		}
		
	}	

}
