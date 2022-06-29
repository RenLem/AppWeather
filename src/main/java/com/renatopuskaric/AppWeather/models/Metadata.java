package com.renatopuskaric.AppWeather.models;

public class Metadata {
    private String name;
    private float latitude;
    private float longitude;
    private float height;
    private String timezone_abbrevation;
    private float utc_timeoffset;
    private String modelrun_utc;
    private String modelrun_updatetime_utc;


    // Getter Methods

    public String getName() {
        return name;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getHeight() {
        return height;
    }

    public String getTimezone_abbrevation() {
        return timezone_abbrevation;
    }

    public float getUtc_timeoffset() {
        return utc_timeoffset;
    }

    public String getModelrun_utc() {
        return modelrun_utc;
    }

    public String getModelrun_updatetime_utc() {
        return modelrun_updatetime_utc;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setTimezone_abbrevation(String timezone_abbrevation) {
        this.timezone_abbrevation = timezone_abbrevation;
    }

    public void setUtc_timeoffset(float utc_timeoffset) {
        this.utc_timeoffset = utc_timeoffset;
    }

    public void setModelrun_utc(String modelrun_utc) {
        this.modelrun_utc = modelrun_utc;
    }

    public void setModelrun_updatetime_utc(String modelrun_updatetime_utc) {
        this.modelrun_updatetime_utc = modelrun_updatetime_utc;
    }
}
