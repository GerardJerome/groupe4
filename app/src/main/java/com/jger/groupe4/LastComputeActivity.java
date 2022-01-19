package com.jger.groupe4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LastComputeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_compute);
        Button boutonPrecedent = findViewById(R.id.bouton_precedent);
        boutonPrecedent.setOnClickListener(view -> retourneAuPrecedent());
    }

    private void retourneAuPrecedent() {
        finish();
    }
}