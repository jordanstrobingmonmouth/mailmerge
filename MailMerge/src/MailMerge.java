import java.util.Scanner;

public class MailMerge 
{
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Dear <first> <last>");
		String first = in.next();
		String last = in.next();
		System.out.println("Please confirm your address is <house> <street>");
		String housenum = in.next();
		String street = in.next();
		String streettype = in.next();
		System.out.println("Your answer is <yes or no> ");
		String yorn = in.next();
		System.out.println("Dear "+ first + " " + last);
		System.out.println("Please confirm that your address is " + housenum + " " + street + " " + streettype);
		System.out.println("Your answer is: " + yorn);


}
}