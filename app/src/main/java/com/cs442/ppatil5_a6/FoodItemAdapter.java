package com.cs442.ppatil5_a6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Priyanka on 9/26/2015.
 */
public class FoodItemAdapter extends ArrayAdapter<FoodItem> {
    public FoodItemAdapter(Context context, List<FoodItem> foodItems) {
        super(context, 0, foodItems);
    }

    public FoodItemAdapter(Context context, int resId,List<FoodItem> foodItems) {
        super(context, resId, foodItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FoodItem foodItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fooditem_row, parent, false);
        }
        // Lookup view for data population
        TextView id = (TextView) convertView.findViewById(R.id.textView1);
        TextView name = (TextView) convertView.findViewById(R.id.textView2);
        TextView price = (TextView) convertView.findViewById(R.id.textView3);
        // Populate the data into the template view using the data object
        id.setText(Integer.toString(foodItem.getId()));
        name.setText(foodItem.getName());
        price.setText("$"+foodItem.getPrice());

        // Return the completed view to render on screen
        return convertView;
    }
}
