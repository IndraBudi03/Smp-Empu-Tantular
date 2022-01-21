package com.smk9ibl.smpemputantularsemarang;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    CardView cvProfil;
    CardView cvGuruDanStaff;
    CardView cvEkskul;
    CardView cvFasilitas;
    CardView cvGaleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cvProfil = findViewById(R.id.Profil);
        cvGuruDanStaff = findViewById(R.id.GuruDanStaff);
        cvEkskul = findViewById(R.id.Ekskul);
        cvFasilitas = findViewById(R.id.Fasilitas);
        cvGaleri = findViewById(R.id.Galeri);

        cvProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Profil.class);
                startActivity(intent);
            }
        });

        cvGuruDanStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GuruDanStaff.class);
                startActivity(intent);
            }
        });

        cvEkskul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Ekskul.class);
                startActivity(intent);
            }
        });

        cvFasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Fasilitas.class);
                startActivity(intent);
            }
        });

        cvGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Galeri.class);
                startActivity(intent);
            }
        });
    }
}