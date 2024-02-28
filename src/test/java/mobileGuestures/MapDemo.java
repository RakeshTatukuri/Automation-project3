package mobileGuestures;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args)
	{
		//Map is interface in java key=value
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "C Programming");
		map.put(102, "C++");
		map.put(103,"Java");
		
		System.out.println(map);
		System.out.println(map.get(103));
		
		
		

	}

}
