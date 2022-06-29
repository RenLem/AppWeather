package com.renatopuskaric.AppWeather.models;

public class MeteoBluePojo {

	private Metadata MetadataObject;
	private Units UnitsObject;
	
	Data_1H data_1hObject;
	
	Data_Day data_dayObject;
	



	public Data_1H getData_1h() {
		return data_1hObject;
	}

	public void setData_1h(Data_1H data_1h) {
		this.data_1hObject = data_1h;
	}
	
	
	
	
	// Getter Methods

	public Metadata getMetadata() {
		return MetadataObject;
	}

	public Units getUnits() {
		return UnitsObject;
	}

	public Data_Day getData_day() {
		return data_dayObject;
	}

	// Setter Methods

	public void setMetadata(Metadata metadataObject) {
		this.MetadataObject = metadataObject;
	}

	public void setUnits(Units unitsObject) {
		this.UnitsObject = unitsObject;
	}

	public void setData_day(Data_Day data_dayObject) {
		this.data_dayObject = data_dayObject;
	}

}
