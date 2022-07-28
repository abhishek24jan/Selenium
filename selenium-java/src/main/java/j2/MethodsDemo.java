package j2;

public class MethodsDemo {
	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		String nad = d.getData();
		System.out.println(nad);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		
	}
	public static String getData()
	{
		System.out.println("Hello world");
		return "Abhishek";
	}

}
