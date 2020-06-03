package com.juego.questionsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class cargaPreguntas extends AppCompatActivity {

EditText  Pregunta, txtRPV, txtRP1, txtRP2, txtRP3;
Spinner spinnerNivel, spinnerLibro;
Button btnCargar;
ArrayList<String> preguntas = new ArrayList<>();
ArrayList<String> respuesta = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga_preguntas);

        Pregunta = findViewById(R.id.Pregunta);
        txtRPV = findViewById(R.id.txtRPV);
        txtRP1 = findViewById(R.id.txtRP1);
        txtRP2 = findViewById(R.id.txtRP2);
        txtRP3 = findViewById(R.id.txtRP3);
        spinnerLibro = findViewById(R.id.spinnerLibro);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.Libros,R.layout.support_simple_spinner_dropdown_item);
        spinnerLibro.setAdapter(adapter);
        spinnerNivel = findViewById(R.id.spinnerNivel);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.niveles,R.layout.support_simple_spinner_dropdown_item);
        spinnerNivel.setAdapter(adapter1);
        btnCargar = findViewById(R.id.btnCargar);

        btnCargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             preguntas.add(Pregunta.getText().toString());
             respuesta.add(txtRP1.getText().toString());
             respuesta.add(txtRP2.getText().toString());
             respuesta.add(txtRP3.getText().toString());
             Toast.makeText(cargaPreguntas.this,"Cargado con exito.", Toast.LENGTH_SHORT).show();
             Pregunta.setText(" ");
             txtRPV.setText(" ");
             txtRP1.setText(" ");
             txtRP2.setText(" ");
             txtRP3.setText(" ");
            }
        });




    }
}
