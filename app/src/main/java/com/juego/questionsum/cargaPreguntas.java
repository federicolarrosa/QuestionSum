package com.juego.questionsum;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class cargaPreguntas extends AppCompatActivity {

EditText  Pregunta, txtRPV, txtRP1, txtRP2, txtRP3;
Spinner spinnerNivel, spinnerLibro;
Button btnCargar;

FirebaseDatabase database = FirebaseDatabase.getInstance();
DatabaseReference myRef = database.getReference();
Map<String, Object> PregRes= new HashMap<>();
ArrayAdapter<CharSequence> adapter,adapter1;
String libro,niveles;
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
        adapter=ArrayAdapter.createFromResource(this,R.array.Libros,R.layout.support_simple_spinner_dropdown_item);
        spinnerLibro.setAdapter(adapter);
        spinnerNivel = findViewById(R.id.spinnerNivel);
        adapter1=ArrayAdapter.createFromResource(this,R.array.niveles,R.layout.support_simple_spinner_dropdown_item);
        spinnerNivel.setAdapter(adapter1);
        btnCargar = findViewById(R.id.btnCargar);

        spinnerLibro.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 libro = adapter.getItem(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerNivel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                niveles=adapter1.getItem(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btnCargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PregRes.put("Pregunta",Pregunta.getText().toString());
                PregRes.put("RespuestaV",txtRPV.getText().toString());
                PregRes.put("Respuesta1",txtRP1.getText().toString());
                PregRes.put("Respuesta2",txtRP2.getText().toString());
                PregRes.put("Respuesta3",txtRP3.getText().toString());

                myRef.child("PreguntasRes").child(libro).child(niveles).push().setValue(PregRes).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(cargaPreguntas.this,"Cargado con exito.", Toast.LENGTH_SHORT).show();
                        Pregunta.setText(null);
                        txtRPV.setText(null);
                        txtRP1.setText(null);
                        txtRP2.setText(null);
                        txtRP3.setText(null);
                    }
                }).addOnCanceledListener(new OnCanceledListener() {
                    @Override
                    public void onCanceled() {
                        Toast.makeText(cargaPreguntas.this,"UppS... no se a podido cargar. Intentelo nuevamente", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });




    }
}
