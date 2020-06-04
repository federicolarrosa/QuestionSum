package com.juego.questionsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ldmPregunta extends AppCompatActivity {

    TextView txtPregunta;
    RadioGroup radioGroup;
    RadioButton rp1,rp2,rp3,rp4;
    ProgressBar progressBar;
    ArrayList<String>Preguntas;
    String id,Categoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ldm_pregunta);

        txtPregunta=findViewById(R.id.txtPregunta);
        radioGroup=findViewById(R.id.radioGroup);
        rp1=findViewById(R.id.rp1);
        rp2=findViewById(R.id.rp2);
        rp3=findViewById(R.id.rp3);
        rp4=findViewById(R.id.rp4);

        Preguntas=new ArrayList<>();
        Categoria=getIntent().getStringExtra("Categoria");

    }
}
