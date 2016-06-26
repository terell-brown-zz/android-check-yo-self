
package com.example.terellbrown.checkyoself.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {

    private List<String> addressLines = new ArrayList<String>();
    private String city;
    private String county;
    private String fax;
    private List<Double> geoLocation = new ArrayList<Double>();
    private String phone;
    private String state;
    private String zipcode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The addressLines
     */
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * 
     * @param addressLines
     *     The address_lines
     */
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The county
     */
    public String getCounty() {
        return county;
    }

    /**
     * 
     * @param county
     *     The county
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * 
     * @return
     *     The fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * 
     * @param fax
     *     The fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 
     * @return
     *     The geoLocation
     */
    public List<Double> getGeoLocation() {
        return geoLocation;
    }

    /**
     * 
     * @param geoLocation
     *     The geo_location
     */
    public void setGeoLocation(List<Double> geoLocation) {
        this.geoLocation = geoLocation;
    }

    /**
     * 
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 
     * @param zipcode
     *     The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
