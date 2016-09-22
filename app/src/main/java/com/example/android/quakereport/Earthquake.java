package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mDateInMilliseconds;


    public Earthquake(double mMagnitude, String mLocation, long mDateInMilliseconds) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDateInMilliseconds = mDateInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDate() {
        return mDateInMilliseconds;
    }
}
