package log4j.demo;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
//import org.apache.log4j.PropertyConfigurator;

public class SecondFile {

	static Logger logger=Logger.getLogger(SecondFile.class);
	static boolean isLoggerNotConfigured = true;
	
	private static final String COMMON_MESSAGE = "From SecondFile.java";
	
	public static void main(String[] args) {
		
		System.out.println(COMMON_MESSAGE);
		
//		PropertyConfigurator.configure("log4j.properties");
		
		
		try {
			
			FileAppender fileAppender;
			if(isLoggerNotConfigured) {
				
				fileAppender = FreshFileAppender.getFreshFileAppender(new PatternLayout(),"log4j_demo.log");
				
			}else {
				
				fileAppender = new FileAppender(new PatternLayout(),"log4j_demo.log");
			}
			
			logger.addAppender(new ConsoleAppender(new PatternLayout()));
			logger.addAppender(fileAppender);
			
		} catch (IOException e) {
			
			logger.trace(e.getLocalizedMessage());
		}
		
		
		logger.info(COMMON_MESSAGE+" : INFO");
		logger.error(COMMON_MESSAGE+" : ERROR");
		logger.warn(COMMON_MESSAGE+" : WARN");
		logger.debug(COMMON_MESSAGE+" : DEBUG");
		logger.trace(COMMON_MESSAGE+" : TRACE");
		logger.fatal(COMMON_MESSAGE+" : FATAL");
	}
	
	public static void secondaryMain(String args[]) {
		
		isLoggerNotConfigured = false;
		main(args);
	}
}