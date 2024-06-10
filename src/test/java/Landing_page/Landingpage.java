package Landing_page;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Landingpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("naukari.com");
		
		
		Thread.sleep(2000);
		List<WebElement> autosuggestiondrop = driver.findElements(By.xpath("//ul//li[@role='presentation']"));
		
		for(int i=0; i<autosuggestiondrop.size(); i++) 
		{
			String textnau="naukri.com";
			
			if(autosuggestiondrop.get(i).getText().equalsIgnoreCase(textnau)) 
					
			{
				autosuggestiondrop.get(i).click();
			}
		}
		
		List<WebElement> naukariList= driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		System.out.print(naukariList);
		
	
//		WebElement str=driver.findElement(By.xpath("//h1[text()='Find your dream job now']"));
//		
//		String drop = "Find your dream job now";
//		
//		if(str.getText().equalsIgnoreCase(drop))
//		{
//			System.out.println("pass");
//		}
//		
//		else 
//		{
//			System.out.println("fail");
//
//		}
		
		
//      click on loging button
		
//		driver.findElement(By.xpath("//a[@class='nI-gNb-lg-rg__login']")).click();
//		Thread.sleep(2000);

		//click on google singup button
		
		//driver.findElement(By.xpath("//h1[text()='Find your dream job now']"));
		//Thread.sleep(2000);
		
		
		
//		driver.findElement(By.xpath("//div[@data-email='harshitpanday905@gmail.com']")).click();
//		Thread.sleep(2000);
//		

	}

}
