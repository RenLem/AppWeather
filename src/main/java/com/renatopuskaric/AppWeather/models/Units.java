package com.renatopuskaric.AppWeather.models;

public class Units {
    private String time;
    private String predictability;
    private String precipitation_probability;
    private String pressure;
    private String relativehumidity;
    private String co;
    private String temperature;
    private String winddirection;
    private String precipitation;
    private String windspeed;


    // Getter Methods

    public String getTime() {
        return time;
    }

    public String getPredictability() {
        return predictability;
    }

    public String getPrecipitation_probability() {
        return precipitation_probability;
    }

    public String getPressure() {
        return pressure;
    }

    public String getRelativehumidity() {
        return relativehumidity;
    }

    public String getCo() {
        return co;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getWinddirection() {
        return winddirection;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public String getWindspeed() {
        return windspeed;
    }

    // Setter Methods

    public void setTime(String time) {
        this.time = time;
    }

    public void setPredictability(String predictability) {
        this.predictability = predictability;
    }

    public void setPrecipitation_probability(String precipitation_probability) {
        this.precipitation_probability = precipitation_probability;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setRelativehumidity(String relativehumidity) {
        this.relativehumidity = relativehumidity;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setWinddirection(String winddirection) {
        this.winddirection = winddirection;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed;
    }
}
