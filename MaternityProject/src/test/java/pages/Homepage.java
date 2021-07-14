package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.maternity.test.BaseTest;

public class Homepage extends BaseTest  {
	
	WebDriver dr;

	//@FindBy(xpath = "//span[text()='Shop by Trimester']")WebElement MaternitySubMenu;

	
	 @Test
		public void hoverOverOnMaternity() throws InterruptedException {
		dr.findElement(By.xpath("/html/body/div[4]/button")).click();
		Thread.sleep(7000);
		Actions act = new Actions(dr);
		WebElement element = dr.findElement(By.xpath("//*[@id=\"topNavWrapper\"]/div/div/ul/li[9]/div[1]/a"));
		act.moveToElement(element).build().perform();
		Thread.sleep(10000);
		dr.findElement(By.id("//*[@id=\"megaNav\"]")).click();
	 }
//    
//	public void clickOnShopByTrimester() throws InterruptedException {
//    	Actions act = new Actions(dr);
//		WebElement element = dr.findElement(By.xpath("//*[@id=\"topNavWrapper\"]/div/div/ul/li[9]/div[1]/a"));
//		act.moveToElement(element).build().perform();
//
//
//		//hoverOverOnMaternity();
//		Thread.sleep(5000);
//		//MaternitySubMenu.click();
//		dr.findElement(By.xpath("//span[text()='Shop by Trimester']")).click();
//
//	}

//	@Test()
//	public void clickOnElement() throws InterruptedException {
//		
//		hoverOverOnMaternity();
//        Thread.sleep(5000);
//        dr.findElement(By.xpath("//span[text()='Maternity Friendly Styles']")).click();

}
