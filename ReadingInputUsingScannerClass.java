import java.util.Scanner;
import java.io.IOException;
 
class Demo
{
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Roll Number");
		int c = sc.nextInt();
		System.out.println("Roll No is = "+c); 
	}
}
