
package com.example.android.quakereport;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class earthquakeAdapter extends ArrayAdapter<earthquake> {


    public earthquakeAdapter(@NonNull EarthquakeActivity context, List<earthquake> earthquakes) {
        super(context, 0,earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list, parent, false);


    }

        // find the earthquake at the given position in the list of earthquakes
    earthquake currentearthquakeAdapter = getItem(position);

        //find the textview with id magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // display the magnitude of the current earthquake in that textview
        magnitudeView.setText(currentearthquakeAdapter.getMagnitude());

        // find the textview with the id location
        TextView locationView  = (TextView) listItemView.findViewById(R.id.location);
        // display the magnitude of the current earthquake in that textview
        locationView.setText(currentearthquakeAdapter.getmLocation());

        // find the textview with the id date

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // display the magnitude of the current earthquake in that textview

        dateView.setText(currentearthquakeAdapter.getmDate());

        return listItemView;


}}
