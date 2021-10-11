package com.project.einpharma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NoInternetConnectionActivity extends AppCompatActivity {
    TextView no_internet_connection_try_gain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_internet_connection);
        no_internet_connection_try_gain=findViewById(R.id.no_internet_connection_try_again);
        no_internet_connection_try_gain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Refresh the page
            }
        });
    }
}