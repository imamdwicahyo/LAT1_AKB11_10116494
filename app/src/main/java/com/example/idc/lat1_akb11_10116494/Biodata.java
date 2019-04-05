package com.example.idc.lat1_akb11_10116494;

//NIM     : 10116494
//Nama    : Imam Dwi Cahyo
//Kelas   : IF-11 / AKB-11

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {

    Button btn_lanjut;
    EditText inp_nama;
    EditText inp_umur;

//    private String EXTRA_MESSAGE = "Kamu";
    public static final String EXTRA_MESSAGE = "kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        inp_nama    = findViewById(R.id.inp_nama);
        inp_umur    = findViewById(R.id.inp_umur);
        btn_lanjut  = findViewById(R.id.btn_lanjut);

        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = inp_nama.getText().toString();
                String umur = inp_umur.getText().toString();

                if (TextUtils.isEmpty(nama)){
                    inp_nama.setError("isi nama dahulu");
                }else if (TextUtils.isEmpty(umur)){
                    inp_umur.setError("isi umur dahulu");
                }else{
                    Intent intent = new Intent(Biodata.this, Sayhai.class);
                    intent.putExtra(EXTRA_MESSAGE, nama);
                    startActivity(intent);
                }

            }
        });
    }
}
