package com.mobiledream.damtikartu;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import java.util.Date;
import java.text.DateFormat;

import com.mobiledream.common.Screen;

public class Offer extends Screen {
	
	private View dateTextView_;

	@Override
	public void createElements() {
		setContentView(R.layout.offer);

		dateTextView_ = findViewById(R.id.dateText);
		Date date = new Date();
		String dateString = DateFormat.getDateInstance().format(date);

		((EditText) dateTextView_).setText(dateString);
	}

	@Override
	public void onEnter() {
	}

	@Override
	public void onLeave() {
	}

	@Override
	public void OnCreatedListeners() {

		OnClickListener dateTextListener = new OnClickListener() {

			public void onClick(View v) {
				DatePickerFragment datePickerFragment = new DatePickerFragment();
				datePickerFragment.showDatePickerDialog(dateTextView_);
			}
		};

		((EditText) dateTextView_).setOnClickListener(dateTextListener);
	}

	@Override
	public void OnClick(View v) {
		int id = v.getId();

		switch (id) {
		case R.id.dateText:

			break;
		}
	}

}
