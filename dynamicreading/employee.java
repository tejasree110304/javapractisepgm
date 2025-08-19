import java.util.Scanner;
class employee
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("\t\t\tEnter employee Id :");
		int eid=sc.nextInt();
		System.out.print("\t\t\tEnter employee Salary :");
		int salary=sc.nextInt();
		System.out.print("\t\t\tEnter employee Contact :");
		long ph=sc.nextLong();
		System.out.print("\t\t\tEnter employee Gender :");
		char gender=sc.next().charAt(0);
		System.out.println("Id :"+eid);
		System.out.println("Salary :"+salary);
		System.out.println("Contact :"+ph);
		System.out.println("Gender :"+gender);
	}
}