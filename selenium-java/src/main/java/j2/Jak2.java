package j2;

import java.util.ArrayList;

public class Jak2 {
	public static void main(String[] args) {
		int[] arr2 = {1,2,3,4,11,19,144};
	for(int i: arr2)
	{
		if(i % 2 ==0)
		{
			System.out.println(i);
			break;
		}
		else {
			System.out.println(i+" not multiple of 2");
		}
			
			
		}
	
	ArrayList<String> a = new ArrayList<String>();
	a.add("Rahul");
	a.add("Ravi");
	System.out.println(a.get(0)+a.get(1));
	
	}
	
}