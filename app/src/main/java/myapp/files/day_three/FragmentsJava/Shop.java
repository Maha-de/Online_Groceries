package myapp.files.day_three.FragmentsJava;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import myapp.files.day_three.R;
import myapp.files.day_three.databinding.ActivityHomeScreenBinding;
import myapp.files.day_three.databinding.FragmentShopBinding;

public class Shop extends Fragment {

    FragmentShopBinding binding;
    BottomNavigationView bottomNavigationView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_shop, container, false);

        binding= DataBindingUtil.setContentView(getActivity(), R.layout.fragment_shop);

        getParentFragmentManager()
                .beginTransaction()
                .replace(binding.frame1.getId(), ExclusiveOfferFragment.newInstance()).commit();


        return rootView;




    }

    public static Shop newInstance(Context applicationContext) {
        return new Shop();

    }

}
