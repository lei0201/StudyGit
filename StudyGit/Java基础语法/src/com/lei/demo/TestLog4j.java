package com.lei.demo;

//import java.util.Properties;

//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Level;
import org.apache.log4j.Logger;//导入log4j.jra包
//import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class TestLog4j {
	static Logger logger=Logger.getLogger(TestLog4j.class);//获取日志对象
	public static void main (String[]args)throws 
	InterruptedException{	
		/*
		 * BasicConfigurator.configure();//进行默认配置
		
		logger.setLevel(Level.DEBUG);//设置日志输出级别
		 */
		//PropertyConfigurator 是配置log4j.propererties的
		//DOMConfigurator 是配置log4j.xml的
		DOMConfigurator .configure("E:\\git\\StudyGit\\Java基础语法\\src\\com\\lei\\demo\\log4j.xml");
		for (int i=0;i<5000;i++) {
			logger.trace("跟踪信息");
			logger.debug("调试信息");
			logger.info("输出信息");
			//Thread.sleep(1000);
			logger.warn("警告信息");
			logger.error("错误信息");
			logger.fatal("致命信息");
		}
		
	}

}
