package com.example.customcars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{

    private Context context;
    private String[] cNames;
    private int[] cars;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context, String[] cNames, int[] cars) {
        this.context = context;
        this.cNames = cNames;
        this.cars = cars;
    }

    @Override
    public int getCount() { return cNames.length; }

    @Override
    public Object getItem(int position) { return null; }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            layoutInflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.sample_view, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.imageViewId1);
        TextView text = convertView.findViewById(R.id.textViewID);

        imageView.setImageResource(cars[position]);
        text.setText(cNames[position]);

        return convertView;
    }


}
