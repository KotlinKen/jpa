package com.pure.service;

public class AnimalImpl implements Animal{

	@Override
	public String sound() {

		return "WHAT";
	}
	
	public static void exec(String a) {
		new Thread( ()->  {
			System.out.println(1);
		});

		MaxNumber maxNumber = (x ,y)->(x>=y) ? x:y;

		maxNumber.superMax(1, 2);
		 
    }

}


interface MaxNumber{
    // public abstract 생략
    int superMax(int num1, int num2);
}