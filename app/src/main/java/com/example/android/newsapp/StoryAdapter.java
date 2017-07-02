package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class StoryAdapter extends ArrayAdapter<Story> {


    public StoryAdapter(Context context, List<Story> stories) {
        super(context, 0, stories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.story_list_item, parent, false);
        }

        Story currentStory = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.story_title);
        titleView.setText(currentStory.getTitle());

        TextView sectionView = (TextView) listItemView.findViewById(R.id.section_name);
        sectionView.setText(currentStory.getSection());

        return listItemView;
    }

}
