package com.renatopuskaric.AppWeather.models;

import java.util.List;

public class Response {
	
	private ResponseUnits responseUnits;
	private List<ResponseData> responseData;
	
	
	public ResponseUnits getResponseUnits() {
		return responseUnits;
	}
	public void setResponseUnits(ResponseUnits responseUnits) {
		this.responseUnits = responseUnits;
	}
	public List<ResponseData> getResponseData() {
		return responseData;
	}
	public void setResponseData(List<ResponseData> responseData) {
		this.responseData = responseData;
	}
	
	

}
