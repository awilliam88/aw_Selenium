package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	
	@FindBy(id = " ")
	public WebElement username;
    
	@FindBy(id = " ")
	public WebElement password;
}
