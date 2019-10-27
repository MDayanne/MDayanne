package com.autonoma.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VistaDatosActivity extends AppCompatActivity {

    TextView tvDatoNombre;
    TextView tvBienvenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_datos);
        tvDatoNombre = findViewById(R.id.tvDatoNombre);
        tvBienvenido= findViewById(R.id.tvBienvenido);
        Bundle bundle = getIntent().getExtras();
        String usuario = bundle.getString("usuario");
        String contrasena=bundle.getString("contrasena");

        //tvDatoNombre.setText("Los usuarios y contrasena ingresados son:" + usuario + " - "+contrasena);
        tvBienvenido.setText("Bienvenido "+usuario);
    }
}

