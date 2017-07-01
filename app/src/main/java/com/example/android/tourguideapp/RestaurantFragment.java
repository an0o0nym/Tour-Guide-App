package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by an0o0nym on 01/07/17.
 */

public class RestaurantFragment extends Fragment {
    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.stary_dom), getString(R.string.stary_dom_desc),
                R.drawable.stary_dom));
        locations.add(new Location(getString(R.string.n31), getString(R.string.n31_desc),
                R.drawable.n31));
        locations.add(new Location(getString(R.string.amber), getString(R.string.amber_desc),
                R.drawable.amber));
        locations.add(new Location(getString(R.string.delicja), getString(R.string.delicja_desc),
                R.drawable.delicja));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
