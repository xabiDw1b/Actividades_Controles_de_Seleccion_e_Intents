package com.example.actividadescontrolesdeseleccioneintents;

import androidx.appcompat.app.AppCompatActivity;

public class Web extends AppCompatActivity {

    private int ID;
    private String nombre;
    private String URL;
    private String imagen;


    public Web(int id,String nomb,String url, String image) {

        ID=id;
        nombre = nomb;
        URL = url;
        imagen = image;
    }


    public int getID()
    {
        return ID;

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
