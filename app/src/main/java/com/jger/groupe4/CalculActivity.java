package com.jger.groupe4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class CalculActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar,menu);

        MenuItem itemVider = menu.findItem(R.id.bouton_vider);
        itemVider.setOnMenuItemClickListener(menuItem -> videTextViewCalcul());
        return super.onCreateOptionsMenu(menu);
    }

    private boolean videTextViewCalcul() {
        TextView textViewCalcul = findViewById(R.id.textview_calcul);
        textViewCalcul.setText("");
        return true;
    }
}