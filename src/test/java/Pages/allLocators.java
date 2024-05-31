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

    @FindBy(css = "a[href='/account/login-register")
    public WebElement loginAndRegister;


    @FindBy(css = "input[id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//button[@class='btn btn-success btn-block btn-small']")
    public WebElement entrance;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement code;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement entrance2;

    @FindBy(xpath = "//a[@href='/category/bouquet']/img")
    public WebElement firstBanner;

    @FindBy(xpath = "(//a[@href='/product/fl-1001/bouquet-of-10-red-roses'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//*[contains(text(),’سفارش دهید’)]")
    public WebElement orderButton;

    @FindBy(xpath = "//*[contains(text(),’سفارش دهید’)]")
    public WebElement date;

    //div[@data-id='dayAfterTomorrow']


    public WebElement getWebElement(String target) {
        switch (target) {

            case "loginAndRegister": return this.loginAndRegister;
            case "userName": return this.userName;
            case "entrance": return this.entrance;
            case "code": return this.code;
            case "entrance2": return this.entrance2;
            case "firstBanner": return this.firstBanner;
            case "firstProduct": return this.firstProduct;
            case "orderButton": return this.orderButton;
            case "date": return this.date;
        }
        return null;
    }


}
