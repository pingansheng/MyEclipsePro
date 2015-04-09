package com.pas.action;

import java.util.Date;
import java.util.Scanner;

public class Year {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Scanner mysc = new Scanner(System.in);
		while (true) {
			int sum = 0;
			int week = 0;
			int year = 0;
			int month = 0;
			System.out.println("年份：");
			year = mysc.nextInt();
			System.out.println("月份：");
			month = mysc.nextInt();
			for (int i = 1990; i < year; i++) {
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
					sum += 366;
				} else {
					sum += 365;
				}
			}

			System.out.println(sum);

			for (int i = 1; i < month; i++) {
				if (i == 2) {
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						sum += 29;
					} else {
						sum += 28;
					}
				} else {
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8
							|| i == 10 || i == 12) {
						sum += 31;
					} else {
						sum += 30;
					}
				}

			}
			System.out.println(sum);

			week = sum % 7;

			System.out.print("日\t一\t二\t三\t四\t五\t六");
			System.out.print("\n");
			for (int i = 0; i <= week; i++) {
				System.out.print("\t");
			}

			int tem = 0;
			if(month==2)
			{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					tem= 29;
				} else {
					tem= 28;
				}
			}
			else if (month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10 || month == 12) {
				tem = 31;
			} else {
				tem = 30;
			}

			for (int i = 1; i <= tem; i++) {
				sum++;
				if (i == 1 && sum % 7 == 0) {
					System.out.print("\n");
				}
				if (sum % 7 == 6) {
					System.out.print(i + "\n");
				} else {
					System.out.print(i + "\t");
				}

			}
			System.out.println("");
		}
	}

}
