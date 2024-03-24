package Com.hrms.lib4;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import Com.Utility.Log;

public class General4 extends Global4 {

	public void openapp()throws Exception {
	driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(2000);
	}
	public void closeapp() {
		driver.close();
		//driver.quit();
	}
	
	public void login()throws Exception {
		driver.findElement(By.name(txtun)).sendKeys(un);
		driver.findElement(By.name(txtpw)).sendKeys(pw);
		driver.findElement(By.name(loginbtn)).click();
		System.out.println("Login completed");
		Reporter.log("login");
		Log.info("loginn");
Thread.sleep(3000);
	}
	public void logout() {
		driver.findElement(By.linkText(logoutbtn)).click();
		System.out.println("Logout completed");
		Reporter.log("logout");
		Log.info("logoutt");

	}
	
	public void Add() throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(addbtn)).click();
		driver.findElement(By.name(txtln)).sendKeys(ln);
		driver.findElement(By.name(txtfn)).sendKeys(fn);
		driver.findElement(By.id(sbtn)).click();
		System.out.println("Add completed");
		Reporter.log("Add");
		Log.info("Add");

		Thread.sleep(3000);
	}
	
	public void Edit()throws Exception {
		
		driver.findElement(By.name(ebtn)).click();
		driver.findElement(By.name(txtln)).clear();
		driver.findElement(By.name(txtln)).sendKeys(Eln);
		driver.findElement(By.name(txtfn)).clear();
		driver.findElement(By.name(txtfn)).sendKeys(Efn);
		driver.findElement(By.name(svbtn)).click();
		driver.findElement(By.xpath(backbtn)).click();
		System.out.println("edit completed");
		Reporter.log("Edit");
		Log.info("Editt");
		Thread.sleep(3000);
	}
	
public void delete () throws Exception{
	Select st=new Select(driver.findElement(By.name(ds)));
st.selectByVisibleText(empid);
driver.findElement(By.name(srchbx2)).sendKeys(empid4);
driver.findElement(By.xpath(srchbtn)).click();
driver.findElement(By.name(checkbx)).click();
driver.findElement(By.xpath(deletebtn)).click();
driver.switchTo().defaultContent();
System.out.println("delete completed");
driver.switchTo().defaultContent();
Reporter.log("Delete");
Log.info("deletee");
Thread.sleep(3000);
}
	}
	

