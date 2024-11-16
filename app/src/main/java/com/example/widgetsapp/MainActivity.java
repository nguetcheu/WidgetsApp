package com.example.widgetsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Déclaration des views
    TextView myTextView1 = findViewById(R.id.myTextView);
    TextView myTextView2 = findViewById(R.id.myTextViewCounter);
    Button myButton = findViewById(R.id.myBtn);

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

        // Création du listener du button
        View.OnClickListener counterListener = new View.OnClickListener() {
            @Override
            public void onClick(View btnView) {
                Button button = (Button) btnView;
                int count = 0;
            }
        };


    }

}