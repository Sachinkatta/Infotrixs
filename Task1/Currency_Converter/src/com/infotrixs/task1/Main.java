package com.infotrixs.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FavoriteCurrency ob = new FavoriteCurrency();

		while (true) {

			System.out.println();
			System.out.println("========Curreny Converter==========");
			System.out.println("1.Add Favorite Currency");
			System.out.println("2.View Favorite Currencies");
			System.out.println("3.Show Real-Time Currency Conversion");
			System.out.println("4.Update Currency1");
			System.out.println("5.EXIT");
			System.out.println("====================================");
			System.out.println();

			System.out.println("Enter your choice");
			String choice = br.readLine();

			switch (choice) {

			case "1":

				ob.addFavorite();
				System.out.println("Press enter..!!");
				br.readLine();
				
				break;

			case "2":

				ob.viewFavorite();
				System.out.println("Press enter..!!");
				br.readLine();

				break;

			case "3":
				System.out.print("Currency from : ");
				String from = br.readLine().toUpperCase();

				System.out.print("to : ");
				String to = br.readLine().toUpperCase();

				System.out.print("Enter Amount : ");
				double amount = Double.parseDouble(br.readLine());

				ApiClass.convert(from, to, amount);
				System.out.println("Press enter..!!");
				br.readLine();

				break;

			case "4":
				ob.updateFavorite();
				System.out.println("Press enter..!!");

				br.readLine();

				break;

			case "5":
				System.out.println("Existing...Bye");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid input, TRY AGAIN..!!");

			}
		}

	}

}
