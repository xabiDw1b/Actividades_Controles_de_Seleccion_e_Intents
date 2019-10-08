package com.example.actividadescontrolesdeseleccioneintents;

import androidx.appcompat.app.AppCompatActivity;

public class Web extends AppCompatActivity {

    private String nombre;
    private String URL;
    private String imagen;


    public Web(String nomb,String url, String image) {

        nombre = nomb;
        URL = url;
        imagen = image;
    }


    public String getURL(){
        return URL;

    }

    public String getImagen(){
        return imagen;
    }

    public String getNombre(){
        return nombre;
    }


}
