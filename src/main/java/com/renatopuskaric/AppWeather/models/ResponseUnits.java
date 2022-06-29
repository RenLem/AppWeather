package com.renatopuskaric.AppWeather.models;

public class ResponseUnits {
	
	private final String time = "YYYY-MM-DD hh:mm";
	private final String precipitation_probability = "percent";
	private final String pressure = "hPa";
	private final String relativehumidity = "percent";
	private final String co = "ug/m3";
	private final String precipitation = "mm";
	private final String temperature = "C";
	private final String windspeed = "ms-1";
	private final String winddirection = "degree";
	private final String predictability = "percent";
	
	
	public String getTime() {
		return time;
	}
	public String getPrecipitation_probability() {
		return precipitation_probability;
	}
	public String getPressure() {
		return pressure;
	}
	public String getRelativehumidity() {
		return relativehumidity;
	}
	public String getCo() {
		return co;
	}
	public String getPrecipitation() {
		return precipitation;
	}
	public String getTemperature() {
		return temperature;
	}
	public String getWindspeed() {
		return windspeed;
	}
	public String getWinddirection() {
		return winddirection;
	}
	public String getPredictability() {
		return predictability;
	}
	
	

}
