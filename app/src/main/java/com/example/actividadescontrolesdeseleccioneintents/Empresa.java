package com.example.actividadescontrolesdeseleccioneintents;

import androidx.appcompat.app.AppCompatActivity;

public class Empresa extends AppCompatActivity {

    private String nombre;
    private String Email;
    private String coodenadas;
    private String URL;
    private String imagen;


    public Empresa(String nomb,String email,String coord, String url, String image) {


        nombre = nomb;
        Email=email;
        coodenadas=coord;
        URL = url;
        imagen = image;
    }




    public String getURL(){
        return URL;

    }

    public String getEmail(){
        return Email;

    }
    public String getcoodenadasL(){
        return coodenadas;

    }

    public String getImagen(){

        return imagen;
    }

    public String getNombre(){

        return nombre;
    }


}
