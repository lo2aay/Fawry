package swPrj;

import java.util.ArrayList;

public class account {
	
	ArrayList<User> userData;
	public account() {
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
	public int checkSignUp(String email) {
		for(int i=0;i<userData.size();i++) {
			if(userData.get(i).email.equals(email)) {
				return i;
			}
	}
		return -1;
		
	}
	public boolean signIn(String name, String passwo, String email) {
		if(checkSignIn(email,passwo)!=-1) {
			return true;
		}else {
			return false;
		}
	
	}
	public int checkSignIn(String email, String passwo) {
		for(int i=0;i<userData.size();i++) {
			if(userData.get(i).email.equals(email) && userData.get(i).passwo.equals(passwo)) {
				return i;
			}
		}
		return -1;
	}
}
