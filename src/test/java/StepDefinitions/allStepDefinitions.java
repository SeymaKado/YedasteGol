package StepDefinitions;

import Pages.allLocators;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class allStepDefinitions extends GWD {
    allLocators aL = new allLocators();

    @Given("Navigate To Website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://yedastegol.com/");
    }

    @When("Click On The Element")
    public void clickOnTheElement(DataTable value) {
        List<String> stringList = value.asList(String.class);
        for (int i = 0; i < stringList.size(); i++) {
            String elementName = stringList.get(i);
            WebElement webElement = aL.getWebElement(elementName);
            aL.elementToClick(webElement);

        }
    }

    @And("Verification Progress")
    public void verificationProgress(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement verifyElements = aL.getWebElement(elementLinks.get(i).get(0));
            aL.textVerifyResult(verifyElements, elementLinks.get(i).get(1));
        }
    }

    @Then("Enter Data in Text Box")
    public void enterDataInTextBox(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement sendKeysElements = aL.getWebElement(elementLinks.get(i).get(0));
            aL.inputElement(sendKeysElements, elementLinks.get(i).get(1));
        }

    }

    @When("Click On The Element WithJavascript")
    public void clickOnTheElementWithJavascript(DataTable value) {
        List<String> stringList = value.asList(String.class);
        for (String elementName : stringList) {
            WebElement webElement = aL.getWebElement(elementName);
            aL.clickByJavaScript(webElement);
        }

    }


    @Then("Hover On The Element")
    public void hoverOnTheElement(DataTable value) {
        List<String> elementNames = value.asList(String.class);
        for (String elementName : elementNames) {
            WebElement elementToHover = aL.getWebElement(elementName);
            aL.hoverTarget(elementToHover);
        }


    }
}
