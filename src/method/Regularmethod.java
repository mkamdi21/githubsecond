package method;

public class Regularmethod {

	public static void main(String[] args) {
		
		staticMethod();// calling static method from same class
        RegularMethod1.staticm1();// calling static method from another class 
	}
  public static void staticMethod()
  {
	  int a,b,sum;
	  a=20;
	  b=30;
	  sum =a+b;
			
	  
  System.out.println("sum = "+sum);
  }
}
