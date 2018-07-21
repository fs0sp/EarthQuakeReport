


package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class earthquake {



    /** Magnitude of the earthquake */
    private double mMagnitude;


    /* Location of the earthquake */
    private String mLocation;


    /* date of the earthquake occured */

    private String mDate;


    /*  time of the earthquake */

    private Long mTimeInMilliseconds;

    /* Construct a new object.
     *
     */


    public earthquake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }


    /* returns the magnitude of the earthquake */

    public double getMagnitude() {
        return mMagnitude;
    }

    /* returns the location of the earthquake */


    public String getmLocation() {
        return mLocation;
    }

    /* returns the date of the earthquake */


    public String getmDate() {
        return mDate;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }


}
