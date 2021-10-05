package com.project.einpharma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuccessActivity extends AppCompatActivity {
    Button continue_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        continue_order=findViewById(R.id.success_button);
        continue_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ////Code to continue order
            }
        });
    }
}