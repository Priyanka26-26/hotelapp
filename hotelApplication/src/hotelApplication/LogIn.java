/**
 * 
 */
package hotelApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Priyanka
 *
 */
public class LogIn {

	/**
	 * @param args
	 * @param WebElement email 
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanka\\eclipse-workspace\\hotelApplication\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("priyaaabbc");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("asdfghj");
		WebElement btn=driver.findElement(By.id("login"));
		btn.click();
		
		//for change password
		WebElement chngpwd= driver.findElement(By.xpath("//a[text()='Change Password']"));
		chngpwd.click();
		WebElement curpwd=driver.findElement(By.name("current_pass"));
		curpwd.sendKeys("asdfghj");
		WebElement newpwd=driver.findElement(By.name("new_password"));
		newpwd.sendKeys("qwertyu");
		WebElement confpwd=driver.findElement(By.name("re_password"));
		confpwd.sendKeys("qwertyu");
		WebElement btn1=driver.findElement(By.id("Submit"));
		btn1.click();
	}

	
}
