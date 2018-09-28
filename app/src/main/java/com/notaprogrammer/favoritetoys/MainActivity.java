package com.notaprogrammer.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_toy_names);

        String[] toyNames = ToyBox.getToyNames();

        for (String toyName: toyNames){
            textView.append(toyName + "\n\n\n");
        }

    }
}
