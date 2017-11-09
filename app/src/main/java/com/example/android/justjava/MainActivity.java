package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int numbOfCoffeeOrdered = 0;
    double pricePerCoffee = 4.75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage = "Thank You! Your order has been placed." + "\nYou have been charged $"
                + numbOfCoffeeOrdered * pricePerCoffee;
        displayMessage(priceMessage);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        numbOfCoffeeOrdered++;
        display(numbOfCoffeeOrdered);
        displayPrice(numbOfCoffeeOrdered * pricePerCoffee);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        numbOfCoffeeOrdered--;
        display(numbOfCoffeeOrdered);
        displayPrice(numbOfCoffeeOrdered * pricePerCoffee);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(double number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
