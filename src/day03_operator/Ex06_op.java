package day03_operator;

public class Ex06_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ++ : �ڱ��ڽ��� 1 ������Ŵ
		 -- : �ڱ����� 1 ���ҽ�Ŵ
		 - a = a- 1, a = a + 1
		 */
		int su1 = 5;
		su1++;
		System.out.println(su1);
		++su1;
		System.out.println(su1);
		
		int n1, n2, n3;
		n1 = 10;
		n2 = ++n1;
		n1 = 10;
		n3 = n1++;		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}
