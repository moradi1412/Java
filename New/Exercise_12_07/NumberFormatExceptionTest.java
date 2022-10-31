import java.util.Scanner;

public class NumberFormatExceptionTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.print("Enter a binary: ");
		try {
			System.out.println(Number_Format_Exception.bin2Dec(input.nextLine()));
		}
		catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}
}