package com.adactinhotelapp.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.adactinhotelapp.base.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager  extends BaseTest{
	public static ExtentReports  getReports()
	{
		
		String reportsFolderPath=System.getProperty("user.dir")+"\\reports";
		
		if(reports==null)
		{
			reports=new ExtentReports();
			
			File reportsFolder=new File(reportsFolderPath);
			reportsFolder.mkdir();
			
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

			String date = simpleDateFormat.format(new Date());
			System.out.println(date);
			date=date.replace(":", "-");
			System.out.println(date);
			
			File reportsFile=new File(reportsFolderPath+"\\"+date+".html");
			
			ExtentSparkReporter reporter=new ExtentSparkReporter(reportsFile);
			
			reporter.config().setDocumentTitle("Adactin QA Regression Results");
			
			reporter.config().setReportName("Regression Reports");
			
			reports.attachReporter(reporter);
			
		}
		
		return reports;
		
	}
}
