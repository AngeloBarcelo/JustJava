package com.example.android.justjava;

import java.io.PrintStream;

/**
 * Created by vergi on 11/22/2017.
 */

public class Pricing {
    int numberOfCoffeeOrdered;
    double pricePerCoffee = 4.75;
    double totalPrice;

    void setNumberOfCoffeeOrdered(int numberOfCoffeeOrdered) {
        this.numberOfCoffeeOrdered = numberOfCoffeeOrdered;
    }

    public int getNumberOfCoffeeOrdered() {
        return numberOfCoffeeOrdered;
    }

    public double getPricePerCoffee() {
        return pricePerCoffee;
    }

    public void setPricePerCoffee(double pricePerCoffee) {
        this.pricePerCoffee = pricePerCoffee;
    }

    void setTotalPrice(int numberOfCoffeeOrdered) {
        totalPrice = pricePerCoffee * numberOfCoffeeOrdered;

        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    Pricing(int numberOfCoffeeOrdered) {
        this.numberOfCoffeeOrdered = numberOfCoffeeOrdered;
    }

    public String getOrderSummary() {
        String name = null;
        String endMessage = "\nThank you!";
        String orderSummary = "Name: " + name + "\nQuantity: " + numberOfCoffeeOrdered +
                "\nTotal: $" + totalPrice + endMessage;
        return orderSummary;
    }
}
