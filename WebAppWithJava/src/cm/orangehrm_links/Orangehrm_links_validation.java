package cm.orangehrm_links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangehrm_links_validation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();

		String url="https://opensource-demo.orangehrmlive.com";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		System.out.println("The Current Title Page is:"+driver.getTitle());
		System.out.println("The Current Page URL Page is:"+driver.getCurrentUrl());
		System.out.println("========================================================");

		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(5000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linksCount=links.size();
		System.out.println("The Tota No.Of Links In ORHRM Login Page are:"+linksCount);

		for(int pl=0; pl<linksCount; pl++)
		{
			if(links.get(pl).isDisplayed())
			{
				String linkNames=links.get(pl).getText();
				System.out.println(pl+"-"+"Link is"+":"+linkNames);
			}
		}
		System.out.println("---------------------------------------------------------------");

		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		String expected_LoginPageTitle="Welcome";
		System.out.println("The Expected Login Page Title is:"+expected_LoginPageTitle);

		WebElement actual_LoginPageTitle=driver.findElement(By.linkText("Welcome Admin"));
		String welcomeAdminText=actual_LoginPageTitle.getText();
		System.out.println("The Actual Login Page Title is:"+welcomeAdminText);


		if(welcomeAdminText.contains(expected_LoginPageTitle))
		{
			System.out.println("The Actual Login title is Matched--PASS");
		}
		else
		{
			System.out.println("The Actual login Text is Mismatched--FAIL");
		}
		System.out.println("The Current URL of Admin Page is:"+driver.getCurrentUrl());
		System.out.println("****************************************************************");



		//<input id="MP_link" type="button" class="button" value="Marketplace">

		//<a href="/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		//<a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>

		//class="menu"
		//WebElement headerBlockLinks=driver.findElements(By.className("menu"));



		WebElement pim_Element=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions act =new Actions(driver);
		act.moveToElement(pim_Element).perform();

		WebElement addEmployeeLink=driver.findElement(By.id("menu_pim_addEmployee"));
		addEmployeeLink.click();

		String expected_addEmployeePageTitle="Add";
		System.out.println("The Expected Employee Page Title is:"+expected_addEmployeePageTitle);



		WebElement actual_addEmployeePageTitle=driver.findElement(By.id("menu_pim_addEmployee"));
		//WebElement actual_addEmployeePageTitle=driver.findElement(By.linkText("Add Employee"));
		String actual_addEmployeePageTitlelink=actual_addEmployeePageTitle.getText();
		System.out.println("The Actual  Employee Add Page Title is:"+actual_addEmployeePageTitlelink);
		System.out.println("The Current URL of EMPLOYEE ADD page is:"+driver.getCurrentUrl());

		if(actual_addEmployeePageTitlelink.contains(expected_addEmployeePageTitle))
		{
			System.out.println("The Title Matched--PASS..");
		}
		else
		{
			System.out.println("The Title not matched---FAIL...");
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		//<input class="formInputText validation-error" maxlength="30" type="text" name="lastName" id="lastName">
		//<input type="button" class="" id="btnSave" value="Save">

		driver.findElement(By.id("firstName")).sendKeys("JANARDHAN");
		driver.findElement(By.id("lastName")).sendKeys("JOHNBOY");


		//<input class="formInputText valid" maxlength="10" type="text" 
		//name="employeeId" value="0042" id="employeeId">   

		//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0020" id="employeeId">

		WebElement expected_EmployeeId=driver.findElement(By.id("employeeId"));
		String expected_EmployeeId123=expected_EmployeeId.getAttribute("value");
		System.out.println("THe Expected Empid is:"+expected_EmployeeId123);
		System.out.println("The Current page URL is:"+driver.getCurrentUrl());
		driver.findElement(By.id("btnSave")).click();


		//<input value="0018" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" 
		//id="personal_txtEmployeeId" disabled="disabled">

		Thread.sleep(8000);
		WebElement actual_empid=driver.findElement(By.id("personal_txtEmployeeId"));
		String act_empid=actual_empid.getAttribute("value");
		System.out.println("The Acual Empid is:"+act_empid);
		System.out.println("The Current page URL is:"+driver.getCurrentUrl());

		if(act_empid.contains(expected_EmployeeId123))
		{
			System.out.println("The id Matched--PASS..");
		}
		else
		{
			System.out.println("The id not matched---FAIL...");
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		//<input value="JANARDHAN" type="text" name="personal[txtEmpFirstName]" 
		//class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">

		String expected_EmployeeListPageTitle="JANARDHAN";
		System.out.println("The Expected Employee List Title is:"+expected_EmployeeListPageTitle);

		//<a href="/index.php/pim/viewPimModule" id="menu_pim_viewPimModule"
		//class="firstLevelMenu"><b>PIM</b></a>

		WebElement actual_EmployeeListPageTitle=driver.findElement(By.xpath("//*[@id=\'profile-pic\']/h1"));
		String actual_EmployeelistPageTitlelink =actual_EmployeeListPageTitle.getText();
		System.out.println("The Actual Employee List Title is:"+actual_EmployeelistPageTitlelink);

		if(actual_EmployeelistPageTitlelink.contains(expected_EmployeeListPageTitle))
		{
			System.out.println("The Title matched--PASS...");
		}
		else
		{
			System.out.println("The Title is not matched--FAIL..");
		}
		System.out.println("The Current URL of EMPLOYEE LIST PAGE is:"+driver.getCurrentUrl());

		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		//<a href="#" data-dismiss="modal" id="aboutDisplayLink">About</a>
		//<a class="close" data-dismiss="modal">�</a>
		//<a href="/index.php/auth/logout">Logout</a>

		driver.findElement(By.id("welcome")).click();;
		driver.findElement(By.id("aboutDisplayLink")).click();;
		Thread.sleep(5000);
		driver.findElement(By.className("close")).click();;
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();;

		//driver.close();
	}

}
