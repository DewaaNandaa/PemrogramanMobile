package com.example.progmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnBiodata, btnRiwayat, btnSosial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnBiodata = (Button) findViewById(R.id.btnBiodata);
        btnRiwayat = (Button) findViewById(R.id.btnRiwayat);
        btnSosial = (Button) findViewById(R.id.btnSosial);

        btnBiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BiodataAct = new Intent(getApplicationContext(), Biodata.class);
                startActivity(BiodataAct);
            }

        });

        btnRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RiwayatAct = new Intent(getApplicationContext(), Riwayat_Study.class);
                startActivity(RiwayatAct);
            }
        });

        btnSosial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SosialAct = new Intent(getApplicationContext(), Sosial.class);
                startActivity(SosialAct);
            }
        });
    }
}