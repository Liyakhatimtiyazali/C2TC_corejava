package com.cg.moneymoneybank.client;
import com.cg.moneymoneybank.framework.*;
import com.cg.moneymoneybank.application.*;
public class Client {

	public static void main(String[] args) {
//----------------------------------------------------------BankFactory Instantiation
		BankFactory bankFactory=new MMBankFactory();
		
//----------------------------------------------------------SavingAcc instantiation
		SavingAcc savingAcc=new MMSavingAcc(0000001, "Virat", 1000F, true); // isSalary(true) --> MINBAL=0F
		System.out.println(savingAcc);
		savingAcc.withdraw(savingAcc.getAccBal()); // Lazy binding of method
		
		SavingAcc savingAccTwo=new MMSavingAcc(0000002, "Dhoni", 1000F, false); // isSalary(false) --> MINBAL=100F
		System.out.println(savingAccTwo);
		savingAccTwo.withdraw(savingAcc.getAccBal());
		
//----------------------------------------------------------CurrentAcc instantiation
		CurrentAcc currentAcc=new MMCurrentAcc(0000003, "Rohit", 1000F, 500F); // accBal>=2 x creditLimit --> creditLimit=in this case: 500F (Using lazy initialization)
		System.out.println(currentAcc);
		currentAcc.withdraw(currentAcc.getAccBal()); // Lazy binding of method
		
		CurrentAcc currentAccTwo=new MMCurrentAcc(0000004, "Sachin", 1000F, 600F); // accBal<=2 x creditLimit --> creditLimit=0F (Using lazy initialization)
		System.out.println(currentAccTwo);
		currentAccTwo.withdraw(currentAcc.getAccBal());

	}
}

// Output:
//MMSavingAcc [toString()=SavingAcc [isSalaried=true, toString()=BankAcc [accNo=1, accNm=Virat, accBal=1000.0]]]
//You have withdrawn: Rs1000.0. Your account balance is: Rs0.0
//
//MMSavingAcc [toString()=SavingAcc [isSalaried=false, toString()=BankAcc [accNo=2, accNm=Dhoni, accBal=1000.0]]]
//Your requested withdrawal amount is more than allowed amount to be withdrawn. 
//
//MMCurrentAcc [toString()=CurrentAcc [creditLimit=500.0, toString()=BankAcc [accNo=3, accNm=Rohit, accBal=1000.0]]]
//You have withdrawn: Rs1000.0 Your current balance is: Rs0.0 And your credit balance is:500.0
//
//MMCurrentAcc [toString()=CurrentAcc [creditLimit=0.0, toString()=BankAcc [accNo=4, accNm=Sachin, accBal=1000.0]]]
//You have withdrawn: Rs1000.0 Your current balance is: Rs0.0 And your credit balance is:0.0
