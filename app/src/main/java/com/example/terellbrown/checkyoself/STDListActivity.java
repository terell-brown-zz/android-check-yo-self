package com.example.terellbrown.checkyoself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class STDListActivity extends AppCompatActivity {

    public TextView AIDS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stdlist);

        AIDS = (TextView) findViewById(R.id.tvAIDSLink);
        AIDS.setText(Html.escapeHtml("<a href=https://en.wikipedia.org/wiki/HIV/AIDS> HIV/AIDS "));
        AIDS.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
