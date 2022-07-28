package j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Jak {
	public static void main(String[] args) {
		
	int myNum = 5;
	String web = "Abhishek Poddar";
	double dec = 5.99;
	boolean mycard = true;
	
	System.out.println(myNum+ "is value of mynum.");
	System.out.println(mycard);
	System.out.println(web);
	System.out.println(dec);
	
	int[] arr = new int[5];
	arr[0] = 4;
	arr[1] = 5;
	arr[2] = 2;
	arr[3] = 1;
	arr[4] = 3;
	
	int[] arr2 = {1,2,3,4};
	int c = arr[1]+ arr2[3];
	System.out.println(arr2[2]+arr[4]+c);
	
	
	for(int i = 1; i < arr2.length; i++)
	{
		System.out.println(arr2[i]);
	}
	
	String[]  name = {"Abhishek", "Amit"};
	for(int p=0; p<name.length; p++ )
	{
		System.out.println(name[p]);
	}
	 for(String s: name)
	 {
		 System.out.println(s);
		 
	 }
	 for(int i: arr)
		{
			System.out.println(i);

		}
}
}
