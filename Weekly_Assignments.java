import java.util.Scanner;
public class Weekly_Assignments {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Birth Year: ");
		int bdyear=scanner.nextInt();
		System.out.println("Enter Current Year: ");
		int year=scanner.nextInt();
		int age=year-bdyear;
		System.out.println("Age: "+age);
	}
}