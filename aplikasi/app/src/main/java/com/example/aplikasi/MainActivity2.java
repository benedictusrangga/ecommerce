package com.example.aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private int totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final CheckBox jordan10 = findViewById(R.id.jordan1);
        final CheckBox jordan20 = findViewById(R.id.jordan2);
        final CheckBox jordan30 = findViewById(R.id.jordan3);
        final CheckBox jordan40 = findViewById(R.id.jordan4);

        Button btn = findViewById(R.id.buy);

        final int jordan1cost = 7000000;
        final int jordan2cost = 7000000;
        final int jordan3cost = 7000000;
        final int jordan4cost = 7000000;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalPrice = 0;
                ArrayList<String> selectedItems = new ArrayList<>();
                if (jordan10.isChecked()) {
                    totalPrice += jordan1cost;
                    selectedItems.add("jordan1 x1");
                }

                if (jordan20.isChecked()) {
                    totalPrice += jordan2cost;
                    selectedItems.add("jordan2 x1");
                }

                if (jordan30.isChecked()) {
                    totalPrice += jordan3cost;
                    selectedItems.add("jordan3 x1");
                }

                if (jordan40.isChecked()) {
                    totalPrice += jordan4cost;
                    selectedItems.add("jordan4 x1");
                }

                // Create the intent and pass data to the next activity
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("TOTAL_COST", totalPrice);
                intent.putStringArrayListExtra("SELECTED_ITEMS", selectedItems);
                startActivity(intent);
            }
        });
    }
}
