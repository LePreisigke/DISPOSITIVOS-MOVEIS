package com.leticia.exercicio16;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class segundaActivity extends AppCompatActivity {

    TextView tvDouble, tvInt, tvFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        double valorDouble = getIntent().getDoubleExtra("Double",0.0);
        int valorInt = getIntent().getIntExtra("Int", 0);
        float valorFloat = getIntent().getFloatExtra("Float", 0.0f);


        tvDouble = findViewById(R.id.tvView1);
        tvInt = findViewById(R.id.tvView2);
        tvFloat = findViewById(R.id.tvView3);

        tvDouble.setText(String.format("Double: %s", valorDouble));
        tvInt.setText(String.format("Int: %s", valorInt));
        tvFloat.setText(String.format("Float: %s", valorInt));


    }
}