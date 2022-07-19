package method;

public class Nonstaticmethod {

	public static void main(String[] args) {
	// classname objname= new classname;
    // objname.method1();
		Nonstaticmethod bk = new Nonstaticmethod();// call obj
        bk.method1();// calling method same class 
	    Nonstaticmethod1 kl = new Nonstaticmethod1();
	    kl.nonstatic();
	}
public void method1()
{
	int a,b,sub;
	a=66;
    b=12;
    sub=(a-b);
    System.out.println("sub="+sub);
}
}
