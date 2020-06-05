package com.juego.questionsum;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class dycPregunta extends AppCompatActivity {
        TextView txtpregunta,txtmostrar,porcentaje,level;
        RadioGroup radioGroup;
        RadioButton rp1, rp2, rp3, rp4;
        ProgressBar progressBar;
        String id,Categoria,V,F,ver="",key,pregunta,Rpv,Rp1,Rp2,Rp3;
        Boolean verdadero = true;
        int pos = 0;
        ArrayList<String> preguntas = new ArrayList<>();
        DatabaseReference myRef;
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
        Categoria=getIntent().getStringExtra("Categoria");
        id = getIntent().getStringExtra("id");
        Log.d("pregunta",Categoria);
        Log.d("pre",id);
        myRef= FirebaseDatabase.getInstance().getReference().child("PreguntasRes").child(Categoria).child(id);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    key=dataSnapshot1.getKey();
                    pregunta=dataSnapshot1.child("Pregunta").getValue().toString();
                    Rpv=dataSnapshot1.child("RespuestaV").getValue().toString();
                    Rp1=dataSnapshot1.child("Respuesta1").getValue().toString();
                    Rp2=dataSnapshot1.child("Respuesta2").getValue().toString();
                    Rp3=dataSnapshot1.child("Respuesta3").getValue().toString();
                    Log.d("pregunta",dataSnapshot1.child("Pregunta").getValue().toString());
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        switch (id) {
            case "1":
                level.setText(id);



                while (verdadero) {

                    switch (pos) {
                        case 0:
                            txtpregunta.setText(pregunta);

                            Random(Rp1,Rp2,Rp3,Rpv);
                            rp1.setText(Rpv);
                            rp2.setText(Rp1);
                            rp3.setText(Rp2);
                            rp4.setText(Rp3);
                            if (rp1.equals(Rpv)){
                                ver = "rp1";
                            }else if (rp2.equals(Rpv)){
                                ver="rp2";
                            }else if (rp3.equals(Rpv))
                                ver="rp3";
                            else if (rp4.equals(Rpv)){
                                ver="rp4";
                            }
                            verdadero = true;
                            break;
                        case 1:
                            txtpregunta.setText(pregunta);
                            rp1.setText("2 veces");
                            rp2.setText("6 veces");
                            rp3.setText("4 veces");
                            rp4.setText("3 veces");
                            ver = "rp3";
                            verdadero = true;
                            break;
                        case 2:
                            txtpregunta.setText(pregunta);
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

                break;
        }

    }

    private void Random(String R1, String R2, String R3, String RV){

        for (int i=0;i<10;i++){
            String rp1 = R2;
            String rp2 = R3;
            String rp3 = RV;
            String rp4 = R1;

            String r1=rp2;
            String r2=rp4;
            String r3=rp1;
            String r4=rp3;

            R1=r1;
            R2=r2;
            R3=r3;
            RV=r4;


        }
    }
}
