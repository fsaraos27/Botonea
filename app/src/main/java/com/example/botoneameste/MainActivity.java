package com.example.botoneameste;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
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
                Toast.makeText(this, "Seleccionaste Calificar", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.cat2:
                Toast.makeText(this, "Seleccionaste Calificar", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(MainActivity.this, Categoria_2.class);
                startActivity(intent2);
                break;

            case R.id.cat3:
                Toast.makeText(this, "Seleccionaste Calificar", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(MainActivity.this, Categoria_3.class);
                startActivity(intent3);
                break;

            default:
                return super.onOptionsItemSelected(item);

        }
        return false;
    }

}