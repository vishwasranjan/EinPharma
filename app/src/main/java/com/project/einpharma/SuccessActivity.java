package com.project.einpharma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {
    Button continue_order;
    TextView success_message_confirmation;
    String invoice_number="#4566";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        continue_order=findViewById(R.id.success_button);
        success_message_confirmation=findViewById(R.id.success_message_confirmation);
        success_message_confirmation.setText("Your order is confirmed \n Invoice Number = "+invoice_number);
        continue_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ////Code to continue order
            }
        });
    }
}