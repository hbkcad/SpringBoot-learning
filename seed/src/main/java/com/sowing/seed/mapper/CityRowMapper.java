package com.sowing.seed.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sowing.seed.model.City;

public class CityRowMapper implements RowMapper<City>
{
    @Override
    public City mapRow(ResultSet rs, int rowNum) throws SQLException 
    {
        City city = new City();
        city.setCityID(rs.getInt("cityID"));
        city.setCityName(rs.getString("cityName"));
        
        return city;
    }
}