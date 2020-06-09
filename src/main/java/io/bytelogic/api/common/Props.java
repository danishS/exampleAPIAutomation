package io.bytelogic.api.common;


public class Props {
	public interface GroupProps{
		public static String DEBUG = "Debug";
		public static String FULL = "Full";
	}
	
	public interface ConfigProps{
		public static String API_KEY = System.getProperty("apikey");
	}
}
