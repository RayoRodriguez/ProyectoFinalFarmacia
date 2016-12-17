package edu.tecii.android.proyecto_final;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MAPA extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng bena = new LatLng(28.727224, -106.119548);
        mMap.addMarker(new MarkerOptions().position(bena).title("Farmacias benavides"));
        float zoomLevel = 11; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bena, zoomLevel));

        LatLng ahorro = new LatLng(28.640712, -106.100078);
        mMap.addMarker(new MarkerOptions().position(ahorro).title("Farmacias del ahorro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ahorro));

        LatLng econo = new LatLng(28.659202, -106.101555);
        mMap.addMarker(new MarkerOptions().position(econo).title("Farmacias Economik"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(econo));

        LatLng guada = new LatLng(28.646120, -106.061258);
        mMap.addMarker(new MarkerOptions().position(guada).title("Farmacias Guadalajara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(guada));
    }
}
