package MavensProject.DeepSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import credentials.LoginCred;
import credentials.LoginPojo;

public class LoginGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		System.out.println("Launched Browser By Chrome");

		driver.manage().window().maximize();
		System.out.println("Maximized Screen");

		String pageTitle = driver.getTitle();
		System.out.println("page Title"+pageTitle);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String currentURL =  driver.getCurrentUrl();
		System.out.println("current page url"+currentURL);
		
		LoginCred loginCred = new LoginCred();
		LoginPojo lp = loginCred.GmailCredential();

		//driver.findElement(By.xpath("")).click();
		System.out.println("username ::" + lp.getUserName());
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(lp.getUserName());
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(lp.getPassword());
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		System.out.println("Logged into website"); 

	}

}
