package com.cs442.ppatil5_a6;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;


/**
 * A fragment representing a single FoodItem detail screen.
 * This fragment is either contained in a {@link FoodItemListActivity}
 * in two-pane mode (on tablets) or a {@link FoodItemDetailActivity}
 * on handsets.
 */
public class FoodItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The Food Item this fragment is presenting.
     */
    private FoodItem foodItem;



    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public FoodItemDetailFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            foodItem = FoodItemContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fooditem_detail, container, false);

        // Show the item detail as texts in a TextViews.
        if (foodItem != null) {
            ((TextView) rootView.findViewById(R.id.fooditem_id)).setText(Integer.toString(foodItem.getId()));
            ((TextView) rootView.findViewById(R.id.fooditem_name)).setText(foodItem.getName());
            ((TextView) rootView.findViewById(R.id.fooditem_price)).setText("$"+Double.toString(foodItem.getPrice()));
            ((TextView) rootView.findViewById(R.id.fooditem_shortDesc)).setText(foodItem.getShortDesc().trim());
            ((TextView) rootView.findViewById(R.id.fooditem_ingredients)).setText((foodItem.getIngredients().trim()));
            ((TextView) rootView.findViewById(R.id.fooditem_cookingMethod)).setText(foodItem.getCookingStyle());

            Resources res = getResources();
            int foodImageId = res.getIdentifier("m"+foodItem.getId(), "drawable", getActivity().getPackageName());
            ((ImageView) rootView.findViewById(R.id.fooditem_img)).setImageResource(foodImageId);
        }
        return rootView;
    }
}
