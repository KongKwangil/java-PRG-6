/**
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 
 * 1000을 넘은 수와 평균을 출력
 */



package kki2;

import java.util.Scanner;

public class chap5 {

	public static void main(String[] args) {
		int sum=0; //합계
		int cnt=0; //입력 횟수
	
		while(true)
		{
			Scanner stdin=new Scanner(System.in);
			System.out.print("import number: ");
			int num=stdin.nextInt();
			
			cnt++; //입력 횟수 증가
			sum=sum+num; //입력받은 값의 합계
			
			if(sum>=1000) //합계가 1000이상인지
				break; //반복 종료
					
		}
		System.out.println("sum is " +sum );//합계 출력
		System.out.println("avg is " +sum/cnt );//평균 출력
	}

}
