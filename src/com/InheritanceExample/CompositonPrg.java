package com.InheritanceExample;
class Bank{
	
}
public class CompositonPrg {
    Bank bank;
    CompositonPrg(Bank bank){
    	this.bank=bank;
    	System.out.println("this is compositionPrg constructor");
    }
	public static void main(String[] args) {
		// this is has-a/composition/aggrection relationship 
		CompositonPrg cp=new CompositonPrg(new Bank());

	}

}
