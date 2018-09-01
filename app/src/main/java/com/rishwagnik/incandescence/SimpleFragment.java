package com.rishwagnik.incandescence;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hp on 27-08-2018.
 */

public class SimpleFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment_layout,container,false);
        TextView textView=(TextView)rootView.findViewById(R.id.textv);
        textView.setText("Screen 1");
        return rootView;
    }

}
