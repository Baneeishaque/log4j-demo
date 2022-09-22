package log4j.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SecondFile {

	static Logger logger=Logger.getLogger(SecondFile.class);
	
	private static final String COMMON_MESSAGE = "From SecondFile.java";
	
	public static void main(String[] args) {
		
		System.out.println(COMMON_MESSAGE);
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info(COMMON_MESSAGE+" : INFO");
		logger.error(COMMON_MESSAGE+" : ERROR");
		logger.warn(COMMON_MESSAGE+" : WARN");
		logger.debug(COMMON_MESSAGE+" : DEBUG");
		logger.trace(COMMON_MESSAGE+" : TRACE");
		logger.fatal(COMMON_MESSAGE+" : FATAL");
	}
}
