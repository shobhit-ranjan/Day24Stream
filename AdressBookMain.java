import java.util.Scanner;

 public class AdressBookMain {

	public static void main(String[] args) {
		

		System.out.println("Welcome to Address book program..");

		AdressBookUser Entery = new AdressBookUser();
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many entry you want to make this time");
		Entery.addContact();
		Entery.editContact();
		Entery.DeleteUserEntery();

		sc.close();
	}

}
