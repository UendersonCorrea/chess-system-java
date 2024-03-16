package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class EmployeeProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of Employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsorced (y/n)? ");
			char outsorced = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hour: ");
			Integer hour = sc.nextInt();

			System.out.print("Value per Hour: ");
			Double valuePerHour = sc.nextDouble();
			

			if (outsorced == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();

				list.add(new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge));

			} else {
				
				list.add(new Employee(name, hour, valuePerHour));
			}

		}

		System.out.println("PAYMENTS: ");

		for (Employee emp1 : list) {
			System.out.println(emp1);

		}

		sc.close();

	}

}
