package com.demo.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;


import static com.codeborne.selenide.Condition.*;

public class TestCase {
	
	@Test
	public void checkLogin () {
		
		int x = 1;
        int y = 2;
        
        // Before Modification
        assertEquals(x, 1);
        assertEquals(y, 2);
         
        modify(x, y);
         
        // After Modification
        assertEquals(x, 1);
        assertEquals(y, 2);
    }
     
    public static void modify(int x1, int y1) {
       
    
		 System.out.println(x1);
   
    
    }
    
    
		
		// set the chromedriver.exe to system
       // System.setProperty("webdriver.chrome.driver", "D:\\MonsterWorkSpaces\\Workspace1\\DemoMonster\\src\\test\\resources\\drivers\\chromedriver.exe");
        // set the browser name to chrome
       // System.setProperty("selenide.browser", "Chrome");
        
		//open("https://www.spirit.com");
		
		//$$(By.xpath("//div[@class='header container']/div[@class='desktop']//a")).findBy(text("Sign-In")).click();
		
		/*ArrayList <String> a=new ArrayList<String>();
		a.add("vi");
		a.add("test");
		
		Collections.sort(a);
		
		 System.out.println(a);
		 
		 
		 
		 ArrayList <String> Veiw_map=new   ArrayList <String>();
		 Veiw_map.add("2");
		 Veiw_map.add("56");
		 int S=Veiw_map.size();
		Collections.synchronizedList(Veiw_map);
		Collections.sort(Veiw_map);
		 System.out.println(Veiw_map);
		 
		 for (int i=0;i<S;i++) {
			 
			 System.out.println(Veiw_map.get(i)+"hi");
			 
			public    calle()
			 
			 {*/
			
		    
			 
			
		
		
	}






