package Com.Tscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib4.General4;

public class TC001 extends General4 {
//public static void main(String[] args) throws Exception {
@Test	
	public void Testng()throws Exception {
	DOMConfigurator.configure("log4j.xml");

	General4 s=new General4();
	s.openapp();
	s.login();
	s.Add();
	s.Edit();
	s.delete();
	s.logout();
	s.closeapp();
}
}
