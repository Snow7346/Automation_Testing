package mavenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class simpleExtentReports {

	public static void main(String[] args) {
		    ExtentSparkReporter htmlReport = new ExtentSparkReporter("AutomationReport.html");// class uses to create an HTML file.
            ExtentReports report = new ExtentReports();//class generates report and write the content on it.
            
            report.attachReporter(htmlReport);
            
            ExtentTest test1;
            
            report.setSystemInfo("Project name","MavenAutomationProject");
            report.setSystemInfo("Machine", "MAC");
            report.setSystemInfo("OS","macOS");
            report.setSystemInfo("Comapny name","StarAgile");
            report.setSystemInfo("User","Arun");
            report.setSystemInfo("Browser","Google Chrome");
            
            //config of look and feel of report
            
            htmlReport.config().setDocumentTitle("Automation_Report");
            htmlReport.config().setReportName("selenium Automation");
            htmlReport.config().setTheme(Theme.STANDARD);
            htmlReport.config().setTimeStampFormat("dd-MM-YYYY");
            
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            System.out.println(driver.getTitle());
            
            driver.close();
            
            test1 =  report.createTest("HomePage");
            test1.log(Status.PASS,MarkupHelper.createLabel("HomePage",ExtentColor.RED));
            
            WebDriver driver1 = new ChromeDriver();
            driver1.get("https://www.facebook.com/");
            System.out.println(driver1.getTitle());
            driver1.close();
            
            test1 = report.createTest("HomePage1");
            test1.log(Status.FAIL,MarkupHelper.createLabel("HomePage1",ExtentColor.GREEN));
            
            
            report.flush();
            
            
	}

}
