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
	
	public String withdrawMoney (String accountID, double withdrawAmount)
	{
		if (b.get(bankID) = null)
		{
			return("ID does not exist.");
		}
		else if (withdrawAmount > b.get(bankID))
		{
			return("Error: Amount invalid.");
		}
		else if 
		{
			b.replace(bankID, (b.get(bankID)-withdrawAmount));
			return("Withdrawn.");
		}
	}
	
	
}

