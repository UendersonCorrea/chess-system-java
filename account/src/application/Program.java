package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data: ");
		try {
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();

			System.out.print("Initial Balance: ");
			Double deposit = sc.nextDouble();

			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, withdrawLimit);
			acc.deposit(deposit);
			System.out.println();
			System.out.println(acc);
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.println(acc);

		}

		catch (RuntimeException e) {
			System.out.println("Erro inesperado");

		} catch (DomainException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		 
		finally {
			sc.close();
		}

	}

}
