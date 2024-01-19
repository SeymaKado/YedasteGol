package Pages;

import Utilities.GWD;
import javafx.scene.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class allLocators extends parent {
    public allLocators(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "a[href='/Account/Login_Register'] ")
    public WebElement loginAndRegister;


    public WebElement getWebElement(String target) {
        switch (target) {

            case "loginAndRegister": return this.loginAndRegister;

        }
        return null;
    }
}
