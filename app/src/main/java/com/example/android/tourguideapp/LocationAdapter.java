package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by an0o0nym on 25/06/17.
 */

public class LocationAdapter extends ArrayAdapter<Location>{

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        Location currentLocation = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.location_title);
        titleTextView.setText(currentLocation.getLocTitle());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.location_description);
        descTextView.setText(currentLocation.getDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.location_img);
        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImgResource());
            imageView.setVisibility(View.VISIBLE);
        } else {
            // TODO: set default image if no picture was provided
            imageView.setVisibility(View.GONE);
        }

        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.location_rating);
        ratingBar.setRating(currentLocation.getRating());

        return listItemView;
    }
}
