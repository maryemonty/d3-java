package esercizio1;

public class AnnoBisestile {
	static int x = 500000000;
	
	public static  void anno() {
		if(x % 100 == 0 && x % 400 == 0 || x % 4 == 0) {
			System.out.println("è bisestile");
		}else {
			System.out.println("non è bisestile");
		}
		}
	
	}
	
