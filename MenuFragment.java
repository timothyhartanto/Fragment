package com.example.proto.multiplefrag;

import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.proto.fragmentexample.R;

/**
 * Created by Proto on 1/24/2016.
 */
public class MenuFragment extends Fragment {

    Fragment frag;
    FragmentTransaction fragmentTransaction;

    public MenuFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_menu_fragment ,container, false);

        frag = new SecondFragment();
        fragmentTransaction = getFragmentManager().beginTransaction().add(R.id.container, frag);
        fragmentTransaction.commit();

        Button btnFirst = (Button)view.findViewById(R.id.btnFirst);
        Button btnSecond = (Button)view.findViewById(R.id.btnSecond);
        Button btnThird = (Button)view.findViewById(R.id.btnThird);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new FirstFragment();
                fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragmentTransaction.commit();
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new SecondFragment();
                fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragmentTransaction.commit();
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new ThirdFragment();
                fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
