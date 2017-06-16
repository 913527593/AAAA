package com.groupon.fragment;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;

import com.groupon.activity.MainActivity;

/**
 * Created by Administrator on 2017/6/15.
 */

public class BaseFragment extends Fragment {


    protected void skip(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
    }
}
