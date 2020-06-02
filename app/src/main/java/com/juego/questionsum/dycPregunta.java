package com.juego.questionsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class dycPregunta extends AppCompatActivity {
        TextView txtpregunta,txtmostrar;
        RadioGroup radioGroup;
        RadioButton rp1, rp2, rp3, rp4;
        ProgressBar progressBar;
        String id,V,F;

        ArrayList<String> preguntas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dyc_pregunta);

        txtpregunta = findViewById(R.id.txtPregunta);
        txtmostrar=findViewById(R.id.txtmostrar);
        radioGroup = findViewById(R.id.radioGroup);
        rp1 = findViewById(R.id.rp1);
        rp2 = findViewById(R.id.rp2);
        rp3 = findViewById(R.id.rp3);
        rp4 = findViewById(R.id.rp4);
        progressBar = findViewById(R.id.progressBar);
        V="Correcto";
        F="Incorrecto";

        progressBar.setMax(100);
        id = getIntent().getStringExtra("id");
        preguntas.add("¿Como se llama el profeta de la restauración?");
        preguntas.add("¿Donde se encuentra la historia de los dos mil jovenes?");
        preguntas.add("¿Cuantos hermanos tuvo nefi?");
        switch (id) {
            case "1":

                txtpregunta.setText(preguntas.get(0));
                int pos =0;
                if (pos==0){
                    
                    rp1.setText("Jose Smith");
                    rp2.setText("Brigham Young");
                    rp3.setText("Joseph Fielding Smith");
                    rp4.setText("Gordon B. Hinckley");
                }
                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if(checkedId==R.id.rp1){
                            txtmostrar.setText(V);
                            txtmostrar.setVisibility(View.VISIBLE);
                            txtmostrar.setBackgroundColor(getResources().getColor(R.color.verde));
                            progressBar.setProgress(20);
                        }else if(checkedId==R.id.rp2){
                            txtmostrar.setText(F);
                            txtmostrar.setVisibility(View.VISIBLE);
                            txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                        }else if(checkedId==R.id.rp3){
                            txtmostrar.setText(F);
                            txtmostrar.setVisibility(View.VISIBLE);
                            txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));
                        }else{
                            txtmostrar.setText(F);
                            txtmostrar.setVisibility(View.VISIBLE);
                            txtmostrar.setBackgroundColor(getResources().getColor(R.color.rojo));

                        }
                    }
                });
                break;
            case "2":
                txtpregunta.setText(preguntas.get(1));
                break;
        }

    }
}
