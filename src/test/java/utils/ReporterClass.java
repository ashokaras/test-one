package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;

public class ReporterClass {

    private ExtentSparkReporter sparkReporter;
    private static ExtentReports extentReports;
    private ExtentTest extentTest;

    @BeforeSuite
    public void initializeReport(){
        sparkReporter = new ExtentSparkReporter("reports/report.html");
        extentReports = new ExtentReports();
    }
    @BeforeTest public void beforeTest(){ extentReports.attachReporter(sparkReporter);}
    @BeforeClass public void createNewTest(){ extentTest = extentReports.createTest(getClass().getName().substring(10));}
    @AfterSuite public void closeReport(){ extentReports.flush();}

    public void reportStep(String stepDescription){ extentTest.info(stepDescription);}
    public void reportPass(String stepDescription){ extentTest.pass(stepDescription);}
    public void reportFail(String stepDescription){ extentTest.fail(stepDescription);}
}