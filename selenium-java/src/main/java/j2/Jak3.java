package j2;

public class Jak3 {
	public static void main(String[] args) {
		
		String s= "Abhishek Kumar Poddar" ;
		String[] splittedString = s.split("Kumar");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());
          int p= s.length();
		for(int i=p-1; i>=0; i--)
		{
			
		System.out.println(s.charAt(i));	 
		}
		
	}

}
