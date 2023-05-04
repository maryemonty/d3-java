package esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("inserisci un numero intero: ");
		int x = input.nextInt();
		String num = Switch.number(x);
		System.out.println(num);
		input.close();

	}

}
