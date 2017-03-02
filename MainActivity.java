package com.example.aniket.mycurrency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view) {

        EditText dollarField = (EditText) findViewById(R.id.dollarField);



        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());

        Double rupeeAmount = dollarAmount * 66.60;

        Toast.makeText(getApplicationContext(), rupeeAmount.toString() + "Rupees", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
