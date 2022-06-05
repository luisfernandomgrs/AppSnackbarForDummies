package com.luisfernandomgrs.learning.appsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button buttonOpenSnackbar, buttonCloseSnackbar, buttonSnackbarFirst;
    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Using Snackbar");

        buttonOpenSnackbar = this.findViewById(R.id.buttonOpenSnackbar);
        buttonCloseSnackbar = this.findViewById(R.id.buttonCloseSnackbar);
        buttonSnackbarFirst = this.findViewById(R.id.buttonSnackbarFirst);

        buttonOpenSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar = Snackbar.make(view, "The button has pressioned, :)", Snackbar.LENGTH_INDEFINITE).setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //buttonOpenSnackbar.setText("Opened Stackback with Success, :)");
                    }
                });

                snackbar.show();
            }
        });

        buttonCloseSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (snackbar != null)
                    snackbar.dismiss();
            }
        });

        /*
        * Snackbar opened with closing auto, and setting color personalized at button to confirmation.
        */
        buttonSnackbarFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Opened Snack bar with closing auto, :)", Snackbar.LENGTH_LONG).setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // no action
                    }
                }).setActionTextColor(getResources().getColor(R.color.teal_200)).show();
            }
        });
    }
}