import java.util.Scanner;

public class MailMerge 
{
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		String firstlast = "Dear <first> <last>";
		System.out.println(firstlast);
		String first = in.next();
		String last = in.next();
		
		String address = "Please confirm your address is <house> <street>";
		System.out.println(address);
		String housenum = in.next();
		String street = in.next();
		String streettype = in.next();
		
		String yesno = "Your answer is <yes or no> ";
		System.out.println(yesno);
		String yorn = in.next();
		
		System.out.println(firstlast.replace("<first> <last>", first + " " + last));
		System.out.println(address.replace("<house> <street>", housenum + " " + street + " " + streettype));
		System.out.println(yesno.replace("<yes or no>", yorn));


}
}