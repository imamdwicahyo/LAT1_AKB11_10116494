package com.example.idc.lat1_akb11_10116494;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sayhai extends AppCompatActivity {

    TextView txt_result;
    Button btn_oke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhai);

        txt_result = findViewById(R.id.txt_result);

        Intent intent = getIntent();
        String nama = intent.getStringExtra(Biodata.EXTRA_MESSAGE);

        txt_result.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");

        btn_oke = findViewById(R.id.btn_oke);
        btn_oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                moveTaskToBack(true);
            }
        });

    }
}
