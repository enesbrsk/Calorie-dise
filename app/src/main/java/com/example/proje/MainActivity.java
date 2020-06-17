package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView,takvimİmg,kalorih;

        imageView=(ImageView) findViewById(R.id.img_vkitle);
        takvimİmg = (ImageView) findViewById(R.id.takvim);
        kalorih=(ImageView) findViewById(R.id.kalorih);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gecisYap = new Intent(MainActivity.this,vkitle.class);
                startActivity(gecisYap);
            }
        });
        takvimİmg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap2 = new Intent(MainActivity.this,takvim.class);
                startActivity(gecisYap2);

            }
        });

        kalorih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap1 = new Intent(MainActivity.this,Kalori.class);
                startActivity(gecisYap1);
            }
        });


    }
}

