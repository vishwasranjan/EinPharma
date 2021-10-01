package com.project.einpharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    EditText signup_email_ID_phone_no,signup_name,signup_password;
    Button signup_button;
    ImageView signup_with_google,signup_with_facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup_email_ID_phone_no=findViewById(R.id.signup_email_ID_or_phone_no);
        signup_name=findViewById(R.id.signup_name);
        signup_password=findViewById(R.id.signup_password);
        signup_button=findViewById(R.id.signup_button);
        signup_with_google=findViewById(R.id.signup_with_google);
        signup_with_facebook=findViewById(R.id.signup_with_facebook);

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUser();
            }
        });
    }
    public void AllowUser()
    {
        if(signup_email_ID_phone_no.getText().toString().equals(""))
        {
            Toast.makeText(this, "Enter Your Email-ID or Phone Number", Toast.LENGTH_SHORT).show();
        }
        else if(signup_password.getText().toString().equals(""))
        {
            Toast.makeText(this, "Enter Your Password", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent=new Intent(SignUpActivity.this,LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            Toast.makeText(this, "Account Created Successfully", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }

}