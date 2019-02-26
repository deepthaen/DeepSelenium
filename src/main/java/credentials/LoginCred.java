package credentials;

public class LoginCred {

	public LoginPojo Credentials() {
		return new LoginPojo("deeptha@arvindinternet.com", "nnnow123");
	}

	public LoginPojo CredentialsV2() {
		// return new LoginPojo("deeptha@arvindinternet.com", "nnnow123");
		LoginPojo lp = new LoginPojo();
		lp.setUserName("deeptha@arvindinternet.com");
		lp.setPassword("nnnow123");
		return lp;
	}

	
	public LoginPojo GmailCredential() {
		LoginPojo lp = new LoginPojo();
		lp.setUserName("deenai1000@gmail.com");
		lp.setPassword("nnnow123");
		return lp;
	}
	/*
	 * public LoginPojo s() { return ""; }
	 */

	
	public LoginPojo CredentialsNaukri() {
		// return new LoginPojo("deeptha@arvindinternet.com", "nnnow123");
		LoginPojo lp = new LoginPojo();
		lp.setUserName("deepthaen@gmail.com");
		lp.setPassword("nnnow123");
		return lp;
	}

	
}
