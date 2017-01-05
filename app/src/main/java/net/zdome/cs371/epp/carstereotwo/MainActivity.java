package net.zdome.cs371.epp.carstereotwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected TextView radio_display;
    protected int active_preset = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize display
        radio_display = (TextView)findViewById(R.id.channel_display);
        //radio_display.setText("Testing");
        radio_display.setText(getString(R.string.default_banner));

        // Initialize pesets

    }
}
