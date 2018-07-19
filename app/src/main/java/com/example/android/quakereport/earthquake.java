


package com.example.android.quakereport;

public class earthquake {



    /* Magnitude of the earthquake */

    private String mMagnitude;


    /* Location of the earthquake */
    private String mLocation;


    /* date of the earthquake occured */

    private String mDate;



    /* Construct a new object.
     *
     */


    public earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }


    /* returns the magnitude of the earthquake */

    public String getMagnitude() {
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


}
