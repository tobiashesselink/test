package com.example.act.a448856;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

public class DetailActivity extends AppCompatActivity implements Observer {

    private SeekbarsCompound seekbarsCompound;
    private EditText name, number;
    private Button plus, min;
    private TextView color1, color2, color3;
    private CountryModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        this.model = DataProvider.models.get(index);

        seekbarsCompound = findViewById(R.id.seekbarCompound);
        name = findViewById(R.id.etname);
        number = findViewById(R.id.etNumber);
        plus = findViewById(R.id.buttonPlus);
        min = findViewById(R.id.buttonMin);
        color1 = findViewById(R.id.tvColor1);
        color2 = findViewById(R.id.tvColor2);
        color3 = findViewById(R.id.tvColor3);

        seekbarsCompound.setModel(model);

        name.setText(model.getName());
        number.setText(model.getOrders() + "");
        color1.setBackgroundColor(Color.rgb(model.getColorR1(),model.getColorG1(),model.getColorB1()));
        color2.setBackgroundColor(Color.rgb(model.getColorR2(),model.getColorG2(),model.getColorB2()));
        color3.setBackgroundColor(Color.rgb(model.getColorR3(),model.getColorG3(),model.getColorB3()));

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (model != null) {
            model.addObserver(this);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (model != null) {
            model.deleteObserver(this);
        }
    }

    public void buttonPlusClick(View view) {
        model.incrementNumber();
    }

    public void buttonMinClick(View view) {
        model.decrementNumber();
    }

    @Override
    public void update(Observable o, Object arg) {
        number.setText(model.getOrders() + "");

        color1.setBackgroundColor(Color.rgb(model.getColorR1(),model.getColorG1(),model.getColorB1()));
        color2.setBackgroundColor(Color.rgb(model.getColorR2(),model.getColorG2(),model.getColorB2()));
        color3.setBackgroundColor(Color.rgb(model.getColorR3(),model.getColorG3(),model.getColorB3()));
    }
}
