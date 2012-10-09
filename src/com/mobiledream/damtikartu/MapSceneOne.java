package com.mobiledream.damtikartu;

import com.google.android.maps.MapView;
import android.os.Bundle;

public class MapSceneOne extends MapScene
{
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		MapView mapView = (MapView) findViewById(R.layout.map_scene_one);
	    mapView.setBuiltInZoomControls(true);
	    mapView.setSatellite(true);
	}
}
