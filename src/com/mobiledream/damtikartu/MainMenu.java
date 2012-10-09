package com.mobiledream.damtikartu;

//import com.google.android.maps.MapView;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.mobiledream.damtikartu.Offer;
import com.mobiledream.common.Screen;

public class MainMenu extends Screen {

	@Override
	public void createElements() {
		setContentView(R.layout.mainmenu);
	}

	@Override
	public void onEnter() {
		
	}

	@Override
	public void onLeave() {
		
	}

	public void OnClick(View v) {
		
		Intent intent = new Intent();

		int id = v.getId();

		switch (id) {
		case R.id.offerButton:
			intent.setClass(this, Offer.class );
			break;
		case R.id.needButton:
			intent.setClass(this, Need.class );
			break;
		case R.id.elseButton:
			intent.setClass(this, MainElse.class );
			break;
		}
		
		startActivity(intent);
	}

	@Override
	public void OnCreatedListeners() {
		((Button) findViewById(R.id.offerButton))
				.setOnClickListener(viewsClickListener_);

		((Button) findViewById(R.id.needButton))
				.setOnClickListener(viewsClickListener_);

		((Button) findViewById(R.id.elseButton))
				.setOnClickListener(viewsClickListener_);
	}
}