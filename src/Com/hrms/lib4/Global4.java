package Com.hrms.lib4;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Global4 {
	public WebDriver driver;
	//**Test Data
	//LoginLogout
	public String un="nareshit";
	public String pw="nareshit";
	//Add
	public String fn="Madhav";
	public String ln="wadje";
	//Edit
	public String Efn="Manual";
	public String Eln="Automation";
//delete
	public String empid4="10003";
	

	//objects
	//loginlogout
	public String txtun="txtUserName";
	public String txtpw="txtPassword";
	public String loginbtn="Submit";
	public String logoutbtn="Logout";
	//Add
	public String addbtn="//input[@value='Add']";
	public String txtfn="txtEmpFirstName";
	public String txtln="txtEmpLastName";
	public String sbtn="btnEdit";      //id
//Edit
	public String ebtn="EditMain";
//	public String txtefn="txtEmpFirstName";
//	public String txteln="txtEmpLastName";
	public String svbtn="EditMain";
	public String backbtn="//input[@value='Back']";
//delete
	public String ds="loc_code";
	public String empid="Emp. ID";
	public String checkbx="chkLocID[]";
	public String srchbx2="loc_code";
	public String srchbtn="//input[@type='button']";
	public String deletebtn="//input[@value='Delete']";
}
