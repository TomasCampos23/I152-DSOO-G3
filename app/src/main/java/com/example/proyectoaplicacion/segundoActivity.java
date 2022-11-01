package com.example.proyectoaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }
    public void Cliente(View view){
        Intent cliente = new Intent(this, clienteRegistroActivity.class);
        startActivity(cliente);
    }
    public void Comercio(View view){
        Intent comercio = new Intent(this, ComercioRegistroActivity.class);
        startActivity(comercio);
    }
}