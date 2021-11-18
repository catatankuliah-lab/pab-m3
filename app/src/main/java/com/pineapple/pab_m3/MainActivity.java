package com.pineapple.pab_m3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView acText;
    AutoCompleteTextView lvText;

    public String[] stringFakultas = {
            "Fakultas Ekonomi",
            "Fakultas Kehutanan",
            "Fakultas Ilmu Komputer",
            "Fakultas Hukum",
            "Fakultas Keguruan dan Ilmu Pendidikan"};

    public String[] stringProdi = {
            "Desain Komunikasi Visual",
            "Manajemen Informatika",
            "Sistem Informasi",
            "Teknik Informatika"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acText = findViewById(R.id.ac_text);
        ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_item, stringFakultas);
        acText.setAdapter(adapter);

        lvText = findViewById(R.id.lv_text);
        ArrayAdapter adapterLV = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_item, stringProdi);
        lvText.setAdapter(adapterLV);
    }
    
}