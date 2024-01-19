package Pages;
import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
public class parent {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    public JavascriptExecutor javascript = (JavascriptExecutor) GWD.getDriver();
    public void scrollFocusElement(WebElement targetElement){
        javascript.executeScript("arguments[0].scrollIntoView();",targetElement);
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


}
