package com.example.mypc.layoutmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toLinearLayout1(View view) {
        Intent linearExample1 = new Intent(this, LinearLayout1.class);
        startActivity(linearExample1);
    }

    public void toLinearLayout2(View view) {
        Intent linearExample2 = new Intent(this, LinearLayout2.class);
        startActivity(linearExample2);
    }

    public void toRelativeLayout1(View view) {
        Intent relativeEx1 = new Intent(this, RelativeLayout1.class);
        startActivity(relativeEx1);
    }
    public void toRelativeLayout2(View view) {
        Intent relativeEx2 = new Intent(this, RelativeLayout2.class);
        startActivity(relativeEx2);
    }
    public void toRelativeLayout3(View view) {
        Intent relativeEx3 = new Intent(this, RelativeLayout3.class);
        startActivity(relativeEx3);
    }
}
