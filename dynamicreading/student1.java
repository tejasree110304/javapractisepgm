import java.util.Scanner;
class Student1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\tEnter studentId :");
		int sid = sc.nextInt();
		System.out.print("\t\tEnter studentmarks :");
		double marks = sc.nextDouble();
		System.out.print("\t\tEnter studentcontact :");
		long ph = sc.nextLong();
		System.out.print("\t\tEnter studentGender :");
		char gender = sc.next().charAt(0);
		System.out.println("Id :"+sid);
		System.out.println("marks :"+marks);
		System.out.println("contact :"+ph);
		System.out.println("gender :"+gender);
	}
}