package entiers;

import java.util.Scanner;

public class Entiers {

public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Premier entier : ");
		
		String firstInt = sc.nextLine();
		 int somme = 0;
		 
		 
		 while(!firstInt.isEmpty()) {
			 
			 try {
				 // cast du String en int
				 somme = somme + Integer.parseInt(firstInt);
				 System.out.println("Cumul : " + somme);
			
				 System.out.println("Encore... si tu veux sortir, rentre rien et valide");
				 firstInt = sc.nextLine();
			
			 }
			 // on attrape l'exception
			 catch(NumberFormatException entier){
		
					firstInt = "0";
			}
			
		}
		 
		System.out.println("Résultat : " + somme);
		
		sc.close();
			 
	 }

}
