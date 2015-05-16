package com.example.twitters.view;

import com.example.twitters.R;
import com.example.twitters.model.*;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Adapter extends ArrayAdapter<User>{
	protected Model model;

	public Adapter(Context context, Model model) {
		super(context, 0, model.getList());
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) parent.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		if (convertView == null) {
			convertView = inflater.inflate(R.layout.user, parent, false);
		}

		final User user = getItem(position);

		TextView name = (TextView) convertView.findViewById(R.id.name);
		TextView screenName = (TextView) convertView
				.findViewById(R.id.screenName);
		name.setText(user.getName());
		screenName.setText(user.getId_str());

		return convertView;
	}
}
