package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Madam");
		myList.add("SUSMi");
		myList.add("IBM FST");
		myList.add("AbhiramFST");
		myList.add("Chandra FST");
		
		
        System.out.println("Print All the Objects:");
    	
        for(String LM:myList){
	
            System.out.println(LM);
	}
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Ashwini is avalibale" + myList.contains("Aswini") );
        System.out.println("Size of Array" + myList.size() );
        myList.remove("Madam");
        System.out.println("Size of Array" + myList.size() );
        
}
}

