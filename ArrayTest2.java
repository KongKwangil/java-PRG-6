package kki2;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		int score[]= {88,97,53,92,68,82};
		int max=score[0]; //배열의 첫 번째 요소를 max 지정
		
		for (int i:score) {
			if(i>=max)
				max=i; //i가 max보다 크면 max변경
		
	}
          System.out.print("max value is:"+max);
}
}