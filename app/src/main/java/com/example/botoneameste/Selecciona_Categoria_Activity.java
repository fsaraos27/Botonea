package com.example.botoneameste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Selecciona_Categoria_Activity extends AppCompatActivity {

    //Variables para botones
    CardView mCatHomer, mCatGatos;

    //Variables de sonidos
    MediaPlayer mbtnHomero;
    MediaPlayer mbtngatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_selecciona_categoria);

        //Sonidos
        mbtnHomero = MediaPlayer.create(getApplicationContext(), R.raw.homero);
        mbtngatos = MediaPlayer.create(getApplicationContext(), R.raw.miau);

        //variables instanciadas
        mCatGatos = findViewById(R.id.cateGatos);
        mCatHomer = findViewById(R.id.cateHomero);

        //Accion para cambiar de pantalla
        mCatHomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Selecciona_Categoria_Activity.this, MainActivity.class);
                mbtnHomero.start();
                startActivity(intent);
                finish();
            }
        });

        //Accion para cambiar de pantalla
        mCatGatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Selecciona_Categoria_Activity.this, MainActivity.class);
                mbtngatos.start();
                startActivity(intent);
                finish();
            }
        });

    }

}