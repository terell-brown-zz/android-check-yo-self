package com.example.terellbrown.checkyoself.API;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fnord on 6/26/16.
 */
public class NewProvider {

    public class Datum {


        public String distance;
        public Provider provider;

    }

    public class Location {

        public List<String> address_lines = new ArrayList<String>();
        public String city;
        public String country;
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
        public String result_count;
        public String activity_id;
        public String credits_billed;

    }

    public class Providers {

        public Meta meta;
        public List<Datum> data = new ArrayList<Datum>();

    }

    public class Provider {

        public String npi;
        public String uuid;
        public List<Location> locations = new ArrayList<Location>();
        public List<String> specialty_primary = new ArrayList<String>();
        public List<String> specialty = new ArrayList<String>();
        public String organization_name;
        public String phone;
        public Boolean verified;
        public List<String> specialty_secondary = new ArrayList<String>();
    }
}
