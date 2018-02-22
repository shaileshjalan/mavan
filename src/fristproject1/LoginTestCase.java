package fristproject1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.events.Event.ID;

public class LoginTestCase {
	
WebDriver driver =null;
	@BeforeClass
public void openbrowser(){
driver =new FirefoxDriver();
driver.get("file:///C:/Users/shree/Desktop/class/offline%20website/index.html");
	}
	@BeforeMethod
	public void Cleartest(){
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("password")).clear();
		
	}

	

	
@Test(priority=1,dataProvider="Testdp")
public void  BlankErrorTest(){
//WebDriver driver=new FirefoxDriver();
//driver.get("file:///C:/Users/shree/Desktop/class/offline%20website/index.html");
driver.findElement(By.id("email")).sendKeys("teft");
driver.findElement(By.id("password")).sendKeys("1234");
driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
String actMessage= driver.findElement(By.id("email_error")).getText();
String Expmessage="please enter mail";
Assert.assertEquals(actMessage, Expmessage);
driver.close();
}

@Test(priority=2,dataProvider="Testdp")
public void BValidTest(){
	//WebDriver driver=new FirefoxDriver();
	//driver.get("file:///C:/Users/shree/Desktop/class/offline%20website/index.html");
driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
	String acttitle= driver.findElement(By.id("email_error")).getText();
  String exptitle="Admin ";
   Assert.assertEquals(acttitle, exptitle);
   // driver.findElement(By.xpath("html/body/div[1]/header/nav/div/ul/li/a")).click();
	driver.close();
	}
//@Test(priority=3)
//public void singIN(){
//	//WebDriver driver=new FirefoxDriver();
//	driver.get("file:///C:/Users/shree/Desktop/class/offline%20website/index.html");
//driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("123456");
//	driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
//	String acttitle= driver.findElement(By.xpath("html/body/div[1]/div[2]/p")).getText();
//	String exptitle="Sign in to start your session ";
//	Assert.assertEquals(acttitle, exptitle);
//	driver.close();
//}
}


