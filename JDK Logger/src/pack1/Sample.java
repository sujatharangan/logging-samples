package pack1;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
/*
 * Sample for logging using the java.util.Logger
 */
public class Sample {

	private static String CLASS_NAME="Sample";
	
	public static void main(String[] args) throws Exception {
		LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));
	 logSample();
	 logSample2();
	}
	
	public static void logSample() throws Exception{
		String METHOD_NAME="logSample";
		//Logger with bundle.
		Logger logger = Logger.getLogger(Sample.class.getName(),"resources.loggingbundle");
		logger.entering(CLASS_NAME,METHOD_NAME);
		//Locale.setDefault(Locale.ITALIAN);
		logger.logp(Level.FINEST, CLASS_NAME, METHOD_NAME, "200");
		logger.logp(Level.FINEST, CLASS_NAME, METHOD_NAME, "201","Ponniyin Selvan");
		logger.logp(Level.FINEST, CLASS_NAME, METHOD_NAME, "202",new Object[]{"'Ponniyin Selvan'","'Kalki'"});
		logger.exiting(CLASS_NAME,METHOD_NAME);
		
	}
	
	public static void logSample2() throws Exception{
		String METHOD_NAME="main";
		Logger logger = Logger.getLogger(Sample.class.getName());
		logger.entering(CLASS_NAME,METHOD_NAME);
	//	Locale.setDefault(Locale.ITALIAN);
		logger.logrb(Level.SEVERE, CLASS_NAME, METHOD_NAME,"resources.loggingbundle", "200");
		logger.logrb(Level.SEVERE, CLASS_NAME, METHOD_NAME, "resources.loggingbundle","201","Ponniyin Selvan");
		logger.logrb(Level.SEVERE, CLASS_NAME, METHOD_NAME, "resources.loggingbundle","202",new Object[]{"'Ponniyin Selvan'","'Kalki'"});
		logger.exiting(CLASS_NAME,METHOD_NAME);
	}
	
}
