package com.example.act.a448856;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.SeekBar;

public class SeekbarsCompound extends ConstraintLayout {

    private SeekBar sbR1, sbG1, sbB1, sbR2, sbG2, sbB2, sbR3, sbG3, sbB3;
    private CountryModel model;

    public SeekbarsCompound(Context context) {
        super(context);
        init();
    }

    public SeekbarsCompound(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SeekbarsCompound(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.compound_seekbars, this);

        sbR1 = findViewById(R.id.seekBarR1);
        sbG1 = findViewById(R.id.seekBarG1);
        sbB1 = findViewById(R.id.seekBarB1);
        sbR2 = findViewById(R.id.seekBarR2);
        sbG2 = findViewById(R.id.seekBarG2);
        sbB2 = findViewById(R.id.seekBarB2);
        sbR3 = findViewById(R.id.seekBarR3);
        sbG3 = findViewById(R.id.seekBarG3);
        sbB3 = findViewById(R.id.seekBarB3);

        sbR1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                model.setColorR1(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public SeekBar getSbR1() {
        return sbR1;
    }

    public SeekBar getSbG1() {
        return sbG1;
    }

    public SeekBar getSbB1() {
        return sbB1;
    }

    public SeekBar getSbR2() {
        return sbR2;
    }

    public SeekBar getSbG2() {
        return sbG2;
    }

    public SeekBar getSbB2() {
        return sbB2;
    }

    public SeekBar getSbR3() {
        return sbR3;
    }

    public SeekBar getSbG3() {
        return sbG3;
    }

    public SeekBar getSbB3() {
        return sbB3;
    }

    public void setModel(CountryModel model ) {
        this.model = model;

        sbR1.setProgress(model.getColorR1());
        sbG1.setProgress(model.getColorG1());
        sbB1.setProgress(model.getColorB1());

        sbR2.setProgress(model.getColorR2());
        sbG2.setProgress(model.getColorG2());
        sbB2.setProgress(model.getColorB2());

        sbR3.setProgress(model.getColorR3());
        sbG3.setProgress(model.getColorG3());
        sbB3.setProgress(model.getColorB3());

    }
}
