package com.example.botoneameste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Categoria_Gatos_Activity extends AppCompatActivity {

    //Variables
    CardView mbtnSonido1, mbtnSonido2, mbtnSonido3, mbtnSonido4;

    TextView mDescargar1, mDescargar2, mDescargar3, mDescargar4;

    //Sonidos de botones
    MediaPlayer mbtnGatoSonido1;
    MediaPlayer mbtnGatoSonido2;
    MediaPlayer mbtnGatoSonido3;
    MediaPlayer mbtnGatoSonido4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_categoria_gatos);

        //Instancias de las variables
        mbtnSonido1 = findViewById(R.id.sonidoGato1);
        mbtnSonido2 = findViewById(R.id.sonidoGato2);
        mbtnSonido3 = findViewById(R.id.sonidoGato3);
        mbtnSonido4 = findViewById(R.id.sonidoGato4);

        //Instancias para descargar sonido
        mDescargar1 = findViewById(R.id.descargar1);
        mDescargar2 = findViewById(R.id.descargar2);
        mDescargar3 = findViewById(R.id.descargar3);
        mDescargar4 = findViewById(R.id.descargar4);

        //Instancia de sonido botones
        mbtnGatoSonido1 = MediaPlayer.create(getApplicationContext(), R.raw.maullido);
        mbtnGatoSonido2 = MediaPlayer.create(getApplicationContext(), R.raw.pelea);
        mbtnGatoSonido3 = MediaPlayer.create(getApplicationContext(), R.raw.ronroneo);
        mbtnGatoSonido4 = MediaPlayer.create(getApplicationContext(), R.raw.perro);


        //Accion para cambiar de pantalla
        mbtnSonido1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbtnGatoSonido1.start();
            }
        });

        //Accion para cambiar de pantalla
        mbtnSonido2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbtnGatoSonido2.start();
            }
        });

        //Accion para cambiar de pantalla
        mbtnSonido3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbtnGatoSonido3.start();
            }
        });

        //Accion para cambiar de pantalla
        mbtnSonido4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbtnGatoSonido4.start();
            }
        });


        //Descargas
        mDescargar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1NWQTIvxMcqEq-Ij0vIfz7ktQt5vDBZAA/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        mDescargar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1i8NVunuRGbiValt12bD0qleuXK6KoaxJ/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        mDescargar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1D2J2-QyQec7GhwnlRiohWRjENhUEr9CS/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        mDescargar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1bIOAB-5ZZRUkDBsyd3yD6gHXm56jN7Zr/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });


    }



}