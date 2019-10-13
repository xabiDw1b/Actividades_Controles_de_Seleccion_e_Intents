package com.example.actividadescontrolesdeseleccioneintents;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class actividad3 extends AppCompatActivity {

    private ImageButton Bmaps,BWeb;
    private Button Bgmail;
    private EditText editTextAsunto,editTextMensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        Bgmail = findViewById(R.id.Bgmail);
        Bmaps = findViewById(R.id.Bmaps);
        BWeb = findViewById(R.id.BWeb);
        editTextAsunto = findViewById(R.id.editTextAsunto);
        editTextMensaje = findViewById(R.id.editTextMensaje);

        Bgmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            String asunto= editTextAsunto.getText().toString();
            String contenido=editTextMensaje.getText().toString();


                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + "amazon@gmail.com"));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, asunto);
                emailIntent.putExtra(Intent.EXTRA_TEXT, contenido);
                startActivity(Intent.createChooser(emailIntent,"email"));

            }
        });


        Bmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://goo.gl/maps/BYvapefWMiFsEZFi7"));
                startActivity(intent);


            }
        });



        BWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String url = "https://www.amazon.es";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);


            }
        });


    }

}
