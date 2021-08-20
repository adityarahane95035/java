import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Student 
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter your name");
		String s = br.readLine();
		System.out.println("Enter your id");
		String id = br.readLine();
		System.out.println("student name is = "+s);
		System.out.println("Id no = "+id);


	}
}