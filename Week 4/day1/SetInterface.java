package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		String g = new String("google");
		char[] gs = g.toCharArray();
		Set<Character> google = new LinkedHashSet<Character>();
		for(int i=0;i<gs.length;i++) {
	    google.add(gs[i]);
	    			
		}
		System.out.println(google);
	//To print characters in same line
		String output ="";
		
		//for each loop
		for(Character g1 : google ) {
		  System.out.println(g1);
		  output = output+g1;
		  			
		}
		System.out.println(output);
	}

}
