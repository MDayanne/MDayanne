package com.autonoma.ejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText etUsuario;
    EditText etContrasena;
    Button btGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instanciar
        etUsuario = findViewById(R.id.etUsuario);
        etContrasena = findViewById(R.id.etContrasena);
        btGuardar = findViewById(R.id.btnGuardar);
        //
        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                /* Comprobamos que no venga alguno en blanco. */
                if (!etUsuario.getText().toString().equals("") && !etContrasena.getText().toString().equals("")){

                    //Toast.makeText(MainActivity.this,etUsuario.getText(),Toast.LENGTH_LONG).show();
                    //Toast.makeText(MainActivity.this,etContrasena.getText(),Toast.LENGTH_LONG).show();

                    //Vamos a la pantalla Vista de datos
                    Intent intent =
                            new Intent(MainActivity.this,
                                    VistaDatosActivity.class);
                    //
                    String usuario = etUsuario.getText().toString();
                    String contrasena = etContrasena.getText().toString();
                    //String contrasena = etContrasena.getText().toString();
                    //enviamos el usuario a la siguiente pantalla
                    intent.putExtra("usuario",usuario);
                    intent.putExtra("contrasena",contrasena);
                    //Inicializamos el intento
                    startActivity(intent);

                }else{
                    Toast.makeText(MainActivity.this, "No deben haber campos vacios!",
                            Toast.LENGTH_LONG).show();

            }
        }});

        }


}
