package net.zdome.cs371.epp.carstereotwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected TextView radio_display;
    protected int initial_preset = 0;
    protected int active_preset = initial_preset;
    protected String[] preset_banner_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize display
        radio_display = (TextView)findViewById(R.id.channel_display);
        radio_display.setText(getString(R.string.default_banner));

        // Initialize peset banners
        active_preset = initial_preset;
        preset_banner_list = getResources().getStringArray(R.array.preset_banners);
        //radio_display.setText(preset_banner_list[active_preset]);


    }
}
