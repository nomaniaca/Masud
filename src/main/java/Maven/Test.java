package Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
   public void Masud() {
	   WebDriver Chromedriver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		Chromedriver.get("https://wwwapps.ups.com/doapp/signup");
		
		Chromedriver.manage().window().maximize();
		Chromedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Cookies = Chromedriver.findElement(By.className("showConsentpreferences_button"));
		Cookies.click();
		WebElement Confirm = Chromedriver.findElement(By.id("preferences_prompt_submit"));
		Confirm.click();
		WebElement Name = Chromedriver.findElement(By.xpath("//*[@id='ups-full_name_input']"));
		WebElement Email = Chromedriver.findElement(By.xpath("//*[@id='ups-email_input']"));
		WebElement UserID = Chromedriver.findElement(By.xpath("//*[@id='ups-user_id_input']"));
		WebElement Password = Chromedriver.findElement(By.xpath("//*[@id='ups-user_password_input']"));
		WebElement PhoneNumber = Chromedriver.findElement(By.xpath("//*[@id='ups-phone_input']"));
		WebElement CheckBox = Chromedriver.findElement(By.xpath("//*[@id='ups-checkbox_group']/div/label"));
		WebElement Signup = Chromedriver.findElement(By.xpath("//*[@id='main']/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[4]/div[3]/div/button/span"));
		
		
		Name.sendKeys("Masud Nomani");
		Email.sendKeys("nomaniaca");
		UserID.sendKeys("Masud Nomani");
		Password.sendKeys("39484398773");
		PhoneNumber.sendKeys("213 214 9820");
		CheckBox.click();
		Signup.click();
   }
}
