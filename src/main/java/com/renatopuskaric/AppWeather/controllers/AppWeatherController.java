package com.renatopuskaric.AppWeather.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.renatopuskaric.AppWeather.constants.Constant;
import com.renatopuskaric.AppWeather.models.DataHour;
import com.renatopuskaric.AppWeather.models.Data_1H;
import com.renatopuskaric.AppWeather.models.MeteoBluePojo;
import com.renatopuskaric.AppWeather.models.Response;
import com.renatopuskaric.AppWeather.services.DataService;


@RestController
@EnableCaching
public class AppWeatherController {

	@Autowired
	DataService dataService;
	
    @Scheduled(cron = " 0 10 03 * * *", zone = "Europe/Zagreb")
    public void populateDB() {
        getApiData();
    }
    
	@GetMapping("/time")
	public Response getByTimeData(@RequestParam(value = "time_from", defaultValue = "2022-06-29 14:00:00") String timeFrom,
			@RequestParam(value = "time_to", defaultValue = "2022-06-30 14:00:00") String timeTo) {
		return dataService.getByTimeData(timeFrom, timeTo);	
	}

	@GetMapping("/all")
	public Response getAllForcast() {
		return dataService.getAllData();
	}
	

	@GetMapping("/byhour")
	public Response getDayForcast(@RequestParam(value = "num_of_hours", defaultValue = "24") String nextHours) {
		List<Integer> idList = new ArrayList<Integer>();
		int id = Integer.parseInt(nextHours);
		for(int i = 1; i <= id; i++) {
			idList.add(i);
		}
		
		return dataService.getByHourData(idList);
	}

	@GetMapping("/load_forcast_to_db")
	public Response getApiData() {

		RestTemplate restTemplate = new RestTemplateBuilder().build();

		MeteoBluePojo meteoBluePojo = restTemplate.getForObject(Constant.URL_METEOBLUE_HOURLY, MeteoBluePojo.class);
		
		saveDataDay(meteoBluePojo);

		return dataService.getAllData();
	}
	
	/*
	 * @DeleteMapping("/delete_all") public String deleteAll() { return
	 * dataService.deleteAll(); }
	 */

	private void saveDataDay(MeteoBluePojo meteoBluePojo) {
		
		Data_1H data_1h = meteoBluePojo.getData_1h();
		
		int updateID = 1;
		for (int i = 0; i < data_1h.getTime().size(); i++) {

			DataHour data = new DataHour();
			
			data.setId(updateID);
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date date = new Date();
			try {
				date = formatter.parse((data_1h.getTime().get(i)));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			data.setTime(date);
			data.setRainspot(data_1h.getRainspot().get(i));
			data.setPrecipitation(data_1h.getPrecipitation().get(i));
			data.setSnowfraction(data_1h.getSnowfraction().get(i));
			data.setTemperature(data_1h.getTemperature().get(i));
			data.setFelttemperature(data_1h.getFelttemperature().get(i));
			data.setPictocode(data_1h.getPictocode().get(i));
			data.setWindspeed(data_1h.getWindspeed().get(i));
			data.setWinddirection(data_1h.getWinddirection().get(i));
			data.setRelativehumidity(data_1h.getRelativehumidity().get(i));
			data.setSealevelpressure(data_1h.getSealevelpressure().get(i));
			data.setPrecipitation_probability(data_1h.getPrecipitation_probability().get(i));
			data.setConvective_precipitation(data_1h.getConvective_precipitation().get(i));
			data.setIsdaylight(data_1h.getIsdaylight().get(i));
			data.setUvindex(data_1h.getUvindex().get(i));
			

			dataService.updateData(data, updateID);
			updateID++;

		}

	}

}
