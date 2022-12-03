package swPrj;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	public String Name;
	public String email;
	public int phoneNum;
	public String passwo;


	public User(String n, String p,String e) {
		// TODO Auto-generated constructor stub
		Name=n;
		passwo=p;
		email=e;

	}
	public int searchService() {
		Scanner myObj=new Scanner(System.in);
		Scanner myObj2=new Scanner(System.in);
		ArrayList<String> services= new ArrayList<String>();
		services.add("1-Mobile recharge services");
		services.add("2-Internet Payment services");
		services.add("3-Landline services");
		services.add("4-Donations");
		System.out.println("What service you want to search for?");
		String search=myObj.nextLine();
		boolean found=false;

		for(String i:services) {
			if(i.toLowerCase().contains(search.toLowerCase())) {
				found = true;
				System.out.println(i);
			}
		}
		if(found) {
			System.out.println("What service you want to use?");
			int choice = myObj2.nextInt();
			return choice;
		} else {
			System.out.println("Invalid search");
			return -1;
		}


	}

	

}
