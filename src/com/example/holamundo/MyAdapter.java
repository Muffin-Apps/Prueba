package com.example.holamundo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
	private String data[];
	
	public MyAdapter(Context context, String[] objects) {
		super(context, R.layout.list_item, objects);
		
		data=objects;
	}

	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		
		LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.list_item, parent, false);

		
		((TextView) view.findViewById(R.id.textView1)).setText(data[position]);
		
		return view;
	}
	
}
