package javapractice;
class P 
{
	static int x =888;
//	public  void m1(int... x)
//	{
//		System.out.println("Parent class method");
//	}
}
class C extends P
{
	static int x = 999;
//	public  void m1(int x)
//	{
//		System.out.println("Child class method");
//	}
}
public class Test {

	public static void main(String[] args)
	{
		P objP = new P();
//		objP.m1(10);
		System.out.println(objP.x);
		C objC = new C();
	//	 objC.m1(10);
		System.out.println(objC.x);
		 
		 P p1 = new C();
		// p1.m1(10);
		 System.out.println(p1.x);
	}

}
