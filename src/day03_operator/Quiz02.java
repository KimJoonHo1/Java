package day03_operator;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scanner.nextInt();
		System.out.print("���� : ");
		if(num % 3 == 0) {
			System.out.println(num);
		}
		System.out.println();
		
		System.out.print("���� �Է� : ");
		num = scanner.nextInt();
		if(num < 0) {
			num = num * -1;
		}
		System.out.println("���� : " + num);
		
		System.out.print("�� �� �Է� : ");
		num = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println("ū �� : " + ((num>num2) ? num : num2));
		
		System.out.print("�� �� �Է� : ");
		num = scanner.nextInt();
		num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = num > num2 ? num : num2;
		System.out.println("ū �� : " + ((num3 > num4) ? num3 : num4));
		
		System.out.print("�� �� �Է� : ");
		num = scanner.nextInt();
		num2 = scanner.nextInt();
		num4 = num > num2 ? num : num2;
		if(num4 % 2 == 0) {
			System.out.println(num4);
		}
		
		System.out.print("�� �� �Է� : ");
		num = scanner.nextInt();
		num2 = scanner.nextInt();
		num4 = num + num2;
		if(num4 % 2 == 0 && num4 % 3 == 0) {
			System.out.println(num4);
		}
 	}

}
