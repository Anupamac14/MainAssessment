import java.util.*;

public class HashMapEx {
	public static void main(String args[])  
	{  
		HashMap<Integer, String> hm = new HashMap<Integer, String>();  
		hm.put(110,"Anu");  
		hm.put(120,"Racchu");  
		hm.put(130, "Buff");    
		hm.put(140, "Netty");  
		hm.put(150, "Kala");  
		Iterator <Integer> it = hm.keySet().iterator();        
		while(it.hasNext())  
		{  
			int key=(int)it.next();  
			System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
		}  
	}  
}  

