package com.mobiledream.damtikartu;

import android.os.Bundle;

import com.google.android.maps.MapActivity;

public abstract class MapScene extends MapActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map_scene_one);
	}
	
	@Override
	protected boolean isRouteDisplayed()
	{
		return false;
	}
}
