package com.example.actividadescontrolesdeseleccioneintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class actividad1 extends AppCompatActivity {

    private ListView lista;
    private TextView textView;
    private  Pais[] pais = new Pais[] {new Pais( "Alemania",80,85),new Pais( "España",90,63),
            new Pais( "Fracia",100,75),new Pais( "Italia",85,73)};
    private final String[] datos = new String[] {"Alemania","España","Fracia","Italia"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);


        lista = findViewById(R.id.listView);
        textView = findViewById(R.id.textView);

        ArrayAdapter<String> adaptadorListView = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lista.setAdapter(adaptadorListView);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {


                if(position==0)
                {
                    textView.setText("Superficie: opui, y poblacion.....");

                }

                if(position==1)
                {
                    textView.setText("Superficie: uiou, y poblacion.....");

                }
                if(position==2)
                {
                    textView.setText("Superficie: ñlk, y poblacion.....");

                }
                if(position==3)
                {
                    textView.setText("Superficie: kh, y poblacion.....");

                }

            }

        });
    }
}

