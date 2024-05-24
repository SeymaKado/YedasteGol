package Pages;

import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Utilities.GWD.driver;

public class parent {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    public JavascriptExecutor javascript = (JavascriptExecutor) GWD.getDriver();

    public static final int WAIT_TIMEOUT_SECONDS = 10;

    public void scrollFocusElement(WebElement targetElement) {
        javascript.executeScript("arguments[0].scrollIntoView(true);", targetElement);
    }

    public void elementToClick(WebElement targetElement) {
        wait.until(ExpectedConditions.visibilityOf(targetElement));
        scrollFocusElement(targetElement);
        targetElement.click();
    }


    public void inputElement(WebElement element, String str) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollFocusElement(element);
        element.clear();
        element.sendKeys(str);
    }

    public void textVerifyResult(WebElement targetElement, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(targetElement, value));
        Assert.assertTrue(targetElement.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }


    public void clickByJavaScript(WebElement targetElement) {
        wait.until(ExpectedConditions.visibilityOf(targetElement));
        wait.until(ExpectedConditions.elementToBeClickable(targetElement));
        scrollFocusElement(targetElement);
        javascript.executeScript("arguments[0].click();", targetElement);
    }


    //click li hover click istemesen click yazan yeri kaldr build kalsn
    public void hoverTarget(WebElement targetElement){
        Actions actions = new Actions(GWD.getDriver());
        wait.until(ExpectedConditions.visibilityOf(targetElement));
        Action action = actions.moveToElement(targetElement).click().build();
        action.perform();
    }


}









