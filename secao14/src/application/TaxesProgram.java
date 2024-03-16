package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Payer;

public class TaxesProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Payer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures:");
				Double healthExpend = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpend));
			} else if (type == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, anualIncome, employees));

			} else {
				System.out.println("Invalid Type!");
			}

		}
		System.out.println();
		System.out.println("TAXES PAID:");

		for (Payer payer : list) {

			System.out.println(payer.taxes());

		}
		double sum = 0;
		for (Payer payer : list) {
			sum += payer.paid();

		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();

	}

}
