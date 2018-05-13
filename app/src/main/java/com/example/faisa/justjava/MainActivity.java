package com.example.faisa.justjava;





import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
    displayPrice(number * 5);


    }
    public void increment(View view) {
        number++;
        display(number);
    }
    public void decrement(View view) {
    if(number>0){
        number--;
        display(number);
    }else {
        System.out.println("Invalid data");
    }
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Amount Due = "+NumberFormat.getCurrencyInstance().format(number)+" \nThank You :)");
       // priceTextView.setText("$" + number);
    }

}
