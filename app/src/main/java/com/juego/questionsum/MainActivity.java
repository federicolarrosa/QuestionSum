package com.juego.questionsum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button LDM,DYC,NT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LDM = findViewById(R.id.LDM);
        DYC = findViewById(R.id.DYC);
        NT = findViewById(R.id.NT);


        LDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, nivelesLDM.class);
                intent.putExtra("Categoria", LDM.getText().toString());
                startActivity(intent);
            }
        });


        DYC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, nivelesDYC.class);
                intent.putExtra("Categoria", DYC.getText().toString());
                startActivity(intent);
            }
        });

        NT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, nivelesNT.class);
                intent.putExtra("Categoria", NT.getText().toString());
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        // Associate searchable configuration with the SearchView
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem itemMenu) {

        switch (itemMenu.getItemId()){
            case R.id.administrador:
                startActivity(new Intent(MainActivity.this,cargaPreguntas.class));
                break;



        }
        return super.onOptionsItemSelected(itemMenu);
    }
}
