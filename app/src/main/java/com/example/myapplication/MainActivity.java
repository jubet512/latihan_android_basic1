package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    String var_nama, var_alamat, var_kelas, var_hobi;

    EditText  nama, alamat;
    RadioGroup kelas, hobi;
    RadioButton radioTi, radioAb, radioIk;
    CheckBox cekboxMusik, cekboxOlahraga, cekboxMembaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.etNama);
        alamat = (EditText) findViewById(R.id.etAlamat);
        kelas = (RadioGroup) findViewById(R.id.rgKelas);
        hobi = (RadioGroup) findViewById(R.id.rgHobi);
        radioTi = (RadioButton) findViewById(R.id.rbTi);
        radioAb = (RadioButton) findViewById(R.id.rbBisnis);
        radioIk = (RadioButton) findViewById(R.id.rbKom);
        cekboxMusik = (CheckBox) findViewById(R.id.cbMusik);
        cekboxOlahraga = (CheckBox) findViewById(R.id.cbOlahraga);
        cekboxMembaca = (CheckBox) findViewById(R.id.cbMembaca);

        Button reset = (Button) findViewById(R.id.btnReset);
        reset.setOnClickListener(new OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         nama.setText("");
                                         alamat.setText("");
                                         kelas.getCheckedRadioButtonId();
                                         hobi.getCheckedRadioButtonId();
                                         radioTi.setChecked(false);
                                         radioAb.setChecked(false);
                                         radioIk.setChecked(false);
                                         cekboxMembaca.setChecked(false);
                                         cekboxMusik.setChecked(false);
                                         cekboxOlahraga.setChecked(false);




                                     }
                                 }

        );

        Button submit = (Button) findViewById(R.id.btnsimpan);
        submit.setOnClickListener(new OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                      }
                                  }


        );

    }
}
