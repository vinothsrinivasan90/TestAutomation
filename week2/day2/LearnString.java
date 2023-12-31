package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		
		// String Literal
		String x="Testleaf";
		String y="Testleaf";
		String z="testLeaf";
		System.out.println(x==y);
		
		//String instantiation
		String a= new String("Testleaf");
		String b = new String ("Testleaf");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);

		
		//String Methods
		//length
		int len=x.length();
		System.out.println(len);
		//compare equals using value in string
         boolean eqls = y.equals(b);
         System.out.println(eqls);
		// method equals using memory address
         System.out.println(y==b);
		 System.out.println("z equals a:"  +z.equals(a));
		 //ignoreCase
		 System.out.println(z.equalsIgnoreCase(a));
		 // contains
		 System.out.println("Contains L   :"+a.contains("l"));	
		//lowercase
		 System.out.println("Print lowercase of Testleaf   :"+a.toLowerCase());
		  //uppercase
		 System.out.println("Print uppercase of Testleaf   :"+a.toUpperCase());
		 //charArray using index value
		 char[] chararray=a.toCharArray();
		 System.out.println(chararray[0]);
		 System.out.println(chararray[3]);
		 //charAt to fetch the char of position
		 System.out.println(a.charAt(6));
		 // to remove white space before and after character
		 String n="         Test  ";
		 System.out.println(n.trim());
		 //replaceall - to remove all numbers in text
		 String r="welcome@3455";
		 String replace= r.replaceAll("[0-9]","");
		 System.out.println("replace numbers   "+replace);
		 //to have numbers only
		 String numonly=r.replaceAll("[^0-9]","");
		 System.out.println("numbers only " +numonly);
		 String[] split = r.split("@");
		 System.out.println("Split Length  :"+split.length);
		 System.out.println("Split[0]     "+split[1]);
		 String[] split2 = r.split("");
		 for (int i = 0; i < split2.length; i++) {
			 System.out.println("split2["+i+"] "+split2[i]);
			
		}
		 System.out.println(r.substring(6));
		 System.out.println(r.substring(0,6));
		 
		
		 char[] txtchar = r.toCharArray();
		 int ecount=0;
		 for (int i = 0; i < txtchar.length; i++) {
			if(txtchar[i]=='e') {
				ecount++;
				
			}
		}
		System.out.println("Number of char e present is :"+ecount);
		 
	}

}
