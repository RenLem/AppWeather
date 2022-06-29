package com.renatopuskaric.AppWeather.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renatopuskaric.AppWeather.models.DataHour;
import com.renatopuskaric.AppWeather.models.Data_1H;
import com.renatopuskaric.AppWeather.models.Response;
import com.renatopuskaric.AppWeather.models.ResponseData;
import com.renatopuskaric.AppWeather.models.ResponseUnits;
import com.renatopuskaric.AppWeather.repositories.DataRepositoryCRUD;

@Service
public class DataService {
	
	@Autowired
	DataRepositoryCRUD dataRepositoryCRUD;
	
	@Autowired
	WeatherService weatherService;

	@Transactional
	public Response getAllData() {
		List<DataHour> dataList = new ArrayList<>();
		dataRepositoryCRUD.findAll().forEach(oneData -> dataList.add(oneData));
		return addDataToResponse(dataList);
	}
	
	@Transactional
	public Response getByHourData(List<Integer> idList) {
		List<DataHour> dataList = (List<DataHour>) dataRepositoryCRUD.findAllById(idList);
		return addDataToResponse(dataList);
	}
	
	@Transactional
	public Response getByTimeData(String timeFrom, String timeTo) {
		List<DataHour> dataList = dataRepositoryCRUD.findByTime(timeFrom, timeTo);	
		return addDataToResponse(dataList);

	}
	
	@Transactional
	public void updateData(DataHour data, int dataID) {
		dataRepositoryCRUD.save(data);
	}
	
	/*
	 * @Transactional public String delete() { dataRepositoryCRUD.deleteAll();
	 * 
	 * return "Data has been deleted from database!"; }
	 */
	
	public Response addDataToResponse(List<DataHour> dataList) {
		
		List<ResponseData> responseList = new ArrayList<ResponseData>();
		for (int i = 0; i < dataList.size(); i++) {
			ResponseData responseData = new ResponseData();
			DataHour dataHour = dataList.get(i);
			
			double calcFeelsLikeTemperature = weatherService.calcFeelsLikeTemperature(dataHour.getTemperature(), dataHour.getWindspeed());
			
			String footWear = weatherService.calcFootWear(dataHour.getTemperature(), dataHour.getPrecipitation(), dataHour.getSnowfraction());
			String bodyWear = weatherService.calcBodyWear(dataHour.getPrecipitation(), dataHour.getSnowfraction());
			
			responseData.setBodywear(bodyWear);
			responseData.setFootwear(footWear);
			responseData.setFeelsLikeTemperature(calcFeelsLikeTemperature);
			responseData.setDataHour(dataList.get(i));
			
			responseList.add(responseData);
		}
		
		Response response = new Response();
		response.setResponseData(responseList);
		response.setResponseUnits(new ResponseUnits());
		
		return response;
		
	}
	  
	 
	 
}
