package com.example.botoneameste;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Sonidos del menu
    MediaPlayer mbtnHomero;
    MediaPlayer mbtngatos;

    //Variables
    CardView mbtnHomeroCard, mbtnNelsonCard, mbtnBartCard, mbtnSientateCard;
    TextView mDescargar1, mDescargar2, mDescargar3, mDescargar4;

    //Sonidos de botones
    MediaPlayer mbtnHomeroSonido;
    MediaPlayer mbtnNelsonSonido;
    MediaPlayer mbtnBartSonido;
    MediaPlayer mbtnSientateSonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Instancia de sonidos del menu
        mbtngatos = MediaPlayer.create(getApplicationContext(), R.raw.miau);
        mbtnHomero = MediaPlayer.create(getApplicationContext(), R.raw.homero_ou);

        //Instancias de las variables
        mbtnHomeroCard = findViewById(R.id.sonidoHomero);
        mbtnNelsonCard = findViewById(R.id.sonidoNelson);
        mbtnBartCard = findViewById(R.id.sonidoBart);
        mbtnSientateCard = findViewById(R.id.sonidoSientate);

        //Instancias para descargar sonido
        mDescargar1 = findViewById(R.id.descargar1);
        mDescargar2 = findViewById(R.id.descargar2);
        mDescargar3 = findViewById(R.id.descargar3);
        mDescargar4 = findViewById(R.id.descargar4);

        //Instancia de sonido botones
        mbtnHomeroSonido = MediaPlayer.create(getApplicationContext(), R.raw.chango);
        mbtnNelsonSonido = MediaPlayer.create(getApplicationContext(), R.raw.nelson_aha);
        mbtnBartSonido = MediaPlayer.create(getApplicationContext(), R.raw.caramba);
        mbtnSientateSonido = MediaPlayer.create(getApplicationContext(), R.raw.sientate);


        //Accion para cambiar de pantalla
        mbtnHomeroCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbtnHomeroSonido.start();
            }
        });

        //Accion para cambiar de pantalla
        mbtnNelsonCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbtnNelsonSonido.start();
            }
        });

        //Accion para cambiar de pantalla
        mbtnBartCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbtnBartSonido.start();
            }
        });

        //Accion para cambiar de pantalla
        mbtnSientateCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbtnSientateSonido.start();
            }
        });

        //Descargas
        mDescargar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1Y0J0CTImOV9HqLAOeYCM8MNm_Nskfa-n/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        mDescargar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/16Ljar-iuu_YsJgw1EwTlm8qRU12kUQNh/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        mDescargar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1FPvIFqYQoU9DG8th1Ri-gCxj-es9jkfZ/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        mDescargar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1DkqZp2FBQISjxmHqVF0vL00WKWwSi6wY/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });


    }

    public boolean onCreateOptionsMenu(@NonNull Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opciones:

                return true;

            case R.id.cat1:
                Toast.makeText(this, "Seleccionaste Homero", Toast.LENGTH_LONG).show();
                mbtnHomero.start();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.cat2:
                Toast.makeText(this, "Seleccionaste Gatos", Toast.LENGTH_LONG).show();
                mbtngatos.start();
                Intent intent2 = new Intent(MainActivity.this, Categoria_Gatos_Activity.class);
                startActivity(intent2);
                break;

            default:
                return super.onOptionsItemSelected(item);

        }
        return false;
    }

}