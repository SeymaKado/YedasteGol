package StepDefinitions;

import Pages.allLocators;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.WebElement;

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
    public void enterDataInTextBox() {

    }

}
