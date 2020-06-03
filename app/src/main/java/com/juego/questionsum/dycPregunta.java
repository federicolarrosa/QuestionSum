package com.juego.questionsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class dycPregunta extends AppCompatActivity {
        TextView txtpregunta,txtmostrar,porcentaje,level;
        RadioGroup radioGroup;
        RadioButton rp1, rp2, rp3, rp4;
        ProgressBar progressBar;
        String id,V,F,ver="";
        Boolean verdadero = true;
        int pos = 0;
        ArrayList<String> preguntas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dyc_pregunta);
        level = findViewById(R.id.level);
        porcentaje = findViewById(R.id.porcentaje);
        txtpregunta = findViewById(R.id.txtPregunta);
        txtmostrar = findViewById(R.id.txtmostrar);
        radioGroup = findViewById(R.id.radioGroup);
        rp1 = findViewById(R.id.rp1);
        rp2 = findViewById(R.id.rp2);
        rp3 = findViewById(R.id.rp3);
        rp4 = findViewById(R.id.rp4);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(0);
        progressBar.setMax(100);
        V = "Correcto";
        F = "Incorrecto";


        id = getIntent().getStringExtra("id");
        preguntas.add("¿Como se llama el profeta de la restauración?");
        preguntas.add("¿Cuantas veces se le aparecio el angel Moroni a Jose Smith?");
        preguntas.add("¿Cuantos hermanos tuvo nefi?");
        switch (id) {
            case "1":
                level.setText(id);



                while (verdadero) {

                    switch (pos) {
                        case 0:
                            txtpregunta.setText(preguntas.get(0));
                            rp1.setText("Jose Smith");
                            rp2.setText("Brigham Young");
                            rp3.setText("Joseph Fielding Smith");
                            rp4.setText("Gordon B. Hinckley");
                            ver = "rp1";
                            verdadero = true;
                            break;
                        case 1:
                            txtpregunta.setText(preguntas.get(1));
                            rp1.setText("2 veces");
                            rp2.setText("6 veces");
                            rp3.setText("4 veces");
                            rp4.setText("3 veces");
                            ver = "rp3";
                            verdadero = true;
                            break;
                        case 2:
                            txtpregunta.setText(preguntas.get(2));
                            rp1.setText("2 Hermanos");
                            rp2.setText("6 Hermanos");
                            rp3.setText("4 Hermanos");
                            rp4.setText("3 Hermanos");
                            ver = "rp4";
                            verdadero = false;
                            break;

                    }


                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        while (pos <= 2) {
                            switch (ver) {
                                case "rp1":
                                    if (checkedId == R.id.rp1) {
                                        txtmostrar.setText(V);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.verde));
                                        progressBar.setProgress(20);
                                        porcentaje.setText(String.valueOf(progressBar.getProgress()) + "%");
                                        pos++;
                                    } else if (checkedId == R.id.rp2) {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                                    } else if (checkedId == R.id.rp3) {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                                    } else {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));

                                    }
                                    break;
                                case "rp2":
                                    if (checkedId == R.id.rp1) {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));

                                    } else if (checkedId == R.id.rp2) {
                                        txtmostrar.setText(V);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.verde));
                                        progressBar.setProgress(20);
                                        porcentaje.setText(String.valueOf(progressBar.getProgress()) + "%");
                                        pos++;
                                    } else if (checkedId == R.id.rp3) {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                                    } else {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));

                                    }
                                    break;
                                case "rp3":
                                    if (checkedId == R.id.rp1) {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                                    } else if (checkedId == R.id.rp2) {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                                    } else if (checkedId == R.id.rp3) {
                                        txtmostrar.setText(V);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.verde));
                                        progressBar.setProgress(20);
                                        porcentaje.setText(String.valueOf(progressBar.getProgress()) + "%");
                                        pos++;
                                    } else {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));

                                    }
                                    break;
                                case "rp4":
                                    if (checkedId == R.id.rp1) {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                                    } else if (checkedId == R.id.rp2) {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                                    } else if (checkedId == R.id.rp3) {
                                        txtmostrar.setText(F);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                                    } else {
                                        txtmostrar.setText(V);
                                        txtmostrar.setVisibility(View.VISIBLE);
                                        txtmostrar.setBackgroundColor(getResources().getColor(R.color.verde));
                                        progressBar.setProgress(20);
                                        porcentaje.setText(String.valueOf(progressBar.getProgress()) + "%");
                                        pos++;
                                    }
                                    break;
                            }
                        }
                    }
                });
                break;
                }
            case "2":
                level.setText(id);
                txtpregunta.setText(preguntas.get(1));
                break;
        }

    }
}
