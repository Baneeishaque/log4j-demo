package log4j.demo;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;

public class FreshFileAppender{

	public static FileAppender getFreshFileAppender(Layout layout, String filename) throws IOException {
		
		File file = new File(filename);
		if(file.exists())
		{
			file.delete();
		}
		return new FileAppender(layout, filename);
	}
}
