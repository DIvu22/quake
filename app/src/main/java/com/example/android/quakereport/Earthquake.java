package com.example.android.quakereport;

/**
 * Created by Divya Gupta on 28-02-2018.
 */

public class Earthquake {
    private String mag;
    private String loc;
    private long dat;

    public  Earthquake(String m_mag,String m_loc,long m_dat)
    {
        mag=m_mag;
        loc=m_loc;
        dat=m_dat;
    }
  public  String getMagnitude()
    {
        return mag;
    }

    public  String getLocation()
    {
        return  loc;
    }

    public  long getDate()
    {
        return  dat;
    }
}
