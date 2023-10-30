package com.exceptionHandling;

import java.util.Scanner;
class MainclssOfBanking extends Exception{
	MainclssOfBanking(String negAmou){
		super(negAmou);
	}
}
class NegativeAmount extends MainclssOfBanking{
	NegativeAmount(String negAmou){
		super(negAmou);
	}
}
class GreaterThanBalance extends MainclssOfBanking{
	GreaterThanBalance(String negAmou){
		super(negAmou);
	}
}

public class UseOfThrowKeyword{
	int balance=2000;
	void throwException(int amount)throws NegativeAmount,GreaterThanBalance{
		if(amount<0) {
			throw new NegativeAmount("["+amount+"]:"+"You Entered negative balance");
		}
		else if(amount>balance) {
			throw new GreaterThanBalance("["+amount+"]:"+"You have not enough balance");
		}else{
			balance=balance-amount;
			System.out.println("withdrawal successfull"+"\n Remining Balance :"+balance);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdrawl Amount:");
		int amount=sc.nextInt();
		UseOfThrowKeyword uotk = new UseOfThrowKeyword();
		try {
			uotk.throwException(amount);
		} 
		catch (GreaterThanBalance f) {
			// TODO: handle exception
			System.out.println(f.getMessage());
		}catch (NegativeAmount e) {
			// TODO: handle exception
			System.out.println("-1-------------");
			System.out.println(e);
			System.out.println("-2-------------");
			System.out.println(e.getMessage());
			System.out.println("-3-------------");
			e.getStackTrace();
			System.out.println("-4-------------");
			System.out.println(e.getStackTrace());
		}
		

	}

}
