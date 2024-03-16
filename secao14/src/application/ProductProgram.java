package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProductProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");

		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + "data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char p = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (p=='c') {
				list.add(new Product(name, price));
			}
			else if (p == 'i') {
				System.out.print("Custom fee: ");
				Double customFee = sc.nextDouble();

				list.add(new ImportedProduct(name, price, customFee));
			}
			else if (p == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");

				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				list.add(new UsedProduct(name, price, date));
			} else {
				
				System.out.println("erro");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("PRICE TAGS:");

		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}

}
