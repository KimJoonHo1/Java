package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num1 = scanner.nextInt();
		System.out.println(num1 %2 == 0 ? "¦��" : "Ȧ��");	
		System.out.println(num1 %3 == 0 ? "3�� ����� �´�" : "3�� ����� �ƴϴ�");	
		
		System.out.print("�� �� �Է� : ");
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		System.out.println(num2 > num3 ? "num2�� num3���� ũ��" : "num3�� num2���� ũ��");
	}

}
