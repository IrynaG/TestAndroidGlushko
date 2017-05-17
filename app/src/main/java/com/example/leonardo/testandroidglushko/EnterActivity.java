package com.example.leonardo.testandroidglushko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EnterActivity extends AppCompatActivity {

    public static final String MASS = "mass";
    Button entrance;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter);

        entrance = (Button) findViewById(R.id.entr);
        textView = (TextView)findViewById(R.id.textView);

        Intent intent = getIntent();
        String mass = intent.getStringExtra(MASS);
        textView.setText(mass);

    }

    public void clickEntrance(View view) {
        Intent intent1 = new Intent(this, StartActivity.class);
        startActivity(intent1);
    }
}
