package com.example.act.a448856;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class CountryItemAdapter extends ArrayAdapter<CountryModel> implements Observer{

    private List<CountryModel> models;
    private LayoutInflater inflater;
    private CountryModel model;

    public CountryItemAdapter(@NonNull Context context, @NonNull List<CountryModel> objects) {
        super(context, R.layout.layout_flag_item, objects);

        models = objects;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            convertView = inflater.inflate(R.layout.layout_flag_item,parent,false);
        }

        model = models.get(position);

        TextView color1 = convertView.findViewById(R.id.tvColor1);
        TextView color2 = convertView.findViewById(R.id.tvColor2);
        TextView color3 = convertView.findViewById(R.id.tvColor3);
        TextView name = convertView.findViewById(R.id.tvCountryName);
        TextView number = convertView.findViewById(R.id.tvCountryNumber);


        name.setText(model.getName());
        number.setText(model.getOrders() + "");
        color1.setBackgroundColor(Color.rgb(model.getColorR1(),model.getColorG1(), model.getColorB1()));
        color2.setBackgroundColor(Color.rgb(model.getColorR2(),model.getColorG2(), model.getColorB2()));
        color3.setBackgroundColor(Color.rgb(model.getColorR3(),model.getColorG3(), model.getColorB3()));
        return convertView;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
