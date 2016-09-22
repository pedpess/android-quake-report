package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mDateInMilliseconds;
    private String mUrl;


    public Earthquake(double mMagnitude, String mLocation, long mDateInMilliseconds, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDateInMilliseconds = mDateInMilliseconds;
        this.mUrl = mUrl;
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

    public String getmUrl() {
        return mUrl;
    }
}
