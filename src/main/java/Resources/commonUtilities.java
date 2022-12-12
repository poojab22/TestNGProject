package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonUtilities {

 //This is common method for dropdown handling
 public static void dropdwonHandle(WebElement dropdwonXpath,int dropdwonValue) {
  
   Select s=new Select(dropdwonXpath);
   s.selectByIndex(dropdwonValue);
 
   
 }
 
 public static void handleAssertions() {
  
  
 }
 
 
 
 
 
 
 
 
}