package program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantidade de produtos a serem inseridos: ");
		
		int number = scan.nextInt();		
		Product[] p1 = new Product[number];
		
		for(int i=0; i<p1.length; i++) {
			scan.nextLine();
			System.out.print("Nome: ");
			String name = scan.nextLine();
			System.out.print("Preço: ");
			double price = scan.nextDouble();
			p1[i] = new Product(name, price);
		}
		
		double soma=0.0;
		for(int i=0; i<p1.length; i++) {
			soma+=p1[i].getPrice();
		}
		
		System.out.println("Média de preço total: " +  String.format("%.2f", soma/p1.length));
		
		
		
		scan.close();
	}
}
