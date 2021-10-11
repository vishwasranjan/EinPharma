package com.project.einpharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class DelieryAddressActivity extends AppCompatActivity {
    EditText delivery_address_name,delivery_address_phone_number,delivery_address_house_number,delivery_address_town,delivery_address_pincode;
    EditText delivery_address_city,delivery_address_state;
    ImageView delivery_address_back_icon;
    Button delivery_address_save_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliery_address);
        delivery_address_back_icon=findViewById(R.id.back_icon_delivery_address);
        delivery_address_save_button=findViewById(R.id.delivery_address_save_address);
        delivery_address_name=findViewById(R.id.delivery_address_name);
        delivery_address_phone_number=findViewById(R.id.delivery_address_phone_number);
        delivery_address_house_number=findViewById(R.id.delivery_address_house_number);
        delivery_address_town=findViewById(R.id.delivery_address_town);
        delivery_address_pincode=findViewById(R.id.delivery_address_pincode);
        delivery_address_city=findViewById(R.id.delivery_address_city);
        delivery_address_state=findViewById(R.id.delivery_address_state);

        delivery_address_save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(delivery_address_name.getText().toString().equals("")&&delivery_address_phone_number.getText().toString().equals("")
                &&delivery_address_house_number.getText().toString().equals("")&&delivery_address_town.getText().toString().equals("")
                &&delivery_address_pincode.getText().toString().equals("")&&delivery_address_city.getText().toString().equals("")&&
                delivery_address_state.getText().toString().equals(""))
                {
                    Toast.makeText(DelieryAddressActivity.this, "All the field are Mandatory", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //Save address of delivery address
                }
            }
        });
        delivery_address_back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DelieryAddressActivity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}