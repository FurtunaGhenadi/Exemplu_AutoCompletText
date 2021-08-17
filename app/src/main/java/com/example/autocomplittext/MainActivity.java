package com.example.autocomplittext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] Disciplina={"Informatica", "Filosofia", "Matematica", "Fizica", "Chimia", "Biologia", "L. Rom","L. Engl", "L. Fr", "Istoria", "Geografia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, Disciplina );
        AutoCompleteTextView activ;
        activ = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        activ.setThreshold(1);
        activ.setAdapter(adapter);
        activ.setTextColor(Color.RED);
    }
}