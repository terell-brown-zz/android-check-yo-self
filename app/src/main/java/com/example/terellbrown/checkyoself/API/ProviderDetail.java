package com.example.terellbrown.checkyoself.API;

import java.util.ArrayList;
import java.util.List;


public class ProviderDetail {

    public Meta meta;
    public Data data;

    public class Data {

        public String distance;
        public Provider provider;

    }

    public class Education {

        public String medical_school;
        public String graduation_year;

    }
    public class License {

        public String state;
        public String number;

    }

    public class Licensure {

        public String status;
        public String expiration_date;
        public String state;
        public String verified;
        public String number;

    }

    public class Location {

        public List<String> address_lines = new ArrayList<String>();
        public String city;
        public String zipcode;
        public String phone;
        public String state;
        public List<String> geo_location = new ArrayList<String>();
        public List<String> role = new ArrayList<String>();

    }

    public class Meta {

        public String rate_limit_amount;
        public String rate_limit_reset;
        public String application_mode;
        public String processing_time;
        public String rate_limit_cap;
        public String credits_remaining;
        public String activity_id;
        public String credits_billed;

    }

    public class Provider {

        public String last_name;
        public List<Location> locations = new ArrayList<Location>();
        public List<String> specialty_primary = new ArrayList<String>();
        public String prefix;
        public List<License> licenses = new ArrayList<License>();
        public String small_image_url;
        public Education education;
        public String first_name;
        public String middle_name;
        public String uuid;
        public List<String> specialty_secondary = new ArrayList<String>();
        public String fax;
        public String npi;
        public String description;
        public String degree;
        public List<String> specialty = new ArrayList<String>();
        public String phone;
        public String verified;
        public List<Residency> residencies = new ArrayList<Residency>();
        public String gender;
        public List<Licensure> licensures = new ArrayList<Licensure>();
        public String birth_date;
    }

    public class Residency {

        public String type;
        public String institution_name;
        public String to_year;
    }
}
