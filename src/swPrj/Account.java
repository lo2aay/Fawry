package swPrj;

import java.util.ArrayList;

public class Account {
	
	static ArrayList<User> userData;
	public Account() {
		userData = new ArrayList<User>();
		userData.add(new User("","",""));
	}
	public boolean signUp(String name, String passwo, String email) {
		if(checkSignUp(email)==-1) {
			User user = new User(name,passwo,email);
			userData.add(user);
			return true;
		}else {
			return false;
		}
	}
	public boolean checkSignOut() {
		if(userData.size()==0) {
			return false;
		}
		return true;
	}
	public int checkSignUp(String email) {
		for(int i=0;i<userData.size();i++) {
			if(userData.get(i).email.equals(email)) {
				
				return i;
			}
	}
		return -1;
		
	}
	public boolean signIn(String name, String passwo, String email) {
		if(checkSignIn(email,passwo)!=null) {
			
			return true;
		}else {
			return false;
		}
	
	}
	static User checkSignIn(String email, String passwo) {
		for(int i=0;i<userData.size();i++) {
			if(userData.get(i).email.equals(email) && userData.get(i).passwo.equals(passwo)) {
				return userData.get(i);
			}
		}
		return null;
	}
}
