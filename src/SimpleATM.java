import java.util.*;
import java.util.HashMap;


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

	
}

