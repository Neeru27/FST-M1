package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("c");
		hs.add("E");
		hs.add("F");
		System.out.println("Original HashSet: " + hs); 
		System.out.println("Size of HashSet: " + hs.size() );
		System.out.println("Remove from HashSet : " + hs.remove("A") );
		System.out.println("Size of HashSet: " + hs.size() );
		if(hs.remove("S"))
		{
			System.out.println("removed from Set") ;
		}
		else
			System.out.println(" Not removed from Set") ;
		System.out.println("check req data is present" + hs.contains("SDF"));
		System.out.println("Size of HashSet: " + hs.size() );
		System.out.println("Original HashSet: " + hs);
	}
	
	
	

}
