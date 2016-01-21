package com.example.proto.fragment;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //super.onCreateView(inflater, container, savedInstanceState);
        // Inflate the article_view for this fragment
        return inflater.inflate(R.layout.article_view, container, false);
    }

    public void setText(String url) {
        TextView view = (TextView) getView().findViewById(R.id.detailsText);
        view.setText(url);
    }
}
