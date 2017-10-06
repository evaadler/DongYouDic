package com.fifi.dongyoudic;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by fifi on 2017/10/5.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int item_color = -1;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the List is the data we want
     * to populate into the lists.
     * @param context
     * @param resource
     */
    public WordAdapter(Context context, ArrayList<Word> resource) {
        super(context, 0,resource);
    }

    public WordAdapter(Context context, ArrayList<Word> resource, int color) {
        super(context, 0,resource);
        item_color = color;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being resued, otherwise inflate the view
        View listItemView = convertView;
        //listItemView.setBackground(new ColorDrawable(item_color));

        if (listItemView == null) {
            // 扩大该视图：表示我们根据此xml资源"list_item"创建一个新的列表项布局
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position
        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
        }else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        // TODO 理解ContextCompat
        int color = ContextCompat.getColor(getContext(), item_color);

        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
