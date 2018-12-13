package seleniumTestingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsi krishna.k\\Documents\\chromedriver\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("http://www.gmail.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("identifierId")).sendKeys("sid.aka.vamsi@gmail.com");
	     Thread.sleep(2000);
	     driver.findElement(By.className("CwaK9")).click();
	     Thread.sleep(2000);
	     String at = driver.getTitle();
	     String et = "gmail";
	     driver.close();
	     if(at.equalsIgnoreCase(et))
	     {
	    	 System.out.println("TestSuccessfull");
	     }
	     else
	     {
	    	 System.out.println("Test fail");
	     }
	     
	     
	     
	}

}
