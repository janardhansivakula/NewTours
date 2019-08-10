package com.JqueryUi.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_IdentifyElement_DragMeToMyTarget_And_AutomateResizableElement 
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();

		String url ="https://jqueryui.com/droppable/";
		driver.navigate().to(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		//id="draggable"--property of drag me to my target

		WebElement dragElement=driver.findElement(By.id("draggable"));

		String dragElement_Text=dragElement.getText();
		System.out.println("The drag element text:"+dragElement_Text);
		/*<div id="droppable" class="ui-widget-header ui-droppable">
		 	<p>Drop here</p>
		 	</div>*/

		WebElement dropElement=driver.findElement(By.id("droppable"));
		String dropElement_Text=dropElement.getText();
		System.out.println("The drop element text:"+dropElement_Text);


		Actions act =new Actions(driver);
		act.dragAndDrop(dragElement, dropElement).perform();

		/*driver.switchTo().defaultContent();
		//<a href="https://jqueryui.com/selectable/">Selectable</a>
		//<a href="https://jqueryui.com/selectable/">Selectable</a>
		driver.findElement(By.linkText("Selectable")).click();;
		System.out.println("The title of the selectble link is:"+driver.getTitle());


        driver.quit();*/
	}

}
