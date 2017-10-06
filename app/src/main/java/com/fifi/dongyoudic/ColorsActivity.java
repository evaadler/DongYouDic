package com.fifi.dongyoudic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "lutti", R.mipmap.color_red));
        words.add(new Word("mustard yellow", "otiiko", R.mipmap.color_mustard_yellow));
        words.add(new Word("dusty yellow", "tolookosu", R.mipmap.color_dusty_yellow));
        words.add(new Word("green", "oyyisa", R.mipmap.color_green));
        words.add(new Word("brown", "massokka", R.mipmap.color_brown));
        words.add(new Word("gray", "kenekaku", R.mipmap.color_gray));
        words.add(new Word("black", "kawinta", R.mipmap.color_black));
        words.add(new Word("white", "wo’e", R.mipmap.color_white));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }

}
