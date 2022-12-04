package swPrj;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	public Wallet wal;
	public Wallet getWal() {
		return wal;
	}
	public String Name;
	public String email;
	public int phoneNum;
	public String passwo;


	public User(String n, String p,String e) {
		
		Name=n;
		passwo=p;
		email=e;
		wal= new Wallet(0.0);
	}
	public int searchService() {
		Scanner myObj=new Scanner(System.in);
		Scanner myObj2=new Scanner(System.in);
		ArrayList<String> services= new ArrayList<String>();
		services.add("1-Mobile recharge services");
		services.add("2-Internet Payment services");
		services.add("3-Landline services");
		services.add("4-Donations");
		
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
