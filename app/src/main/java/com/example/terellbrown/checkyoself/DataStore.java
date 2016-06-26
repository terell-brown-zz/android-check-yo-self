package com.example.terellbrown.checkyoself;

import android.content.Context;
import android.preference.PreferenceManager;

import com.lacronicus.easydatastorelib.DatastoreBuilder;
import com.lacronicus.easydatastorelib.Preference;
import com.lacronicus.easydatastorelib.StringEntry;

public class DataStore {

    private static Data dataStore;
    private static Context appContext;

    public static Data init(Context context) {
        appContext = context;
        if (dataStore == null) {
            dataStore = new DatastoreBuilder(PreferenceManager.getDefaultSharedPreferences(appContext))
                    .create(Data.class);
        }
        return dataStore;
    }


    public interface Data {

        @Preference("client_id")
        StringEntry client_id();

        @Preference("secret_key")
        StringEntry secret_key();

        @Preference("access_token")
        StringEntry access_token();

        @Preference("encoded_token")
        StringEntry encoded_token();


    }

}
