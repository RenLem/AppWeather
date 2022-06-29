package com.renatopuskaric.AppWeather.models;

public class ResponseData {

	String bodywear;
	String footwear;
	double feelsLikeTemperature;
	DataHour dataHour;
	
	
	public DataHour getDataHour() {
		return dataHour;
	}
	public void setDataHour(DataHour dataHour) {
		this.dataHour = dataHour;
	}
	public String getBodywear() {
		return bodywear;
	}
	public void setBodywear(String bodywear) {
		this.bodywear = bodywear;
	}
	public String getFootwear() {
		return footwear;
	}
	public void setFootwear(String footwear) {
		this.footwear = footwear;
	}
	public double getFeelsLikeTemperature() {
		return feelsLikeTemperature;
	}
	public void setFeelsLikeTemperature(double feelsLikeTemperature) {
		this.feelsLikeTemperature = feelsLikeTemperature;
	}
	
	
	

}
