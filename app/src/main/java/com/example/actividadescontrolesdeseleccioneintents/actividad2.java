package com.example.actividadescontrolesdeseleccioneintents;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class actividad2 extends AppCompatActivity {

    private ListView lista;
    private  Web[] webs = new Web[] {new Web( 1,"GOOGLE","https://www.google.com","g"),
            new Web( 2,"EL TIEMPO","https://www.eltiempo.es","t")};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);


        lista = findViewById(R.id.listView);



        AdaptadorWeb adaptadorWeb = new AdaptadorWeb(this,webs);
        lista.setAdapter(adaptadorWeb);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {


                Web WebSelec = (Web)parent.getItemAtPosition(position);


                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(WebSelec.getURL()));
                startActivity(intent);

            }

        });
    }



    class AdaptadorWeb extends ArrayAdapter<Web> {

        public AdaptadorWeb(@NonNull Context context, Web[] resource) {
            super(context, R.layout.listview_web, webs);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.listview_web, null);

            TextView tvNomweb = item.findViewById(R.id.TextViewNombre);
            TextView TextViewURL = item.findViewById(R.id.TextViewURL);
            ImageView image = item.findViewById(R.id.imageView);


            tvNomweb.setText(webs[position].getNombre());
            TextViewURL.setText(webs[position].getURL());
            String imag = webs[position].getImagen();
            image.setImageResource(getResources().getIdentifier(imag, "drawable", getPackageName()));

            return item;
        }

    }
}

