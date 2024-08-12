package com.example.aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int totalCost = getIntent().getIntExtra("TOTAL_COST", 0);

        // Retrieve the list of selected item details from the intent extras
        ArrayList<String> selectedItems = getIntent().getStringArrayListExtra("SELECTED_ITEMS");

        // Display the total cost in a TextView
        TextView totalCostTextView = findViewById(R.id.totalCostTextView);
        totalCostTextView.setText("Total Cost: Rp" + totalCost);

        // Display the selected item details in a TextView
        TextView itemDetailsTextView = findViewById(R.id.itemDetailsTextView);

        if (selectedItems != null && !selectedItems.isEmpty()) {
            StringBuilder itemDetails = new StringBuilder("Item Details:\n");
            for (String item : selectedItems) {
                itemDetails.append(item).append("\n");
            }
            itemDetailsTextView.setText(itemDetails.toString());
        } else {
            itemDetailsTextView.setText("No items selected.");
        }
    }
}
