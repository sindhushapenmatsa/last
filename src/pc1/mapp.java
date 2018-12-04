package pc1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class mapp {

	public static void main(String[] args) {
		
		HashMap<Integer,String> HM = new HashMap<Integer,String>();
		HM.put(1,"one");
		HM.put(2, "two");
		HM.put(3, "two");
		
	System.out.println(HM.get(3));	
	
	Set<Integer> allkeys= HM.keySet();
	
	for(Integer keys : allkeys)
	{
		
		System.out.println(HM.get(keys));
		
		
	}

	//-----------------------------------------
	
	for(Entry E : HM.entrySet())
	{
		System.out.println(E.getKey()+"  "+E.getValue());
	}

	}

}
