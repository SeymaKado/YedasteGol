package StepDefinitions;

import Pages.*;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
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

    @Then("Select Menu")
    public void selectFromDropdown(DataTable dataTable)  {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> columns : rows) {
            String elementName = columns.get(0);
            String value = columns.get(1);
            WebElement dropdownElement = aL.getWebElement(elementName);
            aL.dropdownHandler(dropdownElement, value);
            //  aL.dropdownHandler(dropdownElement, dropdownElement.getText());
            //dropdownHandler.dropdownHandler(dropdownElement, value);
        }
    }




//        parent p=new parent();
//        p.dropdownHandler(aL.cityDropdownName,"تبریز");




        /*
        WebElement dropdownElement = new allLocators().getWebElement(dropdownName);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(dropdownElement));
        wait.until(ExpectedConditions.elementToBeClickable(dropdownElement));
        Select dropdownControl = new Select(dropdownElement);
        dropdownControl.selectByValue(value);

         */
    }



//    @Then("SelectCity")
//    public void SelectCity() {
///**
//        // Dropdown menüyü bulun
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement dropdownElement = driver.findElement(By.xpath("(//select[@placeholder='شهر خود را انتخاب کنید'])[1]"));
//
//
//        // Dropdown menüyü seçin
//        Select dropdown = new Select(dropdownElement);
//        // dropdown.selectByValue("441");  // Seçmek istediğiniz metni girin
//        dropdown.selectByVisibleText("اراک");
//
//        // Seçilen öğeyi tıklayın (gerekiyorsa)
//        WebElement selectedOption = dropdown.getFirstSelectedOption();
//        selectedOption.click();
//
//        */
//    }


//    @Then("SelectCalendar")
//    public void selectcalendar() {
//        // Dropdown menüyü bulun
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@data-id='tomorrow'][h3='فردا']"))));
//        //WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='tomorrow'][h3='فردا']")));
//
//        // Dropdown menüyü seçin
//        Select dropdown = new Select(dropdownElement);
//        //dropdown.selectByValue("441");  // Seçmek istediğiniz metni girin
//        dropdown.selectByVisibleText("دوشنبه 14 خرداد");
//
//        // Seçilen öğeyi tıklayın (gerekiyorsa)
//        WebElement selectedOption = dropdown.getFirstSelectedOption();
//        selectedOption.click();
//
//    }

//    @Then("SelectTime")
//    public void selecttime() {
//        // Dropdown menüyü bulun
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id='intervals-dropdown']"));
//
//        // Dropdown menüyü seçin
//        Select dropdown = new Select(dropdownElement);
//        //dropdown.selectByValue("441");  // Seçmek istediğiniz metni girin
//        dropdown.selectByVisibleText("12:00 - 16:00");
//
//        // Seçilen öğeyi tıklayın (gerekiyorsa)
//        WebElement selectedOption = dropdown.getFirstSelectedOption();
//        selectedOption.click();
//    }



