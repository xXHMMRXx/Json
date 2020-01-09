 package com.mx.cwvm.gsonarch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

 public class MainActivity extends AppCompatActivity {

    EditText nombre, edad, correo, curp;
    TextView json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.txtNombre);
        edad = findViewById(R.id.txtEdad);
        correo = findViewById(R.id.txtCorreo);
        curp = findViewById(R.id.txtCurp);
        json = findViewById(R.id.tvContenido);

    }

    public void Convertir(View v)
    {

        Datos data = new Datos(nombre.getText().toString(),Integer.parseInt(edad.getText().toString()), correo.getText().toString(), curp.getText().toString());

        Gson gson = new Gson();
        String st = gson.toJson(data);
        json.setText(st);
    }

}
