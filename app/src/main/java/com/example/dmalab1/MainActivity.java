package com.example.dmalab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView diceNumber;
    private Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceNumber = findViewById(R.id.diceNumber);
        rollButton = findViewById(R.id.rollButton);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Generate a random number between 1 and 6
                Random rand = new Random();
                int randomNumber = rand.nextInt(6) + 1;

                // Update the text view with the random number
                diceNumber.setText(Integer.toString(randomNumber));

                // Show a toast message
                Toast.makeText(MainActivity.this, "Dice rolled", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
