package com.renatopuskaric.AppWeather.models;


import java.util.ArrayList;

public class Data_Day {

	ArrayList<String> time;
	ArrayList<Integer> pictocode;
	ArrayList<Integer> uvindex;
	ArrayList<Double> temperature_max;
	ArrayList<Double> temperature_min;
	ArrayList<Double> temperature_mean;
	ArrayList<Double> felttemperature_max;
	ArrayList<Double> felttemperature_min;
	ArrayList<Integer> winddirection;
	ArrayList<Integer> precipitation_probability;
	ArrayList<String> rainspot;
	ArrayList<Integer> predictability_class;
	ArrayList<Integer> predictability;
	ArrayList<Double> precipitation;
	ArrayList<Double> snowfraction;
	ArrayList<Integer> sealevelpressure_max;
	ArrayList<Integer> sealevelpressure_min;
	ArrayList<Integer> sealevelpressure_mean;
	ArrayList<Double> windspeed_max;
	ArrayList<Double> windspeed_mean;
	ArrayList<Double> windspeed_min;
	ArrayList<Integer> relativehumidity_max;
	ArrayList<Integer> relativehumidity_min;
	ArrayList<Integer> relativehumidity_mean;
	ArrayList<Double> convective_precipitation;
	ArrayList<Double> precipitation_hours;
	ArrayList<Double> humiditygreater90_hours;

	// Getter Methods

	public ArrayList<String> getTime() {
		return time;
	}

	public ArrayList<Integer> getPictocode() {
		return pictocode;
	}

	public ArrayList<Integer> getUvindex() {
		return uvindex;
	}

	public ArrayList<Double> getTemperature_max() {
		return temperature_max;
	}

	public ArrayList<Double> getTemperature_min() {
		return temperature_min;
	}

	public ArrayList<Double> getTemperature_mean() {
		return temperature_mean;
	}

	public ArrayList<Double> getFelttemperature_max() {
		return felttemperature_max;
	}

	public ArrayList<Double> getFelttemperature_min() {
		return felttemperature_min;
	}

	public ArrayList<Integer> getWinddirection() {
		return winddirection;
	}

	public ArrayList<Integer> getPrecipitation_probability() {
		return precipitation_probability;
	}

	public ArrayList<String> getRainspot() {
		return rainspot;
	}

	public ArrayList<Integer> getPredictability_class() {
		return predictability_class;
	}

	public ArrayList<Integer> getPredictability() {
		return predictability;
	}

	public ArrayList<Double> getPrecipitation() {
		return precipitation;
	}

	public ArrayList<Double> getSnowfraction() {
		return snowfraction;
	}

	public ArrayList<Integer> getSealevelpressure_max() {
		return sealevelpressure_max;
	}

	public ArrayList<Integer> getSealevelpressure_min() {
		return sealevelpressure_min;
	}

	public ArrayList<Integer> getSealevelpressure_mean() {
		return sealevelpressure_mean;
	}

	public ArrayList<Double> getWindspeed_max() {
		return windspeed_max;
	}

	public ArrayList<Double> getWindspeed_mean() {
		return windspeed_mean;
	}

	public ArrayList<Double> getWindspeed_min() {
		return windspeed_min;
	}

	public ArrayList<Integer> getRelativehumidity_max() {
		return relativehumidity_max;
	}

	public ArrayList<Integer> getRelativehumidity_min() {
		return relativehumidity_min;
	}

	public ArrayList<Integer> getRelativehumidity_mean() {
		return relativehumidity_mean;
	}

	public ArrayList<Double> getConvective_precipitation() {
		return convective_precipitation;
	}

	public ArrayList<Double> getPrecipitation_hours() {
		return precipitation_hours;
	}

	public ArrayList<Double> getHumiditygreater90_hours() {
		return humiditygreater90_hours;
	}

	// Setter Methods

	public void setTime(ArrayList<String> time) {
		this.time = time;
	}

	public void setPictocode(ArrayList<Integer> pictocode) {
		this.pictocode = pictocode;
	}

	public void setUvindex(ArrayList<Integer> uvindex) {
		this.uvindex = uvindex;
	}

	public void setTemperature_max(ArrayList<Double> temperature_max) {
		this.temperature_max = temperature_max;
	}

	public void setTemperature_min(ArrayList<Double> temperature_min) {
		this.temperature_min = temperature_min;
	}

	public void setTemperature_mean(ArrayList<Double> temperature_mean) {
		this.temperature_mean = temperature_mean;
	}

	public void setFelttemperature_max(ArrayList<Double> felttemperature_max) {
		this.felttemperature_max = felttemperature_max;
	}

	public void setFelttemperature_min(ArrayList<Double> felttemperature_min) {
		this.felttemperature_min = felttemperature_min;
	}

	public void setWinddirection(ArrayList<Integer> winddirection) {
		this.winddirection = winddirection;
	}

	public void setPrecipitation_probability(ArrayList<Integer> precipitation_probability) {
		this.precipitation_probability = precipitation_probability;
	}

	public void setRainspot(ArrayList<String> rainspot) {
		this.rainspot = rainspot;
	}

	public void setPredictability_class(ArrayList<Integer> predictability_class) {
		this.predictability_class = predictability_class;
	}

	public void setPredictability(ArrayList<Integer> predictability) {
		this.predictability = predictability;
	}

	public void setPrecipitation(ArrayList<Double> precipitation) {
		this.precipitation = precipitation;
	}

	public void setSnowfraction(ArrayList<Double> snowfraction) {
		this.snowfraction = snowfraction;
	}

	public void setSealevelpressure_max(ArrayList<Integer> sealevelpressure_max) {
		this.sealevelpressure_max = sealevelpressure_max;
	}

	public void setSealevelpressure_min(ArrayList<Integer> sealevelpressure_min) {
		this.sealevelpressure_min = sealevelpressure_min;
	}

	public void setSealevelpressure_mean(ArrayList<Integer> sealevelpressure_mean) {
		this.sealevelpressure_mean = sealevelpressure_mean;
	}

	public void setWindspeed_max(ArrayList<Double> windspeed_max) {
		this.windspeed_max = windspeed_max;
	}

	public void setWindspeed_mean(ArrayList<Double> windspeed_mean) {
		this.windspeed_mean = windspeed_mean;
	}

	public void setWindspeed_min(ArrayList<Double> windspeed_min) {
		this.windspeed_min = windspeed_min;
	}

	public void setRelativehumidity_max(ArrayList<Integer> relativehumidity_max) {
		this.relativehumidity_max = relativehumidity_max;
	}

	public void setRelativehumidity_min(ArrayList<Integer> relativehumidity_min) {
		this.relativehumidity_min = relativehumidity_min;
	}

	public void setRelativehumidity_mean(ArrayList<Integer> relativehumidity_mean) {
		this.relativehumidity_mean = relativehumidity_mean;
	}

	public void setConvective_precipitation(ArrayList<Double> convective_precipitation) {
		this.convective_precipitation = convective_precipitation;
	}

	public void setPrecipitation_hours(ArrayList<Double> precipitation_hours) {
		this.precipitation_hours = precipitation_hours;
	}

	public void setHumiditygreater90_hours(ArrayList<Double> humiditygreater90_hours) {
		this.humiditygreater90_hours = humiditygreater90_hours;
	}

}