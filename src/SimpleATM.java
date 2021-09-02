import java.util.*;

public class SimpleATM
{   

	private HashMap <String, Double > b = new HashMap <String, Double>();

	public SimpleATM() {
		
	}
		
	public void deposit (String bankID, double amount)
	{
		if (amount > 0)
		{
			if (b.containsKey(bankID))
			{
				b.put(bankID, b.get(bankID)+ amount);
			}
			else
			{
				b.put(bankID, amount);
			}
		}
	}
	
	public String withdraw (String accountID, double withdrawAmount)
	{
		if (b.get(accountID) = null)
		{
			return("ID does not exist.");
		}
		else if (withdrawAmount > b.get(accountID))
		{
			return("Error: Amount invalid.");
		}
		else if 
		{
			b.replace(accountID, (b.get(accountID)-withdrawAmount));
			return("Withdrawn.");
		}
	}

	public String checkBalance(String accountID)
	{
		if (b.get(accountID) = null)
		{
			return("ID does not exist.");
		}
		else
		{
			return ""+b.get(accountID);
		}
	}
	
}

