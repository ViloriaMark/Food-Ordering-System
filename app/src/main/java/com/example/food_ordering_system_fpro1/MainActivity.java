//MainActivity.java
package com.example.food_ordering_system_fpro1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxBurgers;

    private CheckBox checkBoxDonuts;
    private CheckBox checkBoxPizza;
    private CheckBox checkBoxPasta;
    private TextView textTotal;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        checkBoxBurgers = findViewById ( R.id.checkBoxBurgers );
        checkBoxDonuts = findViewById ( R.id.checkBoxDonuts );
        checkBoxPizza = findViewById ( R.id.checkBoxPizza );
        checkBoxPasta = findViewById ( R.id.checkBoxPasta );
        textTotal = findViewById (R.id.textTotal );




    }
    @SuppressLint("DefaultLocale")
    public void calculateTotal(View view) {
        double total = 0;

        //Check if each food item is selected and add its price to the total
        if (checkBoxBurgers.isChecked ( )) {
            total += 5.99;
        }
        if (checkBoxDonuts.isChecked ( )) {
            total += 6.99;
        }
        if (checkBoxPizza.isChecked ( )) {
            total += 8.99;
        }
        if (checkBoxPasta.isChecked ( )) {
            total += 7.99;
        }
        //Display the total
        textTotal.setText ( String.format ( "Total: $%.2f", total ) );
    }
    }




























