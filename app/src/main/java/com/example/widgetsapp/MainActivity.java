package com.example.widgetsapp;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Déclaration des views
        TextView titleTextView = findViewById(R.id.myTextView);
        TextView counterTextView = findViewById(R.id.myTextViewCounter);
        Button incrementButton = findViewById(R.id.myBtn);

        // Création du listener du button
        View.OnClickListener counterListener = new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View btnView) {
                Button button = (Button) btnView;
                count++;
                counterTextView.setText(countClick(count));
                Log.d(TAG, "onClick: "+count);
            }
        };

        incrementButton.setOnClickListener(counterListener);


    }

    // function de convertion de valeur numérique en string
    String countClick(int value){
        return String.valueOf(value);
    }

}