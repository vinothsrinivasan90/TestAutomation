package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates remove= new RemoveDuplicates();
		remove.dup();
		

	}
	
	public void dup() {
		
		int count=0;
		String Text= "We learn Java basics as part of java sessions in java week1";
	    String[] split2=Text.split(" ");
		
	for (int i = 0; i < split2.length; i++){
		for (int j = i+1; j < split2.length; j++) {
			
		if(split2[i].equalsIgnoreCase(split2[j])) {
			split2[j]="";
			count++;
		
		}
		}
		
	}
		if(count>0) {
			
			 for (String word : split2) {
				  if (!word.isEmpty()) {
	                    System.out.print(word + " ");
	            }
	        
	        }
			
	    }
		}
}
		
		


