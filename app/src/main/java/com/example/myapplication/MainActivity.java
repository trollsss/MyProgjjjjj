package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    private NavigationView nav_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        nav_View = findViewById(R.id.nav_view);
        nav_View.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        switch (id)
        {
            case R.id.id_my_ads:
                Toast.makeText(this, "Pressed id My Add", Toast.LENGTH_SHORT).show();

                break;
            case R.id.id_cars_ads:
                Toast.makeText(this, "Pressed id My cars", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_pc_ads:
                Toast.makeText(this, "Pressed id My pc", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_smartphone_ads:
                Toast.makeText(this, "Pressed id My smartphone", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_dm_ads:
                Toast.makeText(this, "Pressed id My dm", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_sign_up:
                Toast.makeText(this, "Pressed id My sign up", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_sign_in:
                Toast.makeText(this, "Pressed id My sign in", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_sign_out:
                Toast.makeText(this, "Pressed id My sign out", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}