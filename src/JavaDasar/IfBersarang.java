package JavaDasar;

public class IfBersarang {

	public static void main(String[] args) {
		// Nested If (If Bersarang)
		
		int a = 56;
		int b = 11;
		
		System.out.println("== Ini adalah awal program ==");
		
		if ( a == 5 ) {
			
			if ( b == 10) {
				
				System.out.println("ini adalah a = 5 dan b = 10");
				
			} else {
				
				System.out.println("ini adalah a = 5 dan b != 10");
				
			}
		} else {
			
			System.out.println("ini adalah a != 5 dan b != 10");
			
		}
		
		System.out.println("== Ini adalah akhir program ==");
	}

}
