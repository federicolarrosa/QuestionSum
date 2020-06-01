package com.juego.questionsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class dycPregunta extends AppCompatActivity {
        TextView txtpregunta;
        RadioGroup radioGroup;
        RadioButton rp1, rp2, rp3, rp4;
        ProgressBar progressBar;

        ArrayList<String>preguntas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dyc_pregunta);

        txtpregunta = findViewById(R.id.txtPregunta);
        radioGroup = findViewById(R.id.radioGroup);
        rp1 = findViewById(R.id.rp1);
        rp2 = findViewById(R.id.rp2);
        rp3 = findViewById(R.id.rp3);
        rp4 = findViewById(R.id.rp4);
        progressBar = findViewById(R.id.progressBar);

        preguntas.add("¿Como se llama el profeta de la restauración?");
        preguntas.add("¿Donde se encuentra la historia de los dos mil jovenes?");
        preguntas.add("¿Cuantos hermanos tuvo nefi?");

        txtpregunta.setText(preguntas.get(0));


    }
}
