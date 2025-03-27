package exceptionhan;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=15;
if(age>=18)
{
	System.out.println("eligible for voting");
}
else
{
	throw new ArithmeticException("note eligible for voting");
}
	}

}
