package com.example.layoutdesign;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import com.example.layoutdesign.databinding.ActivityMainBinding;
import com.example.layoutdesign.databinding.FragmentHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Model model = new Model(getDrawable(R.drawable.a),getDrawable(R.drawable.b),getDrawable(R.drawable.c),getDrawable(R.drawable.d),"GALLERY","IMAGE_ONE","IMAGE_TWO","IMAGE_THREE");
        activityMainBinding.setModel(model);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        NavController navController = Navigation.findNavController(this,R.id.nav_host_fragment);

        NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }
}