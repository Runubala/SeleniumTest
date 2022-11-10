package extentreportManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentMangerBase {
	
	public static  ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	
   public static ExtentReports getextentReport() {
	   if(extent == null) {
		   extent = new ExtentReports();
		   spark = new ExtentSparkReporter(System.getProperty("user.dir") + "\\extentreportfile\\");
		    spark.config().setReportName("my youtube channel");
		    spark.config().setDocumentTitle("ProjectName:javastrory");
		    spark.config().setTheme(Theme.DARK);
		    spark.config().setCss("uff-8");
		    extent.attachReporter(spark);
		   }
	   return extent;
	   
   }
}
