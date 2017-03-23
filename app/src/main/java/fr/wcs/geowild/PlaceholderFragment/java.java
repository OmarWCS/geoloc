/*package fr.wcs.geowild.PlaceholderFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;

import fr.wcs.geowild.R;

public final static class PlaceholderFragment
        extends Fragment
        implements OnMapReadyCallback
{

    public PlaceholderFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final View rootView = inflater.inflate(R.layout.activity_maps, container, false);
        final MapFragment mapFragment = (MapFragment) getActivity().getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap)
    {
    }
}
*/