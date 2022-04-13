package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, String> HM = new HashMap<Integer, String>();
    	
        HM.put(1, "Red");
        HM.put(2, "Green");
        HM.put(3, "Blue");
        HM.put(4, "White");
	    HM.put(5, "Black");

        System.out.println("Original HashMAp: " +HM); 
        HM.remove(3);
        System.out.println("New HashMAp: " + HM); 
        if(HM.containsKey("Red"))
		{
			System.out.println("removed from Set") ;
		}
		else
			System.out.println(" Not removed from Set") ;
        System.out.println("size of HashMap" + HM.size()) ;
	}

}
