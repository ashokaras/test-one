package testCases;

import org.testng.annotations.Test;
import utils.BaseClass;

public class TC003_SampleTest extends BaseClass {

    @Test
    public void testThree(){
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportStep("Step 1 done");
        reportPass("Validation 1");
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
