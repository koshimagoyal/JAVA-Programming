class LowBalanceException extends Exception{
	private String detail;
	LowBalanceException(String a)
	{
		detail=a;
	}
	public String toString()
	{
		return "LowBalanceException["+detail+"]";
	}
}
class NegativeAmount extends Exception{
	private String detail;
	NegativeAmount(String a)
	{
		detail=a;
	}
	public String toString()
	{
		return "NegativeAmount["+detail+"]";
	}
}
class InsufficientFunds extends Exception{
	private String detail;
	InsufficientFunds(String a)
	{
		detail=a;
	}
	public String toString()
	{
		return "InsufficientFunds["+detail+"]";
	}
}
class BankAccount{
	int accNo;
	String custName;
	String accType;
	float balance;
	BankAccount(int accno,String cust_name,String accType,float balance) throws LowBalanceException,NegativeAmount
	{
		accNo = accno;
		custName = cust_name;
		this.accType = accType;
		if(accType.equals("savings")&&balance<1000)
			throw new LowBalanceException ("balance is low");
		else if(accType.equals("current")&&balance<5000)
			throw new LowBalanceException ("balance is low");
		else if(balance<0)
			throw new NegativeAmount ("amount is in negative");
		else
			this.balance=balance;
	}
	void deposit(float amt) throws NegativeAmount
	{
		if(balance<0)
			throw new NegativeAmount ("amount is in negative");
		else
			balance+=amt;
	}
	void withdraw(float amt) throws InsufficientFunds
	{
		if(accType.equals("savings")&&balance<1000)
			throw new InsufficientFunds ("balance is insufficient");
		else if(accType.equals("current")&&balance<5000)
			throw new InsufficientFunds ("balance is insufficient");
		else
			balance-=amt;
	}
	float getBalance() throws LowBalanceException
	{
		if(accType.equals("savings")&&balance<1000)
			throw new LowBalanceException ("balance is low");
		else if(accType.equals("current")&&balance<5000)
			throw new LowBalanceException ("balance is low");
		else
			return balance;
	}
	public static void main(String args[])
	{
		try
		{
			BankAccount b = new BankAccount(12,"rajat","savings",500);
			b.withdraw(120);
		}
		catch (LowBalanceException e)
		{
			System.out.println(e);
		}
		catch (NegativeAmount e)
		{
			System.out.println(e);
		}
		catch (InsufficientFunds e)
		{
			System.out.println(e);
		}
	}
}