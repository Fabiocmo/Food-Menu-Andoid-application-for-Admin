package com.cs442.ppatil5_a6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.LoaderManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Loader;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * An activity representing a list of FoodItems. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link FoodItemDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p/>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link FoodItemListFragment} and the item details
 * (if present) is a {@link FoodItemDetailFragment}.
 * <p/>
 * This activity also implements the required
 * {@link FoodItemListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class FoodItemListActivity extends FragmentActivity
        implements FoodItemListFragment.Callbacks,LoaderManager.LoaderCallbacks<Cursor> {
    private ArrayList<FoodItem> foodItems;
    private FoodItemAdapter aa;

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooditem_list);


        if (findViewById(R.id.fooditem_detail_container) != null
                && getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            mTwoPane = true;

            ((FoodItemListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.fooditem_list))
                    .setActivateOnItemClick(true);

        }

        Button addButton = (Button)findViewById(R.id.add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = createDialog();
                dialog.show();

            }
        });
                foodItems = new ArrayList<FoodItem>();

        // Create the array adapter to bind the array to the ListView
        int resID = R.layout.fooditem_row;
        aa = new FoodItemAdapter(this, resID, foodItems);

        FoodItemListFragment foodItemListFragment =((FoodItemListFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fooditem_list));
        // Bind the array adapter to the ListView.
        foodItemListFragment.setListAdapter(aa);

        getLoaderManager().initLoader(0, null, this);

        Button deleteButton = (Button)findViewById(R.id.delete);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FoodItemListFragment foodItemListFragment =((FoodItemListFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.fooditem_list));
                Toast.makeText(v.getContext(), Long.toString(foodItemListFragment.getListView().getCheckedItemPosition()), Toast.LENGTH_LONG).show();

                deleteMenuItem((int) foodItemListFragment.getListView().getSelectedItemId());

            }
        });
    }


    public Dialog createDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = this.getLayoutInflater();
        final View view=inflater.inflate(R.layout.add_menu, null) ;

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(view)

        // Add action buttons
        .setPositiveButton(R.string.save, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Dialog f = (Dialog) dialog;
                EditText name = (EditText) view.findViewById(R.id.name);
                EditText price = (EditText) view.findViewById(R.id.price);
                String nameStr = name.getText().toString();
                String priceStr = price.getText().toString();

                saveMenuItem(nameStr, priceStr);
            }
        })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        return builder.create();
    }
    /**
     * Callback method from {@link FoodItemListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(String id) {
        /*if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(FoodItemDetailFragment.ARG_ITEM_ID, id);
            FoodItemDetailFragment fragment = new FoodItemDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fooditem_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, FoodItemDetailActivity.class);
            detailIntent.putExtra(FoodItemDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }*/
    }

    public void saveMenuItem(String name,String price){
        ContentResolver cr = getContentResolver();

        ContentValues values = new ContentValues();

        values.put(FoodMenuContentProvider.KEY_NAME,name);
        values.put(FoodMenuContentProvider.KEY_PRICE,price);

        cr.insert(FoodMenuContentProvider.CONTENT_URI, values);
        getLoaderManager().restartLoader(0, null, this);
    }

    public void deleteMenuItem(int id){
        Uri uri = Uri.parse(FoodMenuContentProvider.CONTENT_URI + "/" + id);
        getContentResolver().delete(uri, null, null);
        getLoaderManager().restartLoader(0, null, this);
    }
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        CursorLoader loader = new CursorLoader(this,
                FoodMenuContentProvider.CONTENT_URI, null, null, null, null);

        return loader;
    }

    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        int keyNameIndex = cursor.getColumnIndexOrThrow(FoodMenuContentProvider.KEY_NAME);
        int keyPriceIndex = cursor.getColumnIndexOrThrow(FoodMenuContentProvider.KEY_PRICE);
        int keyIdIndex = cursor.getColumnIndexOrThrow(FoodMenuContentProvider.KEY_ID);

        foodItems.clear();
        while (cursor.moveToNext()) {
            FoodItem foodItem = new FoodItem(cursor.getInt(keyIdIndex),cursor.getString(keyNameIndex),cursor.getDouble(keyPriceIndex));
            foodItems.add(foodItem);
        }
        aa.notifyDataSetChanged();
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }

}
