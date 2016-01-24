package com.example.proto.multiplefrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proto.fragmentexample.R;

/**
 * Created by Proto on 1/24/2016.
 */
public class FirstFragment extends Fragment {

    public FirstFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_multi_first, container, false);

        return rootView;
    }
}
