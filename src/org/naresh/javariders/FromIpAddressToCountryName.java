/**
 * 
 */
package org.naresh.javariders;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * @author Naresh
 *
 */
public class FromIpAddressToCountryName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GeoIPService iPservice = new GeoIPService();
		
		GeoIPServiceSoap service =	iPservice.getGeoIPServiceSoap();
		
		GeoIP geoIP =	service.getGeoIP("212.58.246.79");
		
		System.out.println("IpAddress Name "+geoIP.getCountryName());

	}

}
