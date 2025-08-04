package com.tnsif.dayone;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		int l=b;
		System.out.println(l);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int i=ch;
		
		//narrowing //explicit type casting
		
		double f1=10.52f;
		
		long l1=(long)
 f1;
		System.out.println(l1);
		
		int i2=256;
		byte b1=(byte) i2;
		System.out.println(b1);
		
		
	}

}
