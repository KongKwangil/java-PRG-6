package kki2;

import java.util.Scanner;

public class chsix {

	
	public static void main(String[] args) {
       Scanner stdin=new Scanner(System.in);
       int i;
       double sum=0.0,avg;
       double dnum[]=new double[5];
       System.out.println("dnum 배열 길이: "+dnum.length);
       System.out.println("초기화 하지 않은 dnum[]값 :");
       
       for(i=0;i<dnum.length;i++);
    	   System.out.print(dnum[i]+" ");
    	   
    	   System.out.println();
    	   
    	   for(i=0;i<dnum.length;i++) {
    		   System.out.print("dnum["+i+"]번째 데이터 입력; ");
    		   dnum[i]=stdin.nextDouble(); //요소 값 실수로 입력
    	   }
    		for(i=0;i<dnum.length;i++)
    			sum=sum+dnum[i];
    		
    		System.out.println("배열의 합은 "+sum+"입니다.");
    		avg=sum/dnum.length;
    		System.out.println("배열의 평균은"+avg+"입니다");
    		
    				
    		
    				
    				
    				
    		
    		   
    		   
	}

}
