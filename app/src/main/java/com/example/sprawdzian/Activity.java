package com.example.sprawdzian;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);


        Bundle Data = getIntent().getBundleExtra("data");

        TextView ksiazka = findViewById(R.id.ksiazka);
        ImageView image = findViewById(R.id.imageView);

        int[] photo = {R.drawable.z1, R.drawable.z2, R.drawable.z3, R.drawable.z4, R.drawable.z5, R.drawable.z6, R.drawable.z7};
        Random random = new Random();
        int randomInt = random.nextInt();


        if(Data != null) {
            ksiazka.setText(Data.getString("data"));
            image.setImageResource(photo[randomInt]);
        }
    }

}
