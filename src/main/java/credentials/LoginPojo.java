package credentials;

public class LoginPojo {

	private String UserName;
	private String Password;
	
	public LoginPojo() {
		// TODO Auto-generated constructor stub
	}
	
	public LoginPojo(String userName, String password) {
		super();
		UserName = userName;
		Password = password;
	}
	

	

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String name) {
		UserName = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Pass) {
		Password = Pass;
	}

}
