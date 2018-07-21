
package com.example.android.quakereport;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class earthquakeAdapter extends ArrayAdapter<earthquake> {


    private static final String LOCATION_SEPARATOR = " of ";



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


        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentearthquakeAdapter.getTimeInMilliseconds());



        // find the textview with the id date

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        // Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);


        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);



        /**
         * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
         */


        /**
         * Return the formatted date string (i.e. "4:30 PM") from a Date object.
         */

        String primaryLocation;
        String locationOffset;



        String originalLocation = currentearthquakeAdapter.getmLocation();


        if(originalLocation.contains(LOCATION_SEPARATOR)) {
            String parts[] = originalLocation.split(LOCATION_SEPARATOR); // it will split from here
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        }
        else
        {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }


        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.primary_location);
        primaryLocationView.setText(primaryLocation);

        TextView locationOffsetView = (TextView) listItemView.findViewById(R.id.location_offset);
        locationOffsetView.setText(locationOffset);

        return listItemView;


}

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
}
