package myapp.files.day_three.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import myapp.files.day_three.Fragments.ShopFragment;
import myapp.files.day_three.FragmentsJava.Account;
import myapp.files.day_three.FragmentsJava.Cart;
import myapp.files.day_three.FragmentsJava.Explore;
import myapp.files.day_three.FragmentsJava.Favourite;
import myapp.files.day_three.FragmentsJava.Shop;
import myapp.files.day_three.R;

public class BottomNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        //catch interface in my activity
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        // set default selected fragment
        bottomNavigationView.setSelectedItemId(R.id.cart);



    }

    public void fragments(View view) {



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.shop:
                // fragment transaction
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, Shop.newInstance(
                                getApplicationContext()
                        ))
                        .commit();
                return true;

            case R.id.explore:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, Explore.newInstance(
                                getApplicationContext()
                        ))
                        .commit();
                return true;

            case R.id.cart:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, Cart.newInstance(
                                getApplicationContext()
                        ))
                        .commit();
                return true;

            case R.id.favourite:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, Favourite.newInstance(
                                getApplicationContext()
                        ))
                        .commit();
                return true;

            case R.id.account:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, Account.newInstance(
                                getApplicationContext()
                        ))
                        .commit();
                return true;
        }
        return false;
    }
}