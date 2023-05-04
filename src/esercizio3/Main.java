package esercizio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String utente = "";
		while(!utente.equals(":q")) {
			System.out.println("Inserisci una stringa: ");
			utente = input.nextLine();
			if(!utente.equals(":q")) {
				While.suddivisione(utente);
			}
		}
		input.close();
	}

}
