package com.renatopuskaric.AppWeather.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "DATA_HOUR_TABLE")
public class DataHour {
	
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Europe/Zagreb")
	Date time;
	@Column
	Double precipitation;
	@Column
	Double snowfraction;
	@Column
	String rainspot;
	@Column
	Double temperature;
	@Column
	Double felttemperature;
	@Column
	Integer pictocode;
	@Column
	Double windspeed;
	@Column
	Integer winddirection;
	@Column
	Integer relativehumidity;
	@Column
	Double sealevelpressure;
	@Column
	Integer precipitation_probability;
	@Column
	Double convective_precipitation;
	@Column
	Integer isdaylight;
	@Column
	Integer uvindex;
	
	
	//Getter Methods
	
	
	public int getId() {
		return id;
	}
	public Date getTime() {
		return time;
	}
	public Double getPrecipitation() {
		return precipitation;
	}
	public Double getSnowfraction() {
		return snowfraction;
	}
	public String getRainspot() {
		return rainspot;
	}
	public Double getTemperature() {
		return temperature;
	}
	public Double getFelttemperature() {
		return felttemperature;
	}
	public Integer getPictocode() {
		return pictocode;
	}
	public Double getWindspeed() {
		return windspeed;
	}
	public Integer getWinddirection() {
		return winddirection;
	}
	public Integer getRelativehumidity() {
		return relativehumidity;
	}
	public Double getSealevelpressure() {
		return sealevelpressure;
	}
	public Integer getPrecipitation_probability() {
		return precipitation_probability;
	}
	public Double getConvective_precipitation() {
		return convective_precipitation;
	}
	public Integer getIsdaylight() {
		return isdaylight;
	}
	public Integer getUvindex() {
		return uvindex;
	}
	
	//Setter Methods
	

	public void setId(int id) {
		this.id = id;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public void setPrecipitation(Double precipitation) {
		this.precipitation = precipitation;
	}
	public void setSnowfraction(Double snowfraction) {
		this.snowfraction = snowfraction;
	}
	public void setRainspot(String rainspot) {
		this.rainspot = rainspot;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public void setFelttemperature(Double felttemperature) {
		this.felttemperature = felttemperature;
	}
	public void setPictocode(Integer pictocode) {
		this.pictocode = pictocode;
	}
	public void setWindspeed(Double windspeed) {
		this.windspeed = windspeed;
	}
	public void setWinddirection(Integer winddirection) {
		this.winddirection = winddirection;
	}
	public void setRelativehumidity(Integer relativehumidity) {
		this.relativehumidity = relativehumidity;
	}
	public void setSealevelpressure(Double sealevelpressure) {
		this.sealevelpressure = sealevelpressure;
	}
	public void setPrecipitation_probability(Integer precipitation_probability) {
		this.precipitation_probability = precipitation_probability;
	}
	public void setConvective_precipitation(Double convective_precipitation) {
		this.convective_precipitation = convective_precipitation;
	}
	public void setIsdaylight(Integer isdaylight) {
		this.isdaylight = isdaylight;
	}
	public void setUvindex(Integer uvindex) {
		this.uvindex = uvindex;
	}
	
	

}
