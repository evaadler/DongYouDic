package com.fifi.dongyoudic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "lutti", R.mipmap.family_father));
        words.add(new Word("mother", "otiiko", R.mipmap.family_mother));
        words.add(new Word("son", "tolookosu", R.mipmap.family_son));
        words.add(new Word("daughter", "oyyisa", R.mipmap.family_daughter));
        words.add(new Word("older brother", "massokka", R.mipmap.family_older_brother));
        words.add(new Word("younger brother", "kenekaku", R.mipmap.family_younger_brother));
        words.add(new Word("older sister", "kawinta", R.mipmap.family_older_sister));
        words.add(new Word("younger sister", "wo’e", R.mipmap.family_younger_sister));
        words.add(new Word("grandmother", "ama", R.mipmap.family_grandmother));
        words.add(new Word("grandfather", "aba", R.mipmap.family_grandfather));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }

}
