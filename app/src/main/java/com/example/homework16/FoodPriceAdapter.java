package com.example.homework16;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework16.databinding.ItemViewfoodpriceBinding;

import java.util.ArrayList;

public class FoodPriceAdapter extends RecyclerView.Adapter<FoodPriceAdapter.FoodPriceViewHolder2> {

    private ArrayList<ViewFoodPrice> viewFoodPricesList;

    public FoodPriceAdapter(ArrayList<ViewFoodPrice> viewFoodPricesList) {
        this.viewFoodPricesList = viewFoodPricesList;
    }

    @NonNull
    @Override
    public FoodPriceViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemViewfoodpriceBinding binding =
                ItemViewfoodpriceBinding.inflate(LayoutInflater.from(parent.getContext()),
                        parent, false);
        return new FoodPriceViewHolder2(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodPriceViewHolder2 holder, int position) {
        holder.bind(viewFoodPricesList.get(position));
    }

    @Override
    public int getItemCount() { return viewFoodPricesList.size(); }

    public static class FoodPriceViewHolder2 extends RecyclerView.ViewHolder {

        private ItemViewfoodpriceBinding binding;

        public FoodPriceViewHolder2(ItemViewfoodpriceBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(ViewFoodPrice viewFoodPrice) {
            binding.tvFoodImage.setImageResource(viewFoodPrice.getImageId());
            binding.tvFoodName.setText(viewFoodPrice.getName());
            binding.tvPrice.setText(String.valueOf(viewFoodPrice.getPrice()));
        }
    }
}
