package com.TestNGProgrammes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Group1_radioButtonsTesting extends BaseClass
{
	@Test
	public void group1_RadioButtonsTesting() throws InterruptedException
	{
		
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
		//driver.findElement(By.xpath("//input[@value='Water']")).click();

		/*driver.findElement(By.xpath("//input[value='Butter']")).click();
		driver.findElement(By.xpath("//input[value='Beer']")).click();

		driver.findElement(By.xpath("//input[value='Cheese']")).click();
		driver.findElement(By.xpath("//input[value='Wine']")).click();*/

		WebElement radioButtonsBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		//<input type="radio" name="group1" value="Milk">
		//<input type="radio" name="group1" value="Butter" checked="">
		//<input type="radio" name="group1" value="Cheese"> 

		//<input type="radio" name="group2" value="Water">
		//<input type="radio" name="group2" value="Beer">
		//<input type="radio" name="group2" value="Wine" checked="">

		List<WebElement> group1_RadioButtons=radioButtonsBlock.findElements(By.name("group1"));
		int group1_RadioButtonsCount=group1_RadioButtons.size();
		System.out.println("The Group1 Total No Of radio Buttons:"+group1_RadioButtonsCount);

		List<WebElement> group2_RadioButtons=radioButtonsBlock.findElements(By.name("group2"));
		int group2_RadioButtonsCount=group2_RadioButtons.size();
		System.out.println("The Group2 Total No.Of Radio Buttons:"+group2_RadioButtonsCount);
		System.out.println();
		
		for(int i=1;i<=3;i++) 
		{
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='group1']["+i+"]")).click();
			driver.findElement(By.xpath("//input[@name='group2']["+i+"]")).click(); 
			
			for(int k=0; k<group1_RadioButtonsCount; k++)
			{
				
				String g1_RadioButtonName1=group1_RadioButtons.get(k).getAttribute("value");
				String g1_RadioButtonName2=group1_RadioButtons.get(k).getAttribute("checked");
				System.out.println("Group-1 Element:"+g1_RadioButtonName1+"--"+g1_RadioButtonName2);
				
				String g2_RadioButtonName1=group2_RadioButtons.get(k).getAttribute("value");
				String g2_RadioButtonName2=group2_RadioButtons.get(k).getAttribute("checked");
				System.out.println("Group-2 Element:"+g2_RadioButtonName1+"--"+g2_RadioButtonName2);
				System.out.println();
			}
		}
		
		System.out.println();
	}
}
