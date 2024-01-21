package week4.day1;

import java.util.ArrayList;

import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		int[] i = {3, 2, 11, 4, 6, 7};
		int [] j= {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1= new ArrayList<Integer>();
	  for(int l1 : i) {
		 list1.add(l1);
		  
	  }

		List<Integer> list2= new ArrayList<Integer>();
	  for(int l2 : j) {
		 list2.add(l2);
		  
	  }
	  
	  
	  for(int k : list1) {
		  if(list2.contains(k)) {
			 System.out.println(k); 
			  
		  }
		  
		 
	  }
	  
		
	}

}
