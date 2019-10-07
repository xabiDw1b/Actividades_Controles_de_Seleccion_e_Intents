package com.example.actividadescontrolesdeseleccioneintents;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Pais extends AppCompatActivity {

    private String nombre;
    private int superficie;
    private int poblacion;


    public Pais(String nomb,int superf, int pobla) {

        nombre = nomb;
        superficie = superf;
        poblacion = pobla;
    }


    public int getSuper(){
        return superficie;

    }

    public int getSubtitulo(){
        return poblacion;
    }

    public String getNombre(){
        return nombre;
    }

}


