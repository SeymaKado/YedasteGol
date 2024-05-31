package StepDefinitions;

import Utilities.GWD;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void before(){
        //Start Scenario
    }
    @After
    public void after(Scenario testCase){
//        ExcelManager.excelWriter("Test Excel Reports/ExcelOutput.xlsx",testCase);
//        if (testCase.isFailed()){
//            TakesScreenshot screenshotTaker = (TakesScreenshot) Singleton_Driver.getDriver();
//            byte[] inMemoryState = screenshotTaker.getScreenshotAs(OutputType.BYTES);
//            testCase.attach(inMemoryState,"image/png","screenshot name");
//        }
      //  GWD.quitDriver();
    }
}
