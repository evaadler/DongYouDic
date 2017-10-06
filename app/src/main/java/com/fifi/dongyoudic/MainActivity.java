package com.fifi.dongyoudic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find a view that shows the number category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView families = (TextView) findViewById(R.id.family);
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        colors.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        families.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked
            @Override
            public void onClick(View view) {
                Intent familiesIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familiesIntent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

    public void openNumbersList(View view) {
        Intent numberIntent = new Intent(this, NumbersActivity.class);
        startActivity(numberIntent);
    }
}
