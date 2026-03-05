package com.example.lab6;

/**
 * This class defines a City.
 */
public class City implements Comparable<City> {

    private String city;
    private String province;

    /**
     * Constructor to create a city object
     * @param city name of the city
     * @param province name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     * @return city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Returns the province name
     * @return province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Used to sort cities by city name
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Checks if two cities are equal
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        City other = (City) obj;

        return city.equals(other.city) &&
                province.equals(other.province);
    }
}