package com.juego.questionsum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nivelesLDM extends AppCompatActivity implements View.OnClickListener {
    Button btn_ldm_1, btn_ldm_2, btn_ldm_3, btn_ldm_4, btn_ldm_5, btn_ldm_6, btn_ldm_7, btn_ldm_8;
    Button btn_ldm_9, btn_ldm_10, btn_ldm_11, btn_ldm_12, btn_ldm_13, btn_ldm_14, btn_ldm_15;
    Button btn_ldm_16, btn_ldm_17, btn_ldm_18, btn_ldm_19, btn_ldm_20, btn_ldm_21, btn_ldm_22;
    Button btn_ldm_23, btn_ldm_24, btn_ldm_25, btn_ldm_26, btn_ldm_27, btn_ldm_28, btn_ldm_29;
    Button btn_ldm_30, btn_ldm_31, btn_ldm_32, btn_ldm_33, btn_ldm_34, btn_ldm_35, btn_ldm_36;
    Button btn_ldm_37, btn_ldm_38, btn_ldm_39, btn_ldm_40;
    String Categoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_l_d_m);

        btn_ldm_1 = findViewById(R.id.btn_ldm_1);
        btn_ldm_2 = findViewById(R.id.btn_ldm_2);
        btn_ldm_3 = findViewById(R.id.btn_ldm_3);
        btn_ldm_4 = findViewById(R.id.btn_ldm_4);
        btn_ldm_5 = findViewById(R.id.btn_ldm_5);
        btn_ldm_6 = findViewById(R.id.btn_ldm_6);
        btn_ldm_7 = findViewById(R.id.btn_ldm_7);
        btn_ldm_8 = findViewById(R.id.btn_ldm_8);
        btn_ldm_9 = findViewById(R.id.btn_ldm_9);
        btn_ldm_10 = findViewById(R.id.btn_ldm_10);
        btn_ldm_11 = findViewById(R.id.btn_ldm_11);
        btn_ldm_12 = findViewById(R.id.btn_ldm_12);
        btn_ldm_13 = findViewById(R.id.btn_ldm_13);
        btn_ldm_14 = findViewById(R.id.btn_ldm_14);
        btn_ldm_15 = findViewById(R.id.btn_ldm_15);
        btn_ldm_16 = findViewById(R.id.btn_ldm_16);
        btn_ldm_17 = findViewById(R.id.btn_ldm_17);
        btn_ldm_18 = findViewById(R.id.btn_ldm_18);
        btn_ldm_19 = findViewById(R.id.btn_ldm_19);
        btn_ldm_20 = findViewById(R.id.btn_ldm_20);
        btn_ldm_21 = findViewById(R.id.btn_ldm_21);
        btn_ldm_22 = findViewById(R.id.btn_ldm_22);
        btn_ldm_23 = findViewById(R.id.btn_ldm_23);
        btn_ldm_24 = findViewById(R.id.btn_ldm_24);
        btn_ldm_25 = findViewById(R.id.btn_ldm_25);
        btn_ldm_26 = findViewById(R.id.btn_ldm_26);
        btn_ldm_27 = findViewById(R.id.btn_ldm_27);
        btn_ldm_28 = findViewById(R.id.btn_ldm_28);
        btn_ldm_29 = findViewById(R.id.btn_ldm_29);
        btn_ldm_30 = findViewById(R.id.btn_ldm_30);
        btn_ldm_31 = findViewById(R.id.btn_ldm_31);
        btn_ldm_32 = findViewById(R.id.btn_ldm_32);
        btn_ldm_33 = findViewById(R.id.btn_ldm_33);
        btn_ldm_34 = findViewById(R.id.btn_ldm_34);
        btn_ldm_35 = findViewById(R.id.btn_ldm_35);
        btn_ldm_36 = findViewById(R.id.btn_ldm_36);
        btn_ldm_37 = findViewById(R.id.btn_ldm_37);
        btn_ldm_38 = findViewById(R.id.btn_ldm_38);
        btn_ldm_39 = findViewById(R.id.btn_ldm_39);
        btn_ldm_40 = findViewById(R.id.btn_ldm_40);

        btn_ldm_1.setOnClickListener(this);
        btn_ldm_2.setOnClickListener(this);
        btn_ldm_3.setOnClickListener(this);
        btn_ldm_4.setOnClickListener(this);
        btn_ldm_5.setOnClickListener(this);
        btn_ldm_6.setOnClickListener(this);
        btn_ldm_7.setOnClickListener(this);
        btn_ldm_8.setOnClickListener(this);
        btn_ldm_9.setOnClickListener(this);
        btn_ldm_10.setOnClickListener(this);
        btn_ldm_11.setOnClickListener(this);
        btn_ldm_12.setOnClickListener(this);
        btn_ldm_13.setOnClickListener(this);
        btn_ldm_14.setOnClickListener(this);
        btn_ldm_15.setOnClickListener(this);
        btn_ldm_16.setOnClickListener(this);
        btn_ldm_17.setOnClickListener(this);
        btn_ldm_18.setOnClickListener(this);
        btn_ldm_19.setOnClickListener(this);
        btn_ldm_20.setOnClickListener(this);
        btn_ldm_21.setOnClickListener(this);
        btn_ldm_22.setOnClickListener(this);
        btn_ldm_23.setOnClickListener(this);
        btn_ldm_24.setOnClickListener(this);
        btn_ldm_25.setOnClickListener(this);
        btn_ldm_26.setOnClickListener(this);
        btn_ldm_27.setOnClickListener(this);
        btn_ldm_28.setOnClickListener(this);
        btn_ldm_29.setOnClickListener(this);
        btn_ldm_30.setOnClickListener(this);
        btn_ldm_31.setOnClickListener(this);
        btn_ldm_32.setOnClickListener(this);
        btn_ldm_33.setOnClickListener(this);
        btn_ldm_34.setOnClickListener(this);
        btn_ldm_35.setOnClickListener(this);
        btn_ldm_36.setOnClickListener(this);
        btn_ldm_37.setOnClickListener(this);
        btn_ldm_38.setOnClickListener(this);
        btn_ldm_39.setOnClickListener(this);
        btn_ldm_40.setOnClickListener(this);

        Categoria = getIntent().getStringExtra("Categoria");
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_ldm_1:
                Intent intent = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent.putExtra("id", btn_ldm_1.getText().toString());
                intent.putExtra("Categoria",Categoria);
                this.startActivity(intent);
                break;
            case R.id.btn_ldm_2:
                Intent intent2 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent2.putExtra("id", btn_ldm_2.getText().toString());
                intent2.putExtra("Categoria",Categoria);
                this.startActivity(intent2);
                break;
            case R.id.btn_ldm_3:
                Intent intent3 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent3.putExtra("id", btn_ldm_3.getText().toString());
                intent3.putExtra("Categoria",Categoria);
                this.startActivity(intent3);
                break;
            case R.id.btn_ldm_4:
                Intent intent4 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent4.putExtra("id", btn_ldm_4.getText().toString());
                intent4.putExtra("Categoria",Categoria);
                this.startActivity(intent4);
                break;
            case R.id.btn_ldm_5:
                Intent intent5 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent5.putExtra("id", btn_ldm_5.getText().toString());
                intent5.putExtra("Categoria",Categoria);
                this.startActivity(intent5);
                break;
            case R.id.btn_ldm_6:
                Intent intent6 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent6.putExtra("id", btn_ldm_6.getText().toString());
                intent6.putExtra("Categoria",Categoria);
                this.startActivity(intent6);
                break;
            case R.id.btn_ldm_7:
                Intent intent7 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent7.putExtra("id", btn_ldm_7.getText().toString());
                intent7.putExtra("Categoria",Categoria);
                this.startActivity(intent7);
                break;
            case R.id.btn_ldm_8:
                Intent intent8 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent8.putExtra("id", btn_ldm_8.getText().toString());
                intent8.putExtra("Categoria",Categoria);
                this.startActivity(intent8);
                break;
            case R.id.btn_ldm_9:
                Intent intent9 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent9.putExtra("id", btn_ldm_9.getText().toString());
                intent9.putExtra("Categoria",Categoria);
                this.startActivity(intent9);
                break;
            case R.id.btn_ldm_10:
                Intent intent10 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent10.putExtra("id", btn_ldm_10.getText().toString());
                intent10.putExtra("Categoria",Categoria);
                this.startActivity(intent10);
                break;
            case R.id.btn_ldm_11:
                Intent intent11 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent11.putExtra("id", btn_ldm_11.getText().toString());
                intent11.putExtra("Categoria",Categoria);
                this.startActivity(intent11);
                break;
            case R.id.btn_ldm_12:
                Intent intent12 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent12.putExtra("id", btn_ldm_12.getText().toString());
                intent12.putExtra("Categoria",Categoria);
                this.startActivity(intent12);
                break;
            case R.id.btn_ldm_13:
                Intent intent13 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent13.putExtra("id", btn_ldm_13.getText().toString());
                intent13.putExtra("Categoria",Categoria);
                this.startActivity(intent13);
                break;
            case R.id.btn_ldm_14:
                Intent intent14 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent14.putExtra("id", btn_ldm_14.getText().toString());
                intent14.putExtra("Categoria",Categoria);
                this.startActivity(intent14);
                break;
            case R.id.btn_ldm_15:
                Intent intent15 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent15.putExtra("id", btn_ldm_15.getText().toString());
                intent15.putExtra("Categoria",Categoria);
                this.startActivity(intent15);
                break;
            case R.id.btn_ldm_16:
                Intent intent16 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent16.putExtra("id", btn_ldm_16.getText().toString());
                intent16.putExtra("Categoria",Categoria);
                this.startActivity(intent16);
                break;
            case R.id.btn_ldm_17:
                Intent intent17 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent17.putExtra("id", btn_ldm_17.getText().toString());
                intent17.putExtra("Categoria",Categoria);
                this.startActivity(intent17);
                break;
            case R.id.btn_ldm_18:
                Intent intent18 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent18.putExtra("id", btn_ldm_18.getText().toString());
                intent18.putExtra("Categoria",Categoria);
                this.startActivity(intent18);
                break;
            case R.id.btn_ldm_19:
                Intent intent19 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent19.putExtra("id", btn_ldm_19.getText().toString());
                intent19.putExtra("Categoria",Categoria);
                this.startActivity(intent19);
                break;
            case R.id.btn_ldm_20:
                Intent intent20 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent20.putExtra("id", btn_ldm_20.getText().toString());
                intent20.putExtra("Categoria",Categoria);
                this.startActivity(intent20);
                break;
            case R.id.btn_ldm_21:
                Intent intent21 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent21.putExtra("id", btn_ldm_21.getText().toString());
                intent21.putExtra("Categoria",Categoria);
                this.startActivity(intent21);
                break;
            case R.id.btn_ldm_22:
                Intent intent22 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent22.putExtra("id", btn_ldm_22.getText().toString());
                intent22.putExtra("Categoria",Categoria);
                this.startActivity(intent22);
                break;
            case R.id.btn_ldm_23:
                Intent intent23 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent23.putExtra("id", btn_ldm_23.getText().toString());
                intent23.putExtra("Categoria",Categoria);
                this.startActivity(intent23);
                break;
            case R.id.btn_ldm_24:
                Intent intent24 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent24.putExtra("id", btn_ldm_24.getText().toString());
                intent24.putExtra("Categoria",Categoria);
                this.startActivity(intent24);
                break;
            case R.id.btn_ldm_25:
                Intent intent25 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent25.putExtra("id", btn_ldm_25.getText().toString());
                intent25.putExtra("Categoria",Categoria);
                this.startActivity(intent25);
                break;
            case R.id.btn_ldm_26:
                Intent intent26 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent26.putExtra("id", btn_ldm_26.getText().toString());
                intent26.putExtra("Categoria",Categoria);
                this.startActivity(intent26);
                break;
            case R.id.btn_ldm_27:
                Intent intent27 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent27.putExtra("id", btn_ldm_27.getText().toString());
                intent27.putExtra("Categoria",Categoria);
                this.startActivity(intent27);
                break;
            case R.id.btn_ldm_28:
                Intent intent28 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent28.putExtra("id", btn_ldm_28.getText().toString());
                intent28.putExtra("Categoria",Categoria);
                this.startActivity(intent28);
                break;
            case R.id.btn_ldm_29:
                Intent intent29 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent29.putExtra("id", btn_ldm_29.getText().toString());
                intent29.putExtra("Categoria",Categoria);
                this.startActivity(intent29);
                break;
            case R.id.btn_ldm_30:
                Intent intent30 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent30.putExtra("id", btn_ldm_30.getText().toString());
                intent30.putExtra("Categoria",Categoria);
                this.startActivity(intent30);
                break;
            case R.id.btn_ldm_31:
                Intent intent31 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent31.putExtra("id", btn_ldm_31.getText().toString());
                intent31.putExtra("Categoria",Categoria);
                this.startActivity(intent31);
                break;
            case R.id.btn_ldm_32:
                Intent intent32 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent32.putExtra("id", btn_ldm_32.getText().toString());
                intent32.putExtra("Categoria",Categoria);
                this.startActivity(intent32);
                break;
            case R.id.btn_ldm_33:
                Intent intent33 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent33.putExtra("id", btn_ldm_33.getText().toString());
                intent33.putExtra("Categoria",Categoria);
                this.startActivity(intent33);
                break;
            case R.id.btn_ldm_34:
                Intent intent34 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent34.putExtra("id", btn_ldm_34.getText().toString());
                intent34.putExtra("Categoria",Categoria);
                this.startActivity(intent34);
                break;
            case R.id.btn_ldm_35:
                Intent intent35 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent35.putExtra("id", btn_ldm_35.getText().toString());
                intent35.putExtra("Categoria",Categoria);
                this.startActivity(intent35);
                break;
            case R.id.btn_ldm_36:
                Intent intent36 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent36.putExtra("id", btn_ldm_36.getText().toString());
                intent36.putExtra("Categoria",Categoria);
                this.startActivity(intent36);
                break;
            case R.id.btn_ldm_37:
                Intent intent37 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent37.putExtra("id", btn_ldm_37.getText().toString());
                intent37.putExtra("Categoria",Categoria);
                this.startActivity(intent37);
                break;
            case R.id.btn_ldm_38:
                Intent intent38 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent38.putExtra("id", btn_ldm_38.getText().toString());
                intent38.putExtra("Categoria",Categoria);
                this.startActivity(intent38);
                break;
            case R.id.btn_ldm_39:
                Intent intent39 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent39.putExtra("id", btn_ldm_39.getText().toString());
                intent39.putExtra("Categoria",Categoria);
                this.startActivity(intent39);
                break;
            case R.id.btn_ldm_40:
                Intent intent40 = new Intent(nivelesLDM.this, ldmPregunta.class);
                intent40.putExtra("id", btn_ldm_40.getText().toString());
                intent40.putExtra("Categoria",Categoria);
                this.startActivity(intent40);
                break;







        }
    }
}
