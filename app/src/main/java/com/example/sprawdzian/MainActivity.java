package com.example.sprawdzian;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView autor = findViewById(R.id.autor);
        TextView tytul = findViewById(R.id.tytul);
        ArrayList<String> data = new ArrayList<>();

        ListView lista = findViewById(R.id.listView);

        Button dodaj = findViewById(R.id.dodaj);
        dodaj.setOnClickListener((View v) -> {
            CharSequence readyAutor = autor.getText();
            CharSequence readyTytul = tytul.getText();

            data.add(readyAutor + " " + readyTytul);

            ArrayAdapter<String> adapterB = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, data);
            lista.setAdapter(adapterB);

        });

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getBaseContext(), Activity.class);

                intent.putExtra("data", data.get(position));
                startActivity(intent);
            }
        });




    }
}