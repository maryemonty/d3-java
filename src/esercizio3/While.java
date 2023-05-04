package esercizio3;

public class While {
	
	public static void suddivisione(String x) {
		String [] y = x.split("");
		
		for(int i = 0; i<y.length; i++) {
			System.out.println(y[i]);
			if(i<y.length -1) {
				System.out.println(",");
			}
		}
		System.out.println();
	}
}
