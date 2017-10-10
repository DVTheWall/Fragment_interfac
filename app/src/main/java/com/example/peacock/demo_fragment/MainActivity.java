package com.example.peacock.demo_fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

//Important :- implements interface via Fragment
public class MainActivity extends AppCompatActivity implements Fragment_One.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.ll_fragment_container, new Fragment_One())
                    .commit();
        }

    }

    @Override
    public void onFragmentInteraction(int i) {

 /*
    Toast toast = Toast.makeText(this, "Wheeee!", Toast.LENGTH_SHORT);
        toast.show();
        */

        Toast.makeText(this, "Hello Peacock  " + i, Toast.LENGTH_SHORT).show();


    }
}
