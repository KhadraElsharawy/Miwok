package com.example.basmet.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by basmet on 3/6/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColor;
    public WordAdapter(@NonNull Activity context, ArrayList<Word> word, int color) {
        super(context,0, word);
        mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word word = getItem(position);
        TextView textView1 = listItemView.findViewById(R.id.text1);
        textView1.setText(word.getDefaultTranslation());
        TextView textView2 = listItemView.findViewById(R.id.text2);
        textView2.setText(word.getMikowTranslation());
        ImageView icon = listItemView.findViewById(R.id.icon);
        if(word.hasImage()) {
            icon.setImageResource(word.getmIcon());
            icon.setVisibility(View.VISIBLE);
        }
        else {
            icon.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
