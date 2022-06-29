package com.renatopuskaric.AppWeather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AppWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppWeatherApplication.class, args);

		System.out.println("App is running");
	}

}
