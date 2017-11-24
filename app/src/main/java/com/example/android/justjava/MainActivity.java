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

    Pricing totalPrice = new Pricing(numbOfCoffeeOrdered);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayMessage();
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        totalPrice.setNumberOfCoffeeOrdered(++numbOfCoffeeOrdered);
        totalPrice.setTotalPrice(numbOfCoffeeOrdered);
        displayQuantity();
        displayPrice();
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        totalPrice.setNumberOfCoffeeOrdered(--numbOfCoffeeOrdered);
        totalPrice.setTotalPrice(numbOfCoffeeOrdered);
        displayQuantity();
        displayPrice();
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity() {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + totalPrice.getNumberOfCoffeeOrdered());
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice() {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(NumberFormat.getCurrencyInstance().format(totalPrice.getTotalPrice()));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage() {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(totalPrice.getOrderSummary());
    }
}
