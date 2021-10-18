package com.project.einpharma;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView =findViewById(R.id.navigationview);
        navigationView.setNavigationItemSelectedListener(this);




        drawerLayout=findViewById(R.id.drawerlayout);
//        navigationView=findViewById(R.id.navigationview);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open,R.string.navigation_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }



    public void Logout()
    {
        //Code to logout the user from current device
        Intent intent=new Intent(this,SplashScreen.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void Logout_All_Devices()
    {
        Intent intent=new Intent(this,SplashScreen.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert3=new AlertDialog.Builder(this);
        alert3.setTitle("Exit");
        alert3.setMessage("Are you sure");
        alert3.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
                System.exit(0);
            }
        });
        alert3.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alert3.show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_cart:
                ////
                break;
            case R.id.menu_bookmark:
                ////
                break;
            case R.id.menu_search:
                ////
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        if (id==R.id.nav_my_account)
        {
            Intent intent=new Intent(this,SplashScreen.class);
            startActivity(intent);
        }
//        switch (item.getItemId())
//        {
//            case R.id.nav_notification:
//                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
//                return true;
//        }
        return true;
    }
}
/*
    switch (item.getItemId())
        {
            case R.id.nav_notification:
                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_my_account:
                break;
            case R.id.nav_my_orders:
                break;
            case R.id.nav_coupans:
                break;
            case R.id.nav_my_favorites:
                break;
            case R.id.nav_my_wishlist:
                break;
            case R.id.nav_cart:
                break;
            case R.id.nav_faq:
                break;
            case R.id.nav_settings:
                break;
            case R.id.logout:
                AlertDialog.Builder alert=new AlertDialog.Builder(this);
                alert.setTitle("Logout");
                alert.setMessage("Are you sure");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Logout();
                        dialog.cancel();
                    }
                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.setCancelable(true);
                alert.show();
                break;
            case R.id.logout_all_devices:
                AlertDialog.Builder alert2=new AlertDialog.Builder(this);
                alert2.setTitle("Logout Of all Devices");
                alert2.setMessage("Are you sure");
                alert2.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Logout_All_Devices();
                        dialog.cancel();
                    }
                });
                alert2.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert2.setCancelable(true);
                alert2.show();
                break;
     */