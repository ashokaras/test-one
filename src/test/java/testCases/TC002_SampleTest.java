package testCases;

import org.testng.annotations.Test;
import utils.BaseClass;

public class TC002_SampleTest extends BaseClass {

    @Test
    public void testTwo(){
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportFail("Validation 1");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportPass("Validation 2");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportPass("Validation 3");
    }

}
