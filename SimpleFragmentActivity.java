package com.example.proto.simplefrag;

import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.proto.fragmentexample.R;

public class SimpleFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_fragment);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
        }

    }

    public static class PlaceholderFragment extends Fragment{
        public PlaceholderFragment(){

        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            //return super.onCreateView(inflater, container, savedInstanceState);
            View rootView = inflater.inflate(R.layout.activity_simple_fragment, container, false);

            Button btnClickMePlease = (Button) rootView.findViewById(R.id.btnsimpleFragPlease);
            btnClickMePlease.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "You clicked me and pleased me", Toast.LENGTH_SHORT).show();
                }
            });

            return rootView;
        }
    }

}
