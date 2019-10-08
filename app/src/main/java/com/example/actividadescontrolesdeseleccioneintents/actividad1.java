package com.example.actividadescontrolesdeseleccioneintents;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class actividad1 extends AppCompatActivity {

    private ListView lista;
    private TextView textView;
    private  Pais[] paises = new Pais[] {new Pais( "Alemania",367000,83),new Pais( "España",506000,47),
            new Pais( "Fracia",675000,67),new Pais( "Italia",301000,61)};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);


        lista = findViewById(R.id.listView);
        textView = findViewById(R.id.textView);

        AdaptadorPaises adaptadorPaises = new AdaptadorPaises(this,paises);
        lista.setAdapter(adaptadorPaises);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {


                Pais paisSelec = (Pais)parent.getItemAtPosition(position);

                textView.setText("Superficie: "+paisSelec.getSuper()+". Habitantes: "+paisSelec.getPobla());




            }

        });
    }



    class AdaptadorPaises extends ArrayAdapter<Pais> {

        public AdaptadorPaises(@NonNull Context context, Pais[] resource) {
            super(context, R.layout.listview_paises, paises);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.listview_paises, null);

            TextView tvNomPais = item.findViewById(R.id.tvNomPais);
            tvNomPais.setText(paises[position].getNombre());
            return item;
        }

    }
}

