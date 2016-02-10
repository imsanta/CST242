import java.util.Scanner;
public class Password {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner keyboard=new Scanner(System.in);
			System.out.println("Input Password");
			String str=keyboard.nextLine();
			while (!str.equals("SecretWord")) {
				System.out.println("Invalid Password");
				str=keyboard.nextLine();
			}
			System.out.println("Your Password is correct");

		}

	}