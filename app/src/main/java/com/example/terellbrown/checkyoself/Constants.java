package com.example.terellbrown.checkyoself;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Created by fnord on 6/25/16.
 */
public class Constants {

    public static String NAME = "name";
    public static String EMAIL = "email";
    public static String HAS_INSURANCE = "has_insurance";
    public static String SEX = "sex";
    public static String PASSWORD =  "password";

    public static String clientId = "UGfzOThCOl5N2G5lJXLE";
    public static String secret = "L1HTPb4zRS7lWfbeQOoCNxXBDuPm1kHPW5q6cSpV";

    public static String getEncodedAuth() {
        String toEncode = clientId + ":" + secret;
        byte[] data = new byte[0];
        try {
            data = toEncode.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return Base64.encodeToString(data, Base64.NO_WRAP);
    }

}
