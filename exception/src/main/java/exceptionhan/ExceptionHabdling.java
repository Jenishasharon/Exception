package exceptionhan;

public class ExceptionHabdling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
int a=10;
int b=0;
int c=a/b;
System.out.println(c);
	}
catch(ArithmeticException a)
{
System.out.println("check the code");	
System.out.println(a);
}
finally 
{
	System.out.println("excecute");
}
}
}

