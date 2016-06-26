package com.example.terellbrown.checkyoself.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fnord on 6/25/16.
 */

public class ProviderDetail {

    public Provider provider;
    public Map<String, Object> additional_properties = new HashMap<String, Object>();

    public class Education {

        public String graduation_year;
        public String medical_school;
        public Map<String, Object> additional_properties = new HashMap<String, Object>();
    }
    public class Provider {

        public String birth_date;
        public String degree;
        public String description;
        public Education education;
        public String fax;
        public String firstName;
        public String gender;
        public String last_name;
        public List<License> licenses = new ArrayList<License>();
        public List<Licensure> licensures = new ArrayList<Licensure>();
        public List<Location> locations = new ArrayList<Location>();
        public String middle_name;
        public String npi;
        public String phone;
        public String prefix;
        public List<Residency> residencies = new ArrayList<Residency>();
        public String small_image_url;
        public List<String> specialty = new ArrayList<String>();
        public List<String> specialty_primary = new ArrayList<String>();
        public List<String> specialty_secondary = new ArrayList<String>();
        public String uuid;
        public String verified;
        public Map<String, Object> additional_properties = new HashMap<String, Object>();
    }

    public class Residency {

        public String institution_name;
        public String type;
        public String to_year;
        public Map<String, Object> additional_properties = new HashMap<String, Object>();
    }

    public class Licensure {

        public String expiration_date;
        public String number;
        public String state;
        public String status;
        public String verified;
        public Map<String, Object> additional_properties = new HashMap<String, Object>();
    }
    public class License {

        public String number;
        public String state;
        public Map<String, Object> additional_properties = new HashMap<String, Object>();
    }

    public class Location {

        public List<String> address_lines = new ArrayList<String>();
        public String city;
        public List<Double> geo_location = new ArrayList<Double>();
        public String phone;
        public List<String> role = new ArrayList<String>();
        public String state;
        public String zipcode;
        public Map<String, Object> additional_properties = new HashMap<String, Object>();
    }
}
