package com.renatopuskaric.AppWeather.models;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "DATA_DAY_TABLE")
public class DataDay {
	
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Europe/Zagreb")
    Date time;
	@Column
	int pictocode;
	@Column
	int uvindex;
	@Column
	double temperature_max;
	@Column
	double temperature_min;
	@Column
	double temperature_mean;
	@Column
	double felttemperature_max;
	@Column
	double felttemperature_min;
	@Column
	int winddirection;
	@Column
	int precipitation_probability;
	@Column
	String rainspot;
	@Column
	int predictability_class;
	@Column
	int predictability;
	@Column
	double precipitation;
	@Column
	double snowfraction;
	@Column
	int sealevelpressure_max;
	@Column
	int sealevelpressure_min;
	@Column
	int sealevelpressure_mean;
	@Column
	double windspeed_max;
	@Column
	double windspeed_mean;
	@Column
	double windspeed_min;
	@Column
	int relativehumidity_max;
	@Column
	int relativehumidity_min;
	@Column
	int relativehumidity_mean;
	@Column
	double convective_precipitation;
	@Column
	double precipitation_hours;
	@Column
	double humiditygreater90_hours;
    

    public DataDay() {
		super();
	}

	// Getter Methods
    
	public int getId() {
		return id;
	}

    public Date getTime() {
		return time;
	}


	public int getPictocode() {
		return pictocode;
	}

	public int getUvindex() {
		return uvindex;
	}

	public double getTemperature_max() {
		return temperature_max;
	}

	public double getTemperature_min() {
		return temperature_min;
	}

	public double getTemperature_mean() {
		return temperature_mean;
	}

	public double getFelttemperature_max() {
		return felttemperature_max;
	}

	public double getFelttemperature_min() {
		return felttemperature_min;
	}

	public int getWinddirection() {
		return winddirection;
	}

	public int getPrecipitation_probability() {
		return precipitation_probability;
	}

	public String getRainspot() {
		return rainspot;
	}

	public int getPredictability_class() {
		return predictability_class;
	}

	public int getPredictability() {
		return predictability;
	}

	public double getPrecipitation() {
		return precipitation;
	}

	public double getSnowfraction() {
		return snowfraction;
	}

	public int getSealevelpressure_max() {
		return sealevelpressure_max;
	}

	public int getSealevelpressure_min() {
		return sealevelpressure_min;
	}

	public int getSealevelpressure_mean() {
		return sealevelpressure_mean;
	}

	public double getWindspeed_max() {
		return windspeed_max;
	}

	public double getWindspeed_mean() {
		return windspeed_mean;
	}

	public double getWindspeed_min() {
		return windspeed_min;
	}

	public int getRelativehumidity_max() {
		return relativehumidity_max;
	}

	public int getRelativehumidity_min() {
		return relativehumidity_min;
	}

	public int getRelativehumidity_mean() {
		return relativehumidity_mean;
	}

	public double getConvective_precipitation() {
		return convective_precipitation;
	}

	public double getPrecipitation_hours() {
		return precipitation_hours;
	}

	public double getHumiditygreater90_hours() {
		return humiditygreater90_hours;
	}

	
    // Setter Methods
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTime(Date time) {
		this.time = time;
	}

	public void setPictocode(int pictocode) {
		this.pictocode = pictocode;
	}

	public void setUvindex(int uvindex) {
		this.uvindex = uvindex;
	}

	public void setTemperature_max(double temperature_max) {
		this.temperature_max = temperature_max;
	}

	public void setTemperature_min(double temperature_min) {
		this.temperature_min = temperature_min;
	}

	public void setTemperature_mean(double temperature_mean) {
		this.temperature_mean = temperature_mean;
	}

	public void setFelttemperature_max(double felttemperature_max) {
		this.felttemperature_max = felttemperature_max;
	}

	public void setFelttemperature_min(double felttemperature_min) {
		this.felttemperature_min = felttemperature_min;
	}

	public void setWinddirection(int winddirection) {
		this.winddirection = winddirection;
	}

	public void setPrecipitation_probability(int precipitation_probability) {
		this.precipitation_probability = precipitation_probability;
	}

	public void setRainspot(String rainspot) {
		this.rainspot = rainspot;
	}

	public void setPredictability_class(int predictability_class) {
		this.predictability_class = predictability_class;
	}

	public void setPredictability(int predictability) {
		this.predictability = predictability;
	}

	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}

	public void setSnowfraction(double snowfraction) {
		this.snowfraction = snowfraction;
	}

	public void setSealevelpressure_max(int sealevelpressure_max) {
		this.sealevelpressure_max = sealevelpressure_max;
	}

	public void setSealevelpressure_min(int sealevelpressure_min) {
		this.sealevelpressure_min = sealevelpressure_min;
	}

	public void setSealevelpressure_mean(int sealevelpressure_mean) {
		this.sealevelpressure_mean = sealevelpressure_mean;
	}

	public void setWindspeed_max(double windspeed_max) {
		this.windspeed_max = windspeed_max;
	}

	public void setWindspeed_mean(double windspeed_mean) {
		this.windspeed_mean = windspeed_mean;
	}

	public void setWindspeed_min(double windspeed_min) {
		this.windspeed_min = windspeed_min;
	}

	public void setRelativehumidity_max(int relativehumidity_max) {
		this.relativehumidity_max = relativehumidity_max;
	}

	public void setRelativehumidity_min(int relativehumidity_min) {
		this.relativehumidity_min = relativehumidity_min;
	}

	public void setRelativehumidity_mean(int relativehumidity_mean) {
		this.relativehumidity_mean = relativehumidity_mean;
	}

	public void setConvective_precipitation(double convective_precipitation) {
		this.convective_precipitation = convective_precipitation;
	}

	public void setPrecipitation_hours(double precipitation_hours) {
		this.precipitation_hours = precipitation_hours;
	}

	public void setHumiditygreater90_hours(double humiditygreater90_hours) {
		this.humiditygreater90_hours = humiditygreater90_hours;
	}

	public void setTime(String string) {
		String[] stringArray = string.split("-");
		int year = Integer.valueOf(stringArray[0]);
		int month = Integer.valueOf(stringArray[1]);
		int day = Integer.valueOf(stringArray[2]);
		Date date = new Date(year, month, day);
		this.time = date;
	
	}
	
	

	
}
