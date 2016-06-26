
package com.example.terellbrown.checkyoself.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Provider_ {

    private String fax;
    private List<Location> locations = new ArrayList<Location>();
    private String npi;
    private String organizationName;
    private String otherOrganizationName;
    private String phone;
    private List<String> specialty = new ArrayList<String>();
    private List<String> specialtyPrimary = new ArrayList<String>();
    private List<String> specialtySecondary = new ArrayList<String>();
    private String uuid;
    private Boolean verified;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The locations
     */
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * 
     * @param locations
     *     The locations
     */
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * 
     * @return
     *     The npi
     */
    public String getNpi() {
        return npi;
    }

    /**
     * 
     * @param npi
     *     The npi
     */
    public void setNpi(String npi) {
        this.npi = npi;
    }

    /**
     * 
     * @return
     *     The organizationName
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * 
     * @param organizationName
     *     The organization_name
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * 
     * @return
     *     The otherOrganizationName
     */
    public String getOtherOrganizationName() {
        return otherOrganizationName;
    }

    /**
     * 
     * @param otherOrganizationName
     *     The other_organization_name
     */
    public void setOtherOrganizationName(String otherOrganizationName) {
        this.otherOrganizationName = otherOrganizationName;
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
     *     The specialty
     */
    public List<String> getSpecialty() {
        return specialty;
    }

    /**
     * 
     * @param specialty
     *     The specialty
     */
    public void setSpecialty(List<String> specialty) {
        this.specialty = specialty;
    }

    /**
     * 
     * @return
     *     The specialtyPrimary
     */
    public List<String> getSpecialtyPrimary() {
        return specialtyPrimary;
    }

    /**
     * 
     * @param specialtyPrimary
     *     The specialty_primary
     */
    public void setSpecialtyPrimary(List<String> specialtyPrimary) {
        this.specialtyPrimary = specialtyPrimary;
    }

    /**
     * 
     * @return
     *     The specialtySecondary
     */
    public List<String> getSpecialtySecondary() {
        return specialtySecondary;
    }

    /**
     * 
     * @param specialtySecondary
     *     The specialty_secondary
     */
    public void setSpecialtySecondary(List<String> specialtySecondary) {
        this.specialtySecondary = specialtySecondary;
    }

    /**
     * 
     * @return
     *     The uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 
     * @param uuid
     *     The uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 
     * @return
     *     The verified
     */
    public Boolean getVerified() {
        return verified;
    }

    /**
     * 
     * @param verified
     *     The verified
     */
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
