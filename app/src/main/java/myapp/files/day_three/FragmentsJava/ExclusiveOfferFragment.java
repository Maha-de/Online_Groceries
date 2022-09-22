package myapp.files.day_three.FragmentsJava;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import myapp.files.day_three.Model.ExclusiveOffer;
import myapp.files.day_three.Model.ExclusiveRecyclerAdapter;
import myapp.files.day_three.R;
import myapp.files.day_three.databinding.ExclusiveOfferFragmentBinding;

public class ExclusiveOfferFragment extends Fragment {

    ExclusiveOfferFragmentBinding binding;
    ArrayList<ExclusiveOffer> offersArrayList;
    private ExclusiveRecyclerAdapter mAdapter;

    public static ExclusiveOfferFragment newInstance() {
        return new ExclusiveOfferFragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("fragment", "onCreateView");
        binding = DataBindingUtil.inflate(inflater, R.layout.exclusive_offer_fragment, container, false);
//        binding.rvExclusiveOffers
        offersArrayList = new ArrayList<>();
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.banana), "Banana", 1800, 20));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.orange), "Orange", 2000, 25));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.straubery), "Strawberry", 1999, 28));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.mango), "Mango", 2500, 29));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.ananas), "Pineapple", 1850, 30));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.peach), "Peach", 1400, 15));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.nb), "Grapes", 1350, 18));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.mshmsh), "Apricot", 1250, 16));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.watermellon), "Watermelon", 1000, 6));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.carrot), "Carrot", 1200, 9));
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("fragment", "onViewCreated");
        populateRecyclerView(offersArrayList);
    }

    private void populateRecyclerView(ArrayList<ExclusiveOffer> offersArrayList) {
        mAdapter = new ExclusiveRecyclerAdapter(getActivity(), offersArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        binding.rvExclusiveOffers.setLayoutManager(mLayoutManager);
        binding.rvExclusiveOffers.setItemAnimator(new DefaultItemAnimator());
        binding.rvExclusiveOffers.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        Log.e("fragment", "populatedList");
        


    }
}
