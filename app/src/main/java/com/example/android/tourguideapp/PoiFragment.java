package com.example.android.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by an0o0nym on 25/06/17.
 */

public class PoiFragment extends Fragment {
    public PoiFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.old_town), getString(R.string.old_town_desc),
                R.drawable.old_town));
        locations.add(new Location(getString(R.string.castle), getString(R.string.castle_desc),
                R.drawable.castle));
        locations.add(new Location(getString(R.string.palace_wilanow), getString(R.string.palace_wilanow_desc),
                R.drawable.palac_wilanowski));
        locations.add(new Location(getString(R.string.palace_culture), getString(R.string.palace_culture_desc),
                R.drawable.palac_kultury));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
