package myapp.files.day_three.FragmentsJava;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuView;
import androidx.fragment.app.Fragment;

import myapp.files.day_three.R;
import myapp.files.day_three.databinding.FragmentCartBinding;
import myapp.files.day_three.databinding.FragmentShopBinding;

public class Cart extends Fragment {

    FragmentCartBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_cart, container, false);



        return rootView;
    }

    public static Cart newInstance(Context applicationContext) {
        return new Cart();
    }


}
