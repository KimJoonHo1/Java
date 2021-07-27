package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.println(num1 %2 == 0 ? "짝수" : "홀수");	
		System.out.println(num1 %3 == 0 ? "3의 배수가 맞다" : "3의 배수가 아니다");	
		
		System.out.print("두 수 입력 : ");
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		System.out.println(num2 > num3 ? "num2가 num3보다 크다" : "num3이 num2보다 크다");
	}

}
