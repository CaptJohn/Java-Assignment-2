package pack1;

//Transaction.java

public class Transaction 
{
	private String message; //instance variable
	private int transactionType; //instance variable
	private int transactionDay; //instance variable
	private double amount; //instance variable	
	
	// transaction constructor
	public Transaction(int transactionType, int transactionDay, double amount, String message)
	{
		this.transactionType = transactionType;
		this.transactionDay = transactionDay;
		this.amount = amount;
		this.message = message;
	}
	
	// method that gets transaction type
	public String getTransactionType()
	{
		String type;
		if(this.transactionType > 0)
		{
			type = "Deposit";
		}
		else
		{
			type = "Withdrawal";
		}
		return type;
	}
	
	// method that gets transaction day
	public int getTransactionDay()
	{
		return this.transactionDay;
	}
	
	// method that gets message
	public String getMessage()
	{
		return this.message;
	}
	
	// method that gets amount
	public double getAmount()
	{
		return this.amount;
	}
	
} // end class Transaction
