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

public class HistoricalFragment extends Fragment {
    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.uprising_museum), getString(R.string.uprising_museum_desc),
                R.drawable.uprising));
        locations.add(new Location(getString(R.string.royal_castle), getString(R.string.royal_castle_desc),
                R.drawable.royal_castle));
        locations.add(new Location(getString(R.string.palace_lazienki), getString(R.string.palace_lazienki_desc),
                R.drawable.palac_lazienki));
        locations.add(new Location(getString(R.string.krakowskie), getString(R.string.krakowskie_desc),
                R.drawable.krakowskie));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
