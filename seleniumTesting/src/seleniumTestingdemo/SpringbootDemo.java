package seleniumTestingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpringbootDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsi krishna.k\\Documents\\chromedriver\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("http://localhost:8083/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("username")).sendKeys("vamsi@gmail.com");
	     Thread.sleep(2000);
	     driver.findElement(By.id("password")).sendKeys("123");
	     Thread.sleep(2000);
	     driver.findElement(By.id("subbtn")).click();
	     Thread.sleep(2000);
	     String at = driver.getTitle();
	     String et = "vamsi@gmail.com";
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
