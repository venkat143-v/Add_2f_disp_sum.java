import java.io.*;
public class Add_2f_disp_sum {
public static void main(String[] args) throws Exception
{
	BufferedReader obj = 
	new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 2 Numbers :");
	float a = Float.parseFloat(obj.readLine() ); // 10
	float b = Float.parseFloat(obj.readLine() );  // 20
	Float c = a+b;
	System.out.println("Sum = "+ c);
} }