package myapp.files.day_three.Model;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import myapp.files.day_three.R;
import myapp.files.day_three.databinding.ExclusiveListItemBinding;

public class ExclusiveRecyclerAdapter extends RecyclerView.Adapter<ExclusiveRecyclerAdapter.ViewHolder> {

    private final Context mContext;
    private final ArrayList<ExclusiveOffer> offersList;
    ExclusiveListItemBinding binding;

    public ExclusiveRecyclerAdapter(Context context, ArrayList<ExclusiveOffer> list) {
        this.mContext=context;
        this.offersList=list;
    }

    @NonNull
    @Override
    public ExclusiveRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e("Adapter","onCreateViewHolder Adapter");
        binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.exclusive_list_item, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ExclusiveRecyclerAdapter.ViewHolder holder, int position) {
        Log.e("Adapter","onBindViewHolder Adapter");
        ExclusiveOffer offer= offersList.get(position);
        if (offer!=null){
            if (offer.getImage()!=null){
                Glide
                        .with(mContext)
                        .load(offer.getImage())
                        .centerCrop()
                        .into(binding.fruitImage);
            }
            binding.tvTitle.setText(offer.getTitle());
            binding.tvCurrency.setText("£"+String.valueOf(offer.getWeight()));
            binding.tvPrice.setText(String.valueOf(offer.getPrice())+" g");
        }
    }

    @Override
    public int getItemCount() {
        return offersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ExclusiveListItemBinding itemRowBinding;

        public ViewHolder(ExclusiveListItemBinding itemRowBinding) {
            super(itemRowBinding.getRoot());
            this.itemRowBinding = itemRowBinding;
        }
    }
}
