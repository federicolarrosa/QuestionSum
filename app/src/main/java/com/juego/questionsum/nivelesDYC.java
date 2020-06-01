package com.juego.questionsum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nivelesDYC extends AppCompatActivity implements View.OnClickListener {
    Button btn_dyc_1, btn_dyc_2, btn_dyc_3, btn_dyc_4, btn_dyc_5, btn_dyc_6, btn_dyc_7, btn_dyc_8;
    Button btn_dyc_9, btn_dyc_10, btn_dyc_11, btn_dyc_12, btn_dyc_13, btn_dyc_14, btn_dyc_15;
    Button btn_dyc_16, btn_dyc_17, btn_dyc_18, btn_dyc_19, btn_dyc_20, btn_dyc_21, btn_dyc_22;
    Button btn_dyc_23, btn_dyc_24, btn_dyc_25, btn_dyc_26, btn_dyc_27, btn_dyc_28, btn_dyc_29;
    Button btn_dyc_30, btn_dyc_31, btn_dyc_32, btn_dyc_33, btn_dyc_34, btn_dyc_35, btn_dyc_36;
    Button btn_dyc_37, btn_dyc_38, btn_dyc_39, btn_dyc_40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_d_y_c);

        btn_dyc_1 = findViewById(R.id.btn_dyc_1);
        btn_dyc_2 = findViewById(R.id.btn_dyc_2);
        btn_dyc_3 = findViewById(R.id.btn_dyc_3);
        btn_dyc_4 = findViewById(R.id.btn_dyc_4);
        btn_dyc_5 = findViewById(R.id.btn_dyc_5);
        btn_dyc_6 = findViewById(R.id.btn_dyc_6);
        btn_dyc_7 = findViewById(R.id.btn_dyc_7);
        btn_dyc_8 = findViewById(R.id.btn_dyc_8);
        btn_dyc_9 = findViewById(R.id.btn_dyc_9);
        btn_dyc_10 = findViewById(R.id.btn_dyc_10);
        btn_dyc_11 = findViewById(R.id.btn_dyc_11);
        btn_dyc_12 = findViewById(R.id.btn_dyc_12);
        btn_dyc_13 = findViewById(R.id.btn_dyc_13);
        btn_dyc_14 = findViewById(R.id.btn_dyc_14);
        btn_dyc_15 = findViewById(R.id.btn_dyc_15);
        btn_dyc_16 = findViewById(R.id.btn_dyc_16);
        btn_dyc_17 = findViewById(R.id.btn_dyc_17);
        btn_dyc_18 = findViewById(R.id.btn_dyc_18);
        btn_dyc_19 = findViewById(R.id.btn_dyc_19);
        btn_dyc_20 = findViewById(R.id.btn_dyc_20);
        btn_dyc_21 = findViewById(R.id.btn_dyc_21);
        btn_dyc_22 = findViewById(R.id.btn_dyc_22);
        btn_dyc_23 = findViewById(R.id.btn_dyc_23);
        btn_dyc_24 = findViewById(R.id.btn_dyc_24);
        btn_dyc_25 = findViewById(R.id.btn_dyc_25);
        btn_dyc_26 = findViewById(R.id.btn_dyc_26);
        btn_dyc_27 = findViewById(R.id.btn_dyc_27);
        btn_dyc_28 = findViewById(R.id.btn_dyc_28);
        btn_dyc_29 = findViewById(R.id.btn_dyc_29);
        btn_dyc_30 = findViewById(R.id.btn_dyc_30);
        btn_dyc_31 = findViewById(R.id.btn_dyc_31);
        btn_dyc_32 = findViewById(R.id.btn_dyc_32);
        btn_dyc_33 = findViewById(R.id.btn_dyc_33);
        btn_dyc_34 = findViewById(R.id.btn_dyc_34);
        btn_dyc_35 = findViewById(R.id.btn_dyc_35);
        btn_dyc_36 = findViewById(R.id.btn_dyc_36);
        btn_dyc_37 = findViewById(R.id.btn_dyc_37);
        btn_dyc_38 = findViewById(R.id.btn_dyc_38);
        btn_dyc_39 = findViewById(R.id.btn_dyc_39);
        btn_dyc_40 = findViewById(R.id.btn_dyc_40);


        btn_dyc_1.setOnClickListener(this);
        btn_dyc_2.setOnClickListener(this);
        btn_dyc_3.setOnClickListener(this);
        btn_dyc_4.setOnClickListener(this);
        btn_dyc_5.setOnClickListener(this);
        btn_dyc_6.setOnClickListener(this);
        btn_dyc_7.setOnClickListener(this);
        btn_dyc_8.setOnClickListener(this);
        btn_dyc_9.setOnClickListener(this);
        btn_dyc_10.setOnClickListener(this);
        btn_dyc_11.setOnClickListener(this);
        btn_dyc_12.setOnClickListener(this);
        btn_dyc_13.setOnClickListener(this);
        btn_dyc_14.setOnClickListener(this);
        btn_dyc_15.setOnClickListener(this);
        btn_dyc_16.setOnClickListener(this);
        btn_dyc_17.setOnClickListener(this);
        btn_dyc_18.setOnClickListener(this);
        btn_dyc_19.setOnClickListener(this);
        btn_dyc_20.setOnClickListener(this);
        btn_dyc_21.setOnClickListener(this);
        btn_dyc_22.setOnClickListener(this);
        btn_dyc_23.setOnClickListener(this);
        btn_dyc_24.setOnClickListener(this);
        btn_dyc_25.setOnClickListener(this);
        btn_dyc_26.setOnClickListener(this);
        btn_dyc_27.setOnClickListener(this);
        btn_dyc_28.setOnClickListener(this);
        btn_dyc_29.setOnClickListener(this);
        btn_dyc_30.setOnClickListener(this);
        btn_dyc_31.setOnClickListener(this);
        btn_dyc_32.setOnClickListener(this);
        btn_dyc_33.setOnClickListener(this);
        btn_dyc_34.setOnClickListener(this);
        btn_dyc_35.setOnClickListener(this);
        btn_dyc_36.setOnClickListener(this);
        btn_dyc_37.setOnClickListener(this);
        btn_dyc_38.setOnClickListener(this);
        btn_dyc_39.setOnClickListener(this);
        btn_dyc_40.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_dyc_1:
                Intent intent = new Intent(nivelesDYC.this, dycPregunta.class);
                intent.putExtra("id", btn_dyc_1.getText().toString());
                this.startActivity(intent);
                break;
            case R.id.btn_dyc_2:
                Intent intent2 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent2.putExtra("id", btn_dyc_2.getText().toString());
                this.startActivity(intent2);
                break;
            case R.id.btn_dyc_3:
                Intent intent3 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent3.putExtra("id", btn_dyc_3.getText().toString());
                this.startActivity(intent3);
                break;
            case R.id.btn_dyc_4:
                Intent intent4 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent4.putExtra("id", btn_dyc_4.getText().toString());
                this.startActivity(intent4);
                break;
            case R.id.btn_dyc_5:
                Intent intent5 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent5.putExtra("id", btn_dyc_5.getText().toString());
                this.startActivity(intent5);
                break;
            case R.id.btn_dyc_6:
                Intent intent6 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent6.putExtra("id", btn_dyc_6.getText().toString());
                this.startActivity(intent6);
                break;
            case R.id.btn_dyc_7:
                Intent intent7 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent7.putExtra("id", btn_dyc_7.getText().toString());
                this.startActivity(intent7);
                break;
            case R.id.btn_dyc_8:
                Intent intent8 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent8.putExtra("id", btn_dyc_8.getText().toString());
                this.startActivity(intent8);
                break;
            case R.id.btn_dyc_9:
                Intent intent9 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent9.putExtra("id", btn_dyc_9.getText().toString());
                this.startActivity(intent9);
                break;
            case R.id.btn_dyc_10:
                Intent intent10 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent10.putExtra("id", btn_dyc_10.getText().toString());
                this.startActivity(intent10);
                break;
            case R.id.btn_dyc_11:
                Intent intent11 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent11.putExtra("id", btn_dyc_11.getText().toString());
                this.startActivity(intent11);
                break;
            case R.id.btn_dyc_12:
                Intent intent12 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent12.putExtra("id", btn_dyc_12.getText().toString());
                this.startActivity(intent12);
                break;
            case R.id.btn_dyc_13:
                Intent intent13 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent13.putExtra("id", btn_dyc_13.getText().toString());
                this.startActivity(intent13);
                break;
            case R.id.btn_dyc_14:
                Intent intent14 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent14.putExtra("id", btn_dyc_14.getText().toString());
                this.startActivity(intent14);
                break;
            case R.id.btn_dyc_15:
                Intent intent15 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent15.putExtra("id", btn_dyc_15.getText().toString());
                this.startActivity(intent15);
                break;
            case R.id.btn_dyc_16:
                Intent intent16 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent16.putExtra("id", btn_dyc_16.getText().toString());
                this.startActivity(intent16);
                break;
            case R.id.btn_dyc_17:
                Intent intent17 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent17.putExtra("id", btn_dyc_17.getText().toString());
                this.startActivity(intent17);
                break;
            case R.id.btn_dyc_18:
                Intent intent18 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent18.putExtra("id", btn_dyc_18.getText().toString());
                this.startActivity(intent18);
                break;
            case R.id.btn_dyc_19:
                Intent intent19 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent19.putExtra("id", btn_dyc_19.getText().toString());
                this.startActivity(intent19);
                break;
            case R.id.btn_dyc_20:
                Intent intent20 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent20.putExtra("id", btn_dyc_20.getText().toString());
                this.startActivity(intent20);
                break;
            case R.id.btn_dyc_21:
                Intent intent21 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent21.putExtra("id", btn_dyc_21.getText().toString());
                this.startActivity(intent21);
                break;
            case R.id.btn_dyc_22:
                Intent intent22 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent22.putExtra("id", btn_dyc_22.getText().toString());
                this.startActivity(intent22);
                break;
            case R.id.btn_dyc_23:
                Intent intent23 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent23.putExtra("id", btn_dyc_23.getText().toString());
                this.startActivity(intent23);
                break;
            case R.id.btn_dyc_24:
                Intent intent24 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent24.putExtra("id", btn_dyc_24.getText().toString());
                this.startActivity(intent24);
                break;
            case R.id.btn_dyc_25:
                Intent intent25 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent25.putExtra("id", btn_dyc_25.getText().toString());
                this.startActivity(intent25);
                break;
            case R.id.btn_dyc_26:
                Intent intent26 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent26.putExtra("id", btn_dyc_26.getText().toString());
                this.startActivity(intent26);
                break;
            case R.id.btn_dyc_27:
                Intent intent27 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent27.putExtra("id", btn_dyc_27.getText().toString());
                this.startActivity(intent27);
                break;
            case R.id.btn_dyc_28:
                Intent intent28 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent28.putExtra("id", btn_dyc_28.getText().toString());
                this.startActivity(intent28);
                break;
            case R.id.btn_dyc_29:
                Intent intent29 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent29.putExtra("id", btn_dyc_29.getText().toString());
                this.startActivity(intent29);
                break;
            case R.id.btn_dyc_30:
                Intent intent30 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent30.putExtra("id", btn_dyc_30.getText().toString());
                this.startActivity(intent30);
                break;
            case R.id.btn_dyc_31:
                Intent intent31 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent31.putExtra("id", btn_dyc_31.getText().toString());
                this.startActivity(intent31);
                break;
            case R.id.btn_dyc_32:
                Intent intent32 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent32.putExtra("id", btn_dyc_32.getText().toString());
                this.startActivity(intent32);
                break;
            case R.id.btn_dyc_33:
                Intent intent33 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent33.putExtra("id", btn_dyc_33.getText().toString());
                this.startActivity(intent33);
                break;
            case R.id.btn_dyc_34:
                Intent intent34 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent34.putExtra("id", btn_dyc_34.getText().toString());
                this.startActivity(intent34);
                break;
            case R.id.btn_dyc_35:
                Intent intent35 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent35.putExtra("id", btn_dyc_35.getText().toString());
                this.startActivity(intent35);
                break;
            case R.id.btn_dyc_36:
                Intent intent36 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent36.putExtra("id", btn_dyc_36.getText().toString());
                this.startActivity(intent36);
                break;
            case R.id.btn_dyc_37:
                Intent intent37 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent37.putExtra("id", btn_dyc_37.getText().toString());
                this.startActivity(intent37);
                break;
            case R.id.btn_dyc_38:
                Intent intent38 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent38.putExtra("id", btn_dyc_38.getText().toString());
                this.startActivity(intent38);
                break;
            case R.id.btn_dyc_39:
                Intent intent39 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent39.putExtra("id", btn_dyc_39.getText().toString());
                this.startActivity(intent39);
                break;
            case R.id.btn_dyc_40:
                Intent intent40 = new Intent(nivelesDYC.this, dycPregunta.class);
                intent40.putExtra("id", btn_dyc_40.getText().toString());
                this.startActivity(intent40);
                break;


        }
    }
}