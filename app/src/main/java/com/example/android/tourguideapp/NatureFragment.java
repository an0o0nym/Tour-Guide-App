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

public class NatureFragment extends Fragment {
    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.lazienki), getString(R.string.lazienki_desc),
                R.drawable.lazienki));
        locations.add(new Location(getString(R.string.saxon_gardens), getString(R.string.saxon_gardens_desc),
                R.drawable.ogrod_saski));
        locations.add(new Location(getString(R.string.park_ujazdowski), getString(R.string.park_ujazdowski_desc),
                R.drawable.ujazdowski));
        locations.add(new Location(getString(R.string.park_skaryszewski), getString(R.string.park_skaryszewski_desc),
                R.drawable.skaryszewski));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
