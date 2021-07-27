package day03_operator;

public class Ex07_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 삼항연산자(조건연산자)
		 - 변수 = (식)?(참일경우) : (거짓일 경우);
		 */
		int su = 8;
		String s = (su%2 == 0)? "짝수":"홀수";
		System.out.println(s);
		
		int su2 = 9;
		String s2 = (su2%2 == 0)? "짝수":"홀수";
		System.out.println(s2);
	}

}
