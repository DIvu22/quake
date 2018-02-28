package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Divya Gupta on 28-02-2018.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes)

    {
        super(context, 0, earthquakes);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magView = (TextView) listItemView.findViewById(R.id.magnitude);
        magView.setText(currentEarthquake.getMagnitude());

        TextView locView = (TextView) listItemView.findViewById(R.id.location);
        locView.setText(currentEarthquake.getLocation());

        Date dateobject = new Date(currentEarthquake.getDate());

        TextView datView = (TextView) listItemView.findViewById(R.id.date);
        String formatdate = formatDate(dateobject);
        datView.setText(formatdate);

        TextView txtView = (TextView) listItemView.findViewById(R.id.time);
        String formattime = formatTime(dateobject);
        txtView.setText(formattime);

        return listItemView;

    }


    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }


    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}