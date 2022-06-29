package com.renatopuskaric.AppWeather.repositories;

import java.util.Date;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.renatopuskaric.AppWeather.models.DataDay;
import com.renatopuskaric.AppWeather.models.DataHour;
import com.renatopuskaric.AppWeather.models.Data_1H;

@Repository
public interface DataRepositoryCRUD extends CrudRepository<DataHour, Integer> {
	
	// SELECT * FROM DATA_HOUR_TABLE WHERE DATA_HOUR_TABLE.time = '2022-06-29 14:00:00'

	@Query(value = "SELECT * FROM DATA_HOUR_TABLE WHERE DATA_HOUR_TABLE.time >= ?1 AND DATA_HOUR_TABLE.time <= ?2 ", nativeQuery = true)
	List<DataHour> findByTime(String timeFrom, String timeTo);
}
