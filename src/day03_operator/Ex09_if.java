package day03_operator;

import java.util.Scanner;

public class Ex09_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = scanner.nextInt();
		if(num > 10) {
			System.out.println("1 종속 문장 실행");
			System.out.println("2 종속 문장 실행");
			System.out.println("3 종속 문장 실행");
			System.out.println("4 종속 문장 실행");
			System.out.println("5 종속 문장 실행");
		}
		System.out.println("다음 문장들 실행");
	}

}
