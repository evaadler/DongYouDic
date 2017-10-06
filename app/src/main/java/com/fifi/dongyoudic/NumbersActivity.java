package com.fifi.dongyoudic;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.mipmap.number_one));
        words.add(new Word("two", "otiiko", R.mipmap.number_two));
        words.add(new Word("three", "tolookosu", R.mipmap.number_three));
        words.add(new Word("four", "oyyisa", R.mipmap.number_four));
        words.add(new Word("five", "massokka", R.mipmap.number_five));
        words.add(new Word("six", "temmokka", R.mipmap.number_six));
        words.add(new Word("seven", "kenekaku", R.mipmap.number_seven));
        words.add(new Word("eight", "kawinta", R.mipmap.number_eight));
        words.add(new Word("nine", "wo’e", R.mipmap.number_nine));
        words.add(new Word("ten", "na’aacha", R.mipmap.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }

}
