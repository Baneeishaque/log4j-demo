package log4j.demo;

//import java.io.IOException;

//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.ConsoleAppender;
//import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;

public class Main {

	private static final String COMMON_MESSAGE = "From Main.java";
	
//	private static final String logEntryPattern = "%r [%t] %-5p %c - %m%n";
//	private static final String logEntryPattern = "%-4r [%t] %-5p %c %x - %m%n";
//	private static final String logEntryPattern = "%d [%t] %-5p %c - %m%n";
//	private static final String logEntryPattern = "%5p [%t] (%F:%L) - %m%n";
	
	static Logger logger=Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		System.out.println(COMMON_MESSAGE);
		
//		logger.addAppender(new ConsoleAppender(new PatternLayout()));
//		try {
//			
//			logger.addAppender(new FileAppender(new PatternLayout(),"log4j_demo.log"));
//			
//		} catch (IOException e) {
//			
//			logger.trace(e.getLocalizedMessage());
//		}
		
//		logger.addAppender(new ConsoleAppender(new PatternLayout(logEntryPattern )));
//		try {
//			
//			logger.addAppender(new FileAppender(new PatternLayout(logEntryPattern ),"log4j_demo.log"));
//			
//		} catch (IOException e) {
//			
//			logger.trace(e.getLocalizedMessage());
//		}

//		BasicConfigurator.configure();
//		try {
//			
//			BasicConfigurator.configure(new FileAppender(new PatternLayout(),"log4j_demo.log"));
//	
//		} catch (IOException e) {
//
//			logger.trace(e.getLocalizedMessage());
//		}

//		BasicConfigurator.configure();
//		try {
//			
//			BasicConfigurator.configure(new FileAppender(new PatternLayout(logEntryPattern),"log4j_demo.log"));
//	
//		} catch (IOException e) {
//
//			logger.trace(e.getLocalizedMessage());
//		}

		PropertyConfigurator.configure("log4j.properties");
		
		logger.info(COMMON_MESSAGE+" : INFO");
		logger.error(COMMON_MESSAGE+" : ERROR");
		logger.warn(COMMON_MESSAGE+" : WARN");
		logger.debug(COMMON_MESSAGE+" : DEBUG");
		logger.trace(COMMON_MESSAGE+" : TRACE");
		logger.fatal(COMMON_MESSAGE+" : FATAL");
		
		SecondFile.main(args);
	}
}
