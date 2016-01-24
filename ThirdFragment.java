package com.example.proto.multiplefrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.proto.fragmentexample.R;

/**
 * Created by Proto on 1/24/2016.
 */
public class ThirdFragment extends Fragment {

    public ThirdFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_multi_third, container, false);

        Button btn = (Button) rootView.findViewById(R.id.btnMultiThird);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Toast message for the third fragment", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
