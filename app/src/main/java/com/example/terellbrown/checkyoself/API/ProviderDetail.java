package com.example.terellbrown.checkyoself.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fnord on 6/25/16.
 */

public class ProviderDetail {

    private Provider provider;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The provider
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     *
     * @param provider
     *     The provider
     */
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public class Education {

        private Integer graduationYear;
        private String medicalSchool;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         *     The graduationYear
         */
        public Integer getGraduationYear() {
            return graduationYear;
        }

        /**
         *
         * @param graduationYear
         *     The graduation_year
         */
        public void setGraduationYear(Integer graduationYear) {
            this.graduationYear = graduationYear;
        }

        /**
         *
         * @return
         *     The medicalSchool
         */
        public String getMedicalSchool() {
            return medicalSchool;
        }

        /**
         *
         * @param medicalSchool
         *     The medical_school
         */
        public void setMedicalSchool(String medicalSchool) {
            this.medicalSchool = medicalSchool;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
    public class Provider {

        private String birthDate;
        private String degree;
        private String description;
        private Education education;
        private String fax;
        private String firstName;
        private String gender;
        private String lastName;
        private List<License> licenses = new ArrayList<License>();
        private List<Licensure> licensures = new ArrayList<Licensure>();
        private List<Location> locations = new ArrayList<Location>();
        private String middleName;
        private String npi;
        private String phone;
        private String prefix;
        private List<Residency> residencies = new ArrayList<Residency>();
        private String smallImageUrl;
        private List<String> specialty = new ArrayList<String>();
        private List<String> specialtyPrimary = new ArrayList<String>();
        private List<String> specialtySecondary = new ArrayList<String>();
        private String uuid;
        private Boolean verified;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         *     The birthDate
         */
        public String getBirthDate() {
            return birthDate;
        }

        /**
         *
         * @param birthDate
         *     The birth_date
         */
        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        /**
         *
         * @return
         *     The degree
         */
        public String getDegree() {
            return degree;
        }

        /**
         *
         * @param degree
         *     The degree
         */
        public void setDegree(String degree) {
            this.degree = degree;
        }

        /**
         *
         * @return
         *     The description
         */
        public String getDescription() {
            return description;
        }

        /**
         *
         * @param description
         *     The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         *
         * @return
         *     The education
         */
        public Education getEducation() {
            return education;
        }

        /**
         *
         * @param education
         *     The education
         */
        public void setEducation(Education education) {
            this.education = education;
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
         *     The firstName
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         *
         * @param firstName
         *     The first_name
         */
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        /**
         *
         * @return
         *     The gender
         */
        public String getGender() {
            return gender;
        }

        /**
         *
         * @param gender
         *     The gender
         */
        public void setGender(String gender) {
            this.gender = gender;
        }

        /**
         *
         * @return
         *     The lastName
         */
        public String getLastName() {
            return lastName;
        }

        /**
         *
         * @param lastName
         *     The last_name
         */
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        /**
         *
         * @return
         *     The licenses
         */
        public List<License> getLicenses() {
            return licenses;
        }

        /**
         *
         * @param licenses
         *     The licenses
         */
        public void setLicenses(List<License> licenses) {
            this.licenses = licenses;
        }

        /**
         *
         * @return
         *     The licensures
         */
        public List<Licensure> getLicensures() {
            return licensures;
        }

        /**
         *
         * @param licensures
         *     The licensures
         */
        public void setLicensures(List<Licensure> licensures) {
            this.licensures = licensures;
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
         *     The middleName
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         *
         * @param middleName
         *     The middle_name
         */
        public void setMiddleName(String middleName) {
            this.middleName = middleName;
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
         *     The prefix
         */
        public String getPrefix() {
            return prefix;
        }

        /**
         *
         * @param prefix
         *     The prefix
         */
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        /**
         *
         * @return
         *     The residencies
         */
        public List<Residency> getResidencies() {
            return residencies;
        }

        /**
         *
         * @param residencies
         *     The residencies
         */
        public void setResidencies(List<Residency> residencies) {
            this.residencies = residencies;
        }

        /**
         *
         * @return
         *     The smallImageUrl
         */
        public String getSmallImageUrl() {
            return smallImageUrl;
        }

        /**
         *
         * @param smallImageUrl
         *     The small_image_url
         */
        public void setSmallImageUrl(String smallImageUrl) {
            this.smallImageUrl = smallImageUrl;
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

    public class Residency {

        private String institutionName;
        private String type;
        private Integer toYear;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         *     The institutionName
         */
        public String getInstitutionName() {
            return institutionName;
        }

        /**
         *
         * @param institutionName
         *     The institution_name
         */
        public void setInstitutionName(String institutionName) {
            this.institutionName = institutionName;
        }

        /**
         *
         * @return
         *     The type
         */
        public String getType() {
            return type;
        }

        /**
         *
         * @param type
         *     The type
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         *
         * @return
         *     The toYear
         */
        public Integer getToYear() {
            return toYear;
        }

        /**
         *
         * @param toYear
         *     The to_year
         */
        public void setToYear(Integer toYear) {
            this.toYear = toYear;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }
    }

    public class Licensure {

        private String expirationDate;
        private String number;
        private String state;
        private String status;
        private String verified;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         *     The expirationDate
         */
        public String getExpirationDate() {
            return expirationDate;
        }

        /**
         *
         * @param expirationDate
         *     The expiration_date
         */
        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }

        /**
         *
         * @return
         *     The number
         */
        public String getNumber() {
            return number;
        }

        /**
         *
         * @param number
         *     The number
         */
        public void setNumber(String number) {
            this.number = number;
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
         *     The status
         */
        public String getStatus() {
            return status;
        }

        /**
         *
         * @param status
         *     The status
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         *
         * @return
         *     The verified
         */
        public String getVerified() {
            return verified;
        }

        /**
         *
         * @param verified
         *     The verified
         */
        public void setVerified(String verified) {
            this.verified = verified;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
    public class License {

        private String number;
        private String state;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         *     The number
         */
        public String getNumber() {
            return number;
        }

        /**
         *
         * @param number
         *     The number
         */
        public void setNumber(String number) {
            this.number = number;
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

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Location {

        private List<String> addressLines = new ArrayList<String>();
        private String city;
        private List<Double> geoLocation = new ArrayList<Double>();
        private String phone;
        private List<String> role = new ArrayList<String>();
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
         *     The role
         */
        public List<String> getRole() {
            return role;
        }

        /**
         *
         * @param role
         *     The role
         */
        public void setRole(List<String> role) {
            this.role = role;
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
}
