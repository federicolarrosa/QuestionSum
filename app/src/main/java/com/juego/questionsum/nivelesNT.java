package com.juego.questionsum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nivelesNT extends AppCompatActivity implements View.OnClickListener {
 Button  btn_nt_1,btn_nt_2,btn_nt_3,btn_nt_4,btn_nt_5,btn_nt_6,btn_nt_7,btn_nt_8,btn_nt_9,btn_nt_10;
 Button btn_nt_11,btn_nt_12,btn_nt_13,btn_nt_14,btn_nt_15,btn_nt_16,btn_nt_17,btn_nt_18,btn_nt_19;
 Button btn_nt_20,btn_nt_21,btn_nt_22,btn_nt_23,btn_nt_24,btn_nt_25,btn_nt_26,btn_nt_27,btn_nt_28;
 Button btn_nt_29,btn_nt_30,btn_nt_31,btn_nt_32,btn_nt_33,btn_nt_34,btn_nt_35,btn_nt_36;
 Button btn_nt_37,btn_nt_38,btn_nt_39,btn_nt_40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_n_t);

        btn_nt_1=findViewById(R.id.btn_nt_1);
        btn_nt_2=findViewById(R.id.btn_nt_2);
        btn_nt_3=findViewById(R.id.btn_nt_3);
        btn_nt_4=findViewById(R.id.btn_nt_4);
        btn_nt_5=findViewById(R.id.btn_nt_5);
        btn_nt_6=findViewById(R.id.btn_nt_6);
        btn_nt_7=findViewById(R.id.btn_nt_7);
        btn_nt_8=findViewById(R.id.btn_nt_8);
        btn_nt_9=findViewById(R.id.btn_nt_9);
        btn_nt_10=findViewById(R.id.btn_nt_10);
        btn_nt_11=findViewById(R.id.btn_nt_11);
        btn_nt_12=findViewById(R.id.btn_nt_12);
        btn_nt_13=findViewById(R.id.btn_nt_13);
        btn_nt_14=findViewById(R.id.btn_nt_14);
        btn_nt_15=findViewById(R.id.btn_nt_15);
        btn_nt_16=findViewById(R.id.btn_nt_16);
        btn_nt_17=findViewById(R.id.btn_nt_17);
        btn_nt_18=findViewById(R.id.btn_nt_18);
        btn_nt_19=findViewById(R.id.btn_nt_19);
        btn_nt_20=findViewById(R.id.btn_nt_20);
        btn_nt_21=findViewById(R.id.btn_nt_21);
        btn_nt_22=findViewById(R.id.btn_nt_22);
        btn_nt_23=findViewById(R.id.btn_nt_23);
        btn_nt_24=findViewById(R.id.btn_nt_24);
        btn_nt_25=findViewById(R.id.btn_nt_25);
        btn_nt_26=findViewById(R.id.btn_nt_26);
        btn_nt_27=findViewById(R.id.btn_nt_27);
        btn_nt_28=findViewById(R.id.btn_nt_28);
        btn_nt_29=findViewById(R.id.btn_nt_29);
        btn_nt_30=findViewById(R.id.btn_nt_30);
        btn_nt_31=findViewById(R.id.btn_nt_31);
        btn_nt_32=findViewById(R.id.btn_nt_32);
        btn_nt_33=findViewById(R.id.btn_nt_33);
        btn_nt_34=findViewById(R.id.btn_nt_34);
        btn_nt_35=findViewById(R.id.btn_nt_35);
        btn_nt_36=findViewById(R.id.btn_nt_36);
        btn_nt_37=findViewById(R.id.btn_nt_37);
        btn_nt_38=findViewById(R.id.btn_nt_38);
        btn_nt_39=findViewById(R.id.btn_nt_39);
        btn_nt_40=findViewById(R.id.btn_nt_40);

        btn_nt_1.setOnClickListener(this);
        btn_nt_2.setOnClickListener(this);
        btn_nt_3.setOnClickListener(this);
        btn_nt_4.setOnClickListener(this);
        btn_nt_5.setOnClickListener(this);
        btn_nt_6.setOnClickListener(this);
        btn_nt_7.setOnClickListener(this);
        btn_nt_8.setOnClickListener(this);
        btn_nt_9.setOnClickListener(this);
        btn_nt_10.setOnClickListener(this);
        btn_nt_11.setOnClickListener(this);
        btn_nt_12.setOnClickListener(this);
        btn_nt_13.setOnClickListener(this);
        btn_nt_14.setOnClickListener(this);
        btn_nt_15.setOnClickListener(this);
        btn_nt_16.setOnClickListener(this);
        btn_nt_17.setOnClickListener(this);
        btn_nt_18.setOnClickListener(this);
        btn_nt_19.setOnClickListener(this);
        btn_nt_20.setOnClickListener(this);
        btn_nt_21.setOnClickListener(this);
        btn_nt_22.setOnClickListener(this);
        btn_nt_23.setOnClickListener(this);
        btn_nt_24.setOnClickListener(this);
        btn_nt_25.setOnClickListener(this);
        btn_nt_26.setOnClickListener(this);
        btn_nt_27.setOnClickListener(this);
        btn_nt_28.setOnClickListener(this);
        btn_nt_29.setOnClickListener(this);
        btn_nt_30.setOnClickListener(this);
        btn_nt_31.setOnClickListener(this);
        btn_nt_32.setOnClickListener(this);
        btn_nt_33.setOnClickListener(this);
        btn_nt_34.setOnClickListener(this);
        btn_nt_35.setOnClickListener(this);
        btn_nt_36.setOnClickListener(this);
        btn_nt_37.setOnClickListener(this);
        btn_nt_38.setOnClickListener(this);
        btn_nt_39.setOnClickListener(this);
        btn_nt_40.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_nt_1:
                Intent intent = new Intent(nivelesNT.this,ntPregunta.class);
                intent.putExtra("id",btn_nt_1.getText().toString());
                this.startActivity(intent);
                break;
            case R.id.btn_nt_2:
                Intent intent2 = new Intent(nivelesNT.this,ntPregunta.class);
                intent2.putExtra("id",btn_nt_2.getText().toString());
                this.startActivity(intent2);
                break;
            case R.id.btn_nt_3:
                Intent intent3 = new Intent(nivelesNT.this,ntPregunta.class);
                intent3.putExtra("id",btn_nt_3.getText().toString());
                this.startActivity(intent3);
                break;
            case R.id.btn_nt_4:
                Intent intent4 = new Intent(nivelesNT.this,ntPregunta.class);
                intent4.putExtra("id",btn_nt_4.getText().toString());
                this.startActivity(intent4);
                break;
            case R.id.btn_nt_5:
                Intent intent5 = new Intent(nivelesNT.this,ntPregunta.class);
                intent5.putExtra("id",btn_nt_5.getText().toString());
                this.startActivity(intent5);
                break;
            case R.id.btn_nt_6:
                Intent intent6 = new Intent(nivelesNT.this,ntPregunta.class);
                intent6.putExtra("id",btn_nt_6.getText().toString());
                this.startActivity(intent6);
                break;
            case R.id.btn_nt_7:
                Intent intent7 = new Intent(nivelesNT.this,ntPregunta.class);
                intent7.putExtra("id",btn_nt_7.getText().toString());
                this.startActivity(intent7);
                break;
            case R.id.btn_nt_8:
                Intent intent8 = new Intent(nivelesNT.this,ntPregunta.class);
                intent8.putExtra("id",btn_nt_8.getText().toString());
                this.startActivity(intent8);
                break;
            case R.id.btn_nt_9:
                Intent intent9 = new Intent(nivelesNT.this,ntPregunta.class);
                intent9.putExtra("id",btn_nt_9.getText().toString());
                this.startActivity(intent9);
                break;
            case R.id.btn_nt_10:
                Intent intent10 = new Intent(nivelesNT.this,ntPregunta.class);
                intent10.putExtra("id",btn_nt_10.getText().toString());
                this.startActivity(intent10);
                break;
            case R.id.btn_nt_11:
                Intent intent11 = new Intent(nivelesNT.this,ntPregunta.class);
                intent11.putExtra("id",btn_nt_11.getText().toString());
                this.startActivity(intent11);
                break;
            case R.id.btn_nt_12:
                Intent intent12 = new Intent(nivelesNT.this,ntPregunta.class);
                intent12.putExtra("id",btn_nt_12.getText().toString());
                this.startActivity(intent12);
                break;
            case R.id.btn_nt_13:
                Intent intent13 = new Intent(nivelesNT.this,ntPregunta.class);
                intent13.putExtra("id",btn_nt_13.getText().toString());
                this.startActivity(intent13);
                break;
            case R.id.btn_nt_14:
                Intent intent14 = new Intent(nivelesNT.this,ntPregunta.class);
                intent14.putExtra("id",btn_nt_14.getText().toString());
                this.startActivity(intent14);
                break;
            case R.id.btn_nt_15:
                Intent intent15 = new Intent(nivelesNT.this,ntPregunta.class);
                intent15.putExtra("id",btn_nt_15.getText().toString());
                this.startActivity(intent15);
                break;
            case R.id.btn_nt_16:
                Intent intent16 = new Intent(nivelesNT.this,ntPregunta.class);
                intent16.putExtra("id",btn_nt_16.getText().toString());
                this.startActivity(intent16);
                break;
            case R.id.btn_nt_17:
                Intent intent17 = new Intent(nivelesNT.this,ntPregunta.class);
                intent17.putExtra("id",btn_nt_17.getText().toString());
                this.startActivity(intent17);
                break;
            case R.id.btn_nt_18:
                Intent intent18 = new Intent(nivelesNT.this,ntPregunta.class);
                intent18.putExtra("id",btn_nt_18.getText().toString());
                this.startActivity(intent18);
                break;
            case R.id.btn_nt_19:
                Intent intent19 = new Intent(nivelesNT.this,ntPregunta.class);
                intent19.putExtra("id",btn_nt_19.getText().toString());
                this.startActivity(intent19);
                break;
            case R.id.btn_nt_20:
                Intent intent20 = new Intent(nivelesNT.this,ntPregunta.class);
                intent20.putExtra("id",btn_nt_20.getText().toString());
                this.startActivity(intent20);
                break;
            case R.id.btn_nt_21:
                Intent intent21 = new Intent(nivelesNT.this,ntPregunta.class);
                intent21.putExtra("id",btn_nt_21.getText().toString());
                this.startActivity(intent21);
                break;
            case R.id.btn_nt_22:
                Intent intent22 = new Intent(nivelesNT.this,ntPregunta.class);
                intent22.putExtra("id",btn_nt_22.getText().toString());
                this.startActivity(intent22);
                break;
            case R.id.btn_nt_23:
                Intent intent23 = new Intent(nivelesNT.this,ntPregunta.class);
                intent23.putExtra("id",btn_nt_23.getText().toString());
                this.startActivity(intent23);
                break;
            case R.id.btn_nt_24:
                Intent intent24 = new Intent(nivelesNT.this,ntPregunta.class);
                intent24.putExtra("id",btn_nt_24.getText().toString());
                this.startActivity(intent24);
                break;
            case R.id.btn_nt_25:
                Intent intent25 = new Intent(nivelesNT.this,ntPregunta.class);
                intent25.putExtra("id",btn_nt_25.getText().toString());
                this.startActivity(intent25);
                break;
            case R.id.btn_nt_26:
                Intent intent26 = new Intent(nivelesNT.this,ntPregunta.class);
                intent26.putExtra("id",btn_nt_26.getText().toString());
                this.startActivity(intent26);
                break;
            case R.id.btn_nt_27:
                Intent intent27 = new Intent(nivelesNT.this,ntPregunta.class);
                intent27.putExtra("id",btn_nt_27.getText().toString());
                this.startActivity(intent27);
                break;
            case R.id.btn_nt_28:
                Intent intent28 = new Intent(nivelesNT.this,ntPregunta.class);
                intent28.putExtra("id",btn_nt_28.getText().toString());
                this.startActivity(intent28);
                break;
            case R.id.btn_nt_29:
                Intent intent29 = new Intent(nivelesNT.this,ntPregunta.class);
                intent29.putExtra("id",btn_nt_29.getText().toString());
                this.startActivity(intent29);
                break;
            case R.id.btn_nt_30:
                Intent intent30 = new Intent(nivelesNT.this,ntPregunta.class);
                intent30.putExtra("id",btn_nt_30.getText().toString());
                this.startActivity(intent30);
                break;
            case R.id.btn_nt_31:
                Intent intent31 = new Intent(nivelesNT.this,ntPregunta.class);
                intent31.putExtra("id",btn_nt_31.getText().toString());
                this.startActivity(intent31);
                break;
            case R.id.btn_nt_32:
                Intent intent32 = new Intent(nivelesNT.this,ntPregunta.class);
                intent32.putExtra("id",btn_nt_32.getText().toString());
                this.startActivity(intent32);
                break;
            case R.id.btn_nt_33:
                Intent intent33 = new Intent(nivelesNT.this,ntPregunta.class);
                intent33.putExtra("id",btn_nt_33.getText().toString());
                this.startActivity(intent33);
                break;
            case R.id.btn_nt_34:
                Intent intent34 = new Intent(nivelesNT.this,ntPregunta.class);
                intent34.putExtra("id",btn_nt_34.getText().toString());
                this.startActivity(intent34);
                break;
            case R.id.btn_nt_35:
                Intent intent35 = new Intent(nivelesNT.this,ntPregunta.class);
                intent35.putExtra("id",btn_nt_35.getText().toString());
                this.startActivity(intent35);
                break;
            case R.id.btn_nt_36:
                Intent intent36 = new Intent(nivelesNT.this,ntPregunta.class);
                intent36.putExtra("id",btn_nt_36.getText().toString());
                this.startActivity(intent36);
                break;
            case R.id.btn_nt_37:
                Intent intent37 = new Intent(nivelesNT.this,ntPregunta.class);
                intent37.putExtra("id",btn_nt_37.getText().toString());
                this.startActivity(intent37);
                break;
            case R.id.btn_nt_38:
                Intent intent38 = new Intent(nivelesNT.this,ntPregunta.class);
                intent38.putExtra("id",btn_nt_38.getText().toString());
                this.startActivity(intent38);
                break;
            case R.id.btn_nt_39:
                Intent intent39 = new Intent(nivelesNT.this,ntPregunta.class);
                intent39.putExtra("id",btn_nt_39.getText().toString());
                this.startActivity(intent39);
                break;
            case R.id.btn_nt_40:
                Intent intent40 = new Intent(nivelesNT.this,ntPregunta.class);
                intent40.putExtra("id",btn_nt_40.getText().toString());
                this.startActivity(intent40);
                break;


        }
    }
}
