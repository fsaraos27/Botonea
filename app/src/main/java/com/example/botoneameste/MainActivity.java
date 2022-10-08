package com.example.botoneameste;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mbtnHomero;
    MediaPlayer mbtngatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        mbtngatos = MediaPlayer.create(getApplicationContext(), R.raw.miau);
        mbtnHomero = MediaPlayer.create(getApplicationContext(), R.raw.homero_ou);

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