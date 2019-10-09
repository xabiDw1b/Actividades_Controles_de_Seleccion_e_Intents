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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class actividad3 extends AppCompatActivity {

    private ListView lista;

    private  Empresa[] empresas = new Empresa[] {new Empresa( "GOOGLE","google@gmail.com","125º12'22''","https://google.com","g"),
            new Empresa( "AMAZON","amazon@gmail.com","168º25'36''","https://www.amazon.es","a"),
            new Empresa( "MICROSOFT","microsoft@outlook.com","167º25'36''","https://www.microsoft.es","m")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);


        lista = findViewById(R.id.listView);



        AdaptadorEmpresas adaptadorEmpresas = new AdaptadorEmpresas(this,empresas);
        lista.setAdapter(adaptadorEmpresas);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {


                Empresa EmpresaSelec = (Empresa) parent.getItemAtPosition(position); //NO LEEE


                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(EmpresaSelec.getURL()));
                startActivity(intent);

            }

        });
    }



    class AdaptadorEmpresas extends ArrayAdapter<Empresa> {

        public AdaptadorEmpresas(@NonNull Context context, Empresa[] resource) {
            super(context, R.layout.listview_empresas, empresas);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.listview_empresas, null);


            TextView tvNomweb = item.findViewById(R.id.TextViewNombre);
            ImageView image = item.findViewById(R.id.imageView);
            ImageButton Bgmail = item.findViewById(R.id.Bgmail);
            ImageButton Bmaps = item.findViewById(R.id.Bmaps);
            ImageButton BWeb = item.findViewById(R.id.BWeb);


            tvNomweb.setText(empresas[position].getNombre());
            String imag = empresas[position].getImagen();
            image.setImageResource(getResources().getIdentifier(imag, "drawable", getPackageName()));


            Bgmail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                }

            });

            Bmaps.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                }

            });

            BWeb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(EmpresaSelec.getURL()));
                startActivity(intent);

                }

            });

            return item;
        }

    }
}
