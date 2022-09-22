package myapp.files.day_three.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import myapp.files.day_three.FragmentsJava.ExclusiveOfferFragment;
import myapp.files.day_three.R;
import myapp.files.day_three.databinding.ActivityHomeScreenBinding;

public class HomeScreen extends AppCompatActivity {

    ActivityHomeScreenBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home_screen);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_home_screen);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(binding.frame1.getId(), ExclusiveOfferFragment.newInstance()).commit();

    }


    }
