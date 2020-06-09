package io.bytelogic.api.common;

import java.io.IOException;

import io.bytelogic.api.common.Props.ConfigProps;

public class Resources {

	
	/**
	 * Gets the API key
	 * 
	 * @return {@link String}
	 * 
	 * @throws IOException
	 */
	public static String getAPIKey(){
		return ConfigProps.API_KEY;
	}
	
	private static String country() {
		return "/country/";
	}
	
	private static String region(){
		return "/region/";
	}
	
	public static String allCountryResource() {
		return country() + "all/";
	}
	
	public static String countryCodeResource() {
		return country() + "code/" + Constants.REPLACER + "/";
	}
	
	public static String countrySearchResource() {
		return country() + "search/";
	}
	
	public static String regionCountryCodeResource() {
		return region() + Constants.REPLACER + "/all/";
	}
}
