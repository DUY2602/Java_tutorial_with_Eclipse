package demo;

import org.mindrot.jbcrypt.BCrypt;

public class Demo18 {
	public static void main(String[] args) {
		String password = "123";
		String hash = BCrypt.hashpw(password, BCrypt.gensalt());
		
		System.out.println(hash);
		System.out.println(BCrypt.checkpw(password, hash));
	}
}
