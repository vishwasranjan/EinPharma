package com.project.einpharma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText login_email_ID_phone_no,login_password;
    Button login_button;
    TextView dont_have_an_account;
    ImageView login_with_google,login_with_facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_email_ID_phone_no=findViewById(R.id.login_email_ID_or_phone_no);
        login_password=findViewById(R.id.login_password);
        login_button=findViewById(R.id.login_button);
        dont_have_an_account=findViewById(R.id.dont_have_an_account);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowLogin();
            }
        });

        dont_have_an_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

    }
    public void AllowLogin()
    {
        if(login_email_ID_phone_no.getText().toString().equals(""))
        {
            Toast.makeText(this, "Enter Your Email-ID or Phone Number", Toast.LENGTH_SHORT).show();
        }
        else if(login_password.getText().toString().equals(""))
        {
            Toast.makeText(this, "Enter Your Password", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}