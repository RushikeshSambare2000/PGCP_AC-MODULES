interface ATM
{
	int MAX_WITHDRAWAL_LIMIT = 100000;  //all data inside interface are public, static and final
	
	void checkBalance();			//all methods inside interface are public, abstract
	void withdrawMoney();		
	void depositMoney();
	void changePin();
}


class SBI implements ATM		
{
	//implementation of all methods from the interface
	
	public void checkBalance()
	{
		System.out.println("SBI: Check Balance");
	}
	
	public void withdrawMoney()
	{
		System.out.println("SBI: Withdraw Money");
	}
	
	public void depositMoney()
	{
		System.out.println("SBI: Deposit Money");
	}
	
	public void changePin()
	{
		System.out.println("SBI: Change Pin");
	}
}

class HDFC implements ATM
{
	//implementation of all methods from the interface
	public void checkBalance()
	{
		System.out.println("HDFC: Check Balance");
	}
	
	public void withdrawMoney()
	{
		System.out.println("HDFC: Withdraw Money");
	}
	
	public void depositMoney()
	{
		System.out.println("HDFC: Deposit Money");
	}
	
	public void changePin()
	{
		System.out.println("HDFC: Change Pin");
	}
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		SBI sbi = new SBI();
		sbi.changePin();
		
		HDFC hdfc = new HDFC();
		hdfc.withdrawMoney();
		
		ATM atm = new SBI();
		atm.depositMoney();
		
		System.out.println(ATM.MAX_WITHDRAWAL_LIMIT);
		System.out.println(SBI.MAX_WITHDRAWAL_LIMIT);
	}
}
