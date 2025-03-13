package com.example.archion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sklep_lokace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_louka_lokace);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton batoh_tlacitko = findViewById(R.id.batoh_tlacitko);

        batoh_tlacitko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(CurrentActivity.this, InventoryActivity.class);
//                intent.putExtra("previous_activity", CurrentActivity.class.getSimpleName());  // Pass activity name
//                startActivity(intent);
                Intent intent = new Intent(Sklep_lokace.this, Inventar.class);
                startActivity(intent);
            }
        });



    }
}