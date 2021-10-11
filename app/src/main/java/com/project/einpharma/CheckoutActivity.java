package com.project.einpharma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {
    TextView checkout_total_no_of_item_in_cart,checkout_total_price;
    String checkout_price="500.00";
    String checkout_item_no="3";
    Button pay_now_checkout;
    RadioButton credit_card_payment_option,paypal_payment_option,google_pay_payment_option,apple_pay_payment_option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        checkout_total_no_of_item_in_cart=findViewById(R.id.checkout_total_no_of_items_in_cart);
        checkout_total_price=findViewById(R.id.checkout_total_price);
        pay_now_checkout=findViewById(R.id.pay_now_checkout);
        paypal_payment_option=findViewById(R.id.paypal_payment_option);
        credit_card_payment_option=findViewById(R.id.credit_card_payment_option);
        google_pay_payment_option=findViewById(R.id.google_pay_payment_option);
        apple_pay_payment_option=findViewById(R.id.apple_pay_payment_option);


        checkout_total_no_of_item_in_cart.setText(checkout_item_no);
        checkout_total_price.setText("TOTAL \n"+"₹"+checkout_price);
    }
}