package xmlParameterization;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class PractiseTest1 
{
	@Test
	public void demoTest(XmlTest xml)         //we will pass the Xmltest is a class that will pass the prameter
	{
		System.out.println("in demo test");
		System.out.println(xml.getParameter("url"));
		System.out.println(xml.getParameter("username"));
		System.out.println(xml.getParameter("password"));
	}

}
