package com.example.proto.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

/**
 * Created by Proto on 1/21/2016.
 */
public class ListFragment extends Fragment {
    private OnItemSelectedListener listener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        Button btn = (Button)view.findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                updateDetail("fake");
            }
        });

        return view;
    }

    public interface OnItemSelectedListener{
        public void onRssItemSelected(String link);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnItemSelectedListener){
            listener = (OnItemSelectedListener)context;
        }
        else{
            throw new ClassCastException(context.toString() +
            " must implement MyListFragment.OnItemSelectedListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    // may be triggered from the Activity as well
    public void updateDetail(String url){
        // create a string for testing purposes
        String newTime = String.valueOf(System.currentTimeMillis());

        // inform the activity about the changed based interface definition
        listener.onRssItemSelected(newTime);
    }
}
