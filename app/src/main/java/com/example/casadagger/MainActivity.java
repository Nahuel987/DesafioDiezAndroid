package com.example.casadagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.casadagger.model.Casa;
import com.example.casadagger.model.Habitaciones;
import com.example.casadagger.model.Puertas;
import com.example.casadagger.model.Ventanas;

public class MainActivity extends AppCompatActivity {

    private Casa casa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Puertas puertas = new Puertas();
        Ventanas ventanas = new Ventanas();
        Habitaciones habitaciones = new Habitaciones();
        Casa casa = new Casa(puertas, ventanas, habitaciones);
        casa.construir();



        AppComponent component = DaggerAppComponent.create();
        casa = component.getCasa();
        casa.construir();

        Casa casaGrande = component.getCasa();
        casaGrande.construir();


    }//on create

}//class
