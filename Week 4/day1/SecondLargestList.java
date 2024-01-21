package week4.day1;


import java.util.Arrays;


public class SecondLargestList {

	public static void main(String[] args) {
		int i[] ={3, 2, 11, 4, 6, 7};

		
		Arrays.sort(i);
		
		if(i.length>=2) {
			
			int secondlargest = i[i.length-2];
			System.out.println(secondlargest);
			
		}
	
	
	}
	
}


