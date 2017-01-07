package net.zdome.cs371.epp.carstereotwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    protected boolean displayOn = false;
    protected TextView radio_display;
    protected SeekBar volumeBar;
    protected int initial_preset = 1;
    protected int active_preset = initial_preset;
    protected String[] preset_banner_list;

    //------ updateDisplay
    // Helper method updates display to any changes.
    private void updateDisplay () {
        radio_display.setText(preset_banner_list[active_preset-1]);
        if (displayOn) {
            radio_display.setTextColor(Color.GREEN);
        } else {
            radio_display.setTextColor(Color.BLACK);
        }
    }

    //------ onCreate
    // Initialize the radio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize peset banners
        active_preset = initial_preset;
        preset_banner_list = getResources().getStringArray(R.array.preset_banners);


        // Initialize display
        radio_display = (TextView) findViewById(R.id.channel_display);
        updateDisplay ();
        //radio_display.setText(preset_banner_list[active_preset]);

        volumeBar = (SeekBar) findViewById(R.id.volumeBar);

        // anonymous class test
        /*
        volumeBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean b){
                radio_display.setText("Anonymous SeekBar changed");
            }

            public void onStartTrackingTouch(SeekBar seekBar){}
            public void onStopTrackingTouch(SeekBar seekBar){}
        });
        */
    }

    //------ togglePower
    // Toggle to power off or on and update the display
    //------
    public void togglePower(View view) {
        displayOn = !displayOn;
        updateDisplay();
    }

    //------ selectPresets
    // Change the station based on the preset button pressed
    public void selectPreset1 (View view) {
        active_preset = 1;
        updateDisplay();
    }

    public void selectPreset2 (View view) {
        active_preset = 2;
        updateDisplay();
    }

    public void selectPreset3 (View view) {
        active_preset = 3;
        updateDisplay();
    }

    public void selectPreset4 (View view) {
        active_preset = 4;
        updateDisplay();
    }

    public void selectPreset5 (View view) {
        active_preset = 5;
        updateDisplay();
    }

    public void selectPreset6 (View view) {
        active_preset = 6;
        updateDisplay();
    }

    //------
    public void onProgressChanged (SeekBar s, int i, boolean b) {
        radio_display.setText("Method SeekBar Changed");
    }
}

