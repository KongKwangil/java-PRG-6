package kki2;

public class ArratRef {

	public static void main(String[] args) {
		
		
		String strVal1="java";
		String strVal2="java";
		
		if(strVal1==strVal2) {
			System.out.println("strVal1, strVal2 same reference.");
		}else {
			System.out.println("strVal1, strVal2 diferent reference.");
		}
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1, strVal2 same string.");
		}
		String strVal3=new String("mklee");
		String strVal4=new String("mklee");
		
		if(strVal3==strVal4) {
			System.out.println("strVal3, strVal4 same reference.");
		}else {
			System.out.println("strVal3, strVal4 diferent reference.");
		}
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3, strVal4 same string.");
		}
				
				
	}

}
