package day03_operator;

import java.util.Scanner;

public class Ex10_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("¼ö ÀÔ·Â : ");
		num = scanner.nextInt();
		if(num % 2 == 0) {
			System.out.println("Â¦¼ö");
		}
		if(num % 2 != 0) {
			System.out.println("È¦¼ö");
		}
	}

}
