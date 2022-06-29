package com.renatopuskaric.AppWeather.models;

import java.util.ArrayList;

public class Data_1H {

	ArrayList<String>  time;
	ArrayList<Double>  precipitation;
	ArrayList<Double>  snowfraction;
	ArrayList<String>  rainspot;
	ArrayList<Double>  temperature;
	ArrayList<Double>  felttemperature;
	ArrayList<Integer> pictocode;
	ArrayList<Double>  windspeed;
	ArrayList<Integer> winddirection;
	ArrayList<Integer> relativehumidity;
	ArrayList<Double>  sealevelpressure;
	ArrayList<Integer> precipitation_probability;
	ArrayList<Double>  convective_precipitation;
	ArrayList<Integer> isdaylight;
	ArrayList<Integer> uvindex;
	

	//Getter Methods
	
	
	public ArrayList<String> getTime() {
		return time;
	}
	public ArrayList<Double> getPrecipitation() {
		return precipitation;
	}
	public ArrayList<Double> getSnowfraction() {
		return snowfraction;
	}
	public ArrayList<String> getRainspot() {
		return rainspot;
	}
	public ArrayList<Double> getTemperature() {
		return temperature;
	}
	public ArrayList<Double> getFelttemperature() {
		return felttemperature;
	}
	public ArrayList<Integer> getPictocode() {
		return pictocode;
	}
	public ArrayList<Double> getWindspeed() {
		return windspeed;
	}
	public ArrayList<Integer> getWinddirection() {
		return winddirection;
	}
	public ArrayList<Integer> getRelativehumidity() {
		return relativehumidity;
	}
	public ArrayList<Double> getSealevelpressure() {
		return sealevelpressure;
	}
	public ArrayList<Integer> getPrecipitation_probability() {
		return precipitation_probability;
	}
	public ArrayList<Double> getConvective_precipitation() {
		return convective_precipitation;
	}
	public ArrayList<Integer> getIsdaylight() {
		return isdaylight;
	}
	public ArrayList<Integer> getUvindex() {
		return uvindex;
	}
	
	
	//Setter Methods
	
	public void setTime(ArrayList<String> time) {
		this.time = time;
	}
	public void setPrecipitation(ArrayList<Double> precipitation) {
		this.precipitation = precipitation;
	}
	public void setSnowfraction(ArrayList<Double> snowfraction) {
		this.snowfraction = snowfraction;
	}
	public void setRainspot(ArrayList<String> rainspot) {
		this.rainspot = rainspot;
	}
	public void setTemperature(ArrayList<Double> temperature) {
		this.temperature = temperature;
	}
	public void setFelttemperature(ArrayList<Double> felttemperature) {
		this.felttemperature = felttemperature;
	}
	public void setPictocode(ArrayList<Integer> pictocode) {
		this.pictocode = pictocode;
	}
	public void setWindspeed(ArrayList<Double> windspeed) {
		this.windspeed = windspeed;
	}
	public void setWinddirection(ArrayList<Integer> winddirection) {
		this.winddirection = winddirection;
	}
	public void setRelativehumidity(ArrayList<Integer> relativehumidity) {
		this.relativehumidity = relativehumidity;
	}
	public void setSealevelpressure(ArrayList<Double> sealevelpressure) {
		this.sealevelpressure = sealevelpressure;
	}
	public void setPrecipitation_probability(ArrayList<Integer> precipitation_probability) {
		this.precipitation_probability = precipitation_probability;
	}
	public void setConvective_precipitation(ArrayList<Double> convective_precipitation) {
		this.convective_precipitation = convective_precipitation;
	}
	public void setIsdaylight(ArrayList<Integer> isdaylight) {
		this.isdaylight = isdaylight;
	}
	public void setUvindex(ArrayList<Integer> uvindex) {
		this.uvindex = uvindex;
	}
	
	


}
