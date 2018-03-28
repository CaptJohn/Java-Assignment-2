package pack1;

//Customer.java

public class Customer 
{
	private String lastName; // instance variable
	private String firstName; // instance variable
	private String status; // instance variable
	
	// Customer constructor that receives three parameters  
	public Customer(String lastName, String firstName, String status) 
	{
		this.lastName = lastName; // assign lastName to instance variable lastName
	    this.firstName = firstName; // assign firstName to instance variable firstName
	    this.status = status; // assign status to instance variable status
	}

	// method that sets the customer name
	public void setName(String lastName, String firstName)
	{
	   this.lastName = lastName; 
	   this.firstName = firstName; 
	}
	   
	// method that returns the customer name
	public String getName()
	{
	   return (this.lastName + ", "+ this.firstName); 
	} 
	
	//
	public String getFirstName()
	{   
	   return this.firstName;
	}
	
	//
	public String getLastName()
	{
	   return this.lastName;
	}
	
	//
	public String getStatus()
	{   
	   return this.status;
	}
	
	
	
	
	
} // end class Customer
