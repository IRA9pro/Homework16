package com.example.homework16;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.homework16.databinding.ItemViewfoodBinding;

import java.util.ArrayList;

public class FoodNameAdapter extends RecyclerView.Adapter<FoodNameAdapter.FoodViewHolder1> {

    private ArrayList<ViewFood> viewFoodArraylist;

    public FoodNameAdapter(ArrayList<ViewFood> viewFoodArraylist) {
        this.viewFoodArraylist = viewFoodArraylist;
    }

    @NonNull
    @Override
    public FoodViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemViewfoodBinding binding = ItemViewfoodBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent,
                false);
        return new FoodViewHolder1(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder1 holder, int position) {
        holder.bind(viewFoodArraylist.get(position));
    }

    @Override
    public int getItemCount() {
        return viewFoodArraylist.size();
    }

    public static class FoodViewHolder1 extends RecyclerView.ViewHolder {

        private ItemViewfoodBinding binding;

        public FoodViewHolder1(ItemViewfoodBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(ViewFood viewFood) {
            binding.tvName.setText(viewFood.getFoodName());
            binding.tvImage.setImageResource(viewFood.getFoodImageId());
        }

    }
}
