package com.mobiledream.common;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public abstract class Screen extends Activity {

	protected OnClickListener viewsClickListener_;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		createElements();

		createListeners();
	}

	public abstract void createElements();

	public abstract void onEnter();

	public abstract void onLeave();

	public void createListeners() {
		viewsClickListener_ = new OnClickListener() {
			public void onClick(View v) {
				OnClick(v);
			}
		};

		OnCreatedListeners();
	}

	abstract public void OnCreatedListeners();

	abstract public void OnClick(View v);
}
