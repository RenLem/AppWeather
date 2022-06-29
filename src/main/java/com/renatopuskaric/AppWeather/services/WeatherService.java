package com.renatopuskaric.AppWeather.services;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {
	
	/**
	 * In which Ta represents the air temperature in Celsius and v is the wind speed in km/h. 
	 * Therefore the formula does not apply in completely still conditions, 
	 * since wind speeds under 1.34 m/s would result in the calculation of a positive wind chill factor. 
	 * This has to with the insulating effect of the layer of air next to the skin, which remains warm in still conditions and is not displaced. 
	 * This means that the formula only starts being valid at a wind speed of 5 km/h.
	 * 
	 * Wind Chill Formula WCT = 13,12 + 0,6215 * airTempereture - 11,37 * windSpeed^0,16 + 0,3965 * airTempereture * windSpeed^0,16
	 * 
	 * @param airTempereture
	 * @param windSpeed
	 * @return feelLikeTemp
	 */
	
	public double calcFeelsLikeTemperature(double airTempereture, double windSpeed) {

		
		if (5 <= windSpeed && windSpeed <= 150 && (-50) <= airTempereture && airTempereture <= 10) {
			double feelLikeTemp = 13.12 + (0.6215 * airTempereture) - (11.37 * Math.pow(windSpeed, 0.16)) + (0.3965 * airTempereture * Math.pow(windSpeed, 0.16));
			
			System.out.println(feelLikeTemp);
	        DecimalFormat df2 = new DecimalFormat("###.##");
	        feelLikeTemp = Double.valueOf(df2.format(feelLikeTemp));
	        System.out.println(feelLikeTemp);

			return feelLikeTemp;
		}else {
			return airTempereture;
		}
		
		
		
	}
	
	public String calcFootWear(double airTempereture, double rain, double snow) {
		
		String footWear = "";
		String expected = "";
		
		if(rain>=5) {expected = "RAIN";}
		if(snow>=1) {expected = "SNOW";}
		
		if (airTempereture > 25) {
			footWear = "Sandals";
		}else if ((airTempereture >= 5 & airTempereture <= 25) && expected.equals("")) {
			footWear = "Light boots (sneakers, sport,..)";
		}else if ((airTempereture >= 5 & airTempereture <= 25) && (expected.equals("RAIN") | expected.equals("SNOW"))) {
			footWear = "Tall boots" + " " + expected;
		}else if ((airTempereture < 5)) {
			footWear = "Winter shoes";
		}else {
			footWear = "";
		}
		
		return footWear;
	}
	
	
	public String calcBodyWear(double rain, double snow) {

		String bodyWear = "";
		
		if (rain != 0 & snow == 0) {
			if (rain > 300) {
				bodyWear = "Boat";
			} else if (rain >= 5 & rain <= 300) {
				bodyWear = "Umbrella";
			} else if (rain < 5) {
				bodyWear = "(bodywear for light rain)";
			}
		}else if (snow != 0 & rain == 0) {
			if (snow >= 1) {
				bodyWear = "Hat + gloves";
			} else {
				bodyWear = "(bodywear for light snow)";
			}
		}else if (snow != 0 & rain == 0) {
				bodyWear = "";
		}
		

		return bodyWear;
	}

}
