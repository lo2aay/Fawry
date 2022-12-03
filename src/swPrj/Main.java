package swPrj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		account newone= new account();
		// TODO Auto-generated method stub
		while (true) {
		System.out.println("Enter your choice:");
		System.out.println("1-Sign up");
		System.out.println("2-Sign in");
		System.out.println("3-Sign out");
		Scanner myObj = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		int choice = myObj.nextInt();

		if(choice == 1) {
			System.out.println("Enter your username:");
			String name= myObj2.nextLine();
			System.out.println("Enter your password:");
			String password=myObj2.nextLine();
			System.out.println("Enter your Email:");
			String email=myObj2.nextLine();
			if(newone.signUp(name, password, email)) {
				System.out.println("Signed up successfully");
			}else {
				System.out.println("This account is already existed");
			}
			}
		else if(choice ==2){
			System.out.println("Enter your username:");
			String name2= myObj2.nextLine();
			System.out.println("Enter your password:");
			String password2=myObj2.nextLine();
			System.out.println("Enter your Email:");
			String email2=myObj2.nextLine();
			if(newone.signIn(name2, password2, email2)) {
				System.out.println("Signed In successfully");
				User newOne = new User(name2,password2,email2);
				System.out.println("Do you want to search for services?");
				System.out.println("1-Yes");
				System.out.println("2-No");
				Scanner search = new Scanner(System.in);
				int sea=search.nextInt();
				if(sea==1) {
					newOne.searchService();
					if(newOne.searchService()==1) {
						
					}
				}
				else {
					System.out.println("Okay :(");
				}
			}else {
				System.out.println("Wrong info");
			}
		}else if (choice == 3) {
			System.out.println("Signed out successfully");
			continue;
		}else {
			break;
		}

	}
	}
}
