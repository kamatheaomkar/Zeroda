package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SaurabhK\\Desktop\\Software testing\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");//opening site
driver.manage().window().maximize();
// switching to iframe
driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[@type='button']")).click();	

driver.switchTo().defaultContent();
}
}
