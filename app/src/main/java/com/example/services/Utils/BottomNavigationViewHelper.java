package com.example.services.Utils;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.services.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationViewHelper {
    private static final String TAG="BottomNavigationViewHelper";

    public static void setupBottomNavigationView(BottomNavigationView bottomNavigationView)
    {

        bottomNavigationView.getAnimation();

    }

    public static void enableNavigation(final Context context, BottomNavigationView view)
    {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.ic_house:

                        break;
                    case R.id.ic_categories:

                        break;
                    case R.id.ic_circle:

                        break;
                    case R.id.ic_alert:

                        break;
                    case R.id.ic_android:

                        break;

                }


                return false;
            }
        });
    }

}
