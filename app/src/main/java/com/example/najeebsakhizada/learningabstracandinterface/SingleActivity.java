package com.example.najeebsakhizada.learningabstracandinterface;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by Najeeb Sakhizada on 2014-07-25.
 */
public abstract class SingleActivity extends Activity{

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        FragmentManager fM = getFragmentManager();

        if (savedInstanceState == null) {
            Fragment fragment = createFragment();
            fM.beginTransaction().add(R.id.container,fragment).commit();

        }

    }

}
