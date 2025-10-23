package com.example.homework16;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.homework16.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ViewFood viewFood1 = new ViewFood("Burger", R.drawable.miniburger_figma);
        ViewFood viewFood2 = new ViewFood("Pizza", R.drawable.minipizza_figma);
        ViewFood viewFood3 = new ViewFood("Chicken", R.drawable.minichicken_figma);

        ArrayList<ViewFood> viewFoodArrayList = new ArrayList<>();

        viewFoodArrayList.add(viewFood1);
        viewFoodArrayList.add(viewFood2);
        viewFoodArrayList.add(viewFood3);

        FoodNameAdapter adapter1 = new FoodNameAdapter(viewFoodArrayList);

        binding.rvFoodlist1.setAdapter(adapter1);
        binding.rvFoodlist1.setLayoutManager(
                new LinearLayoutManager(MenuActivity.this,
                        LinearLayoutManager.HORIZONTAL, false));


        ViewFoodPrice viewFoodPrice1 =
                new ViewFoodPrice("Salad Burger", 12, R.drawable.saladburger_figma);
        ViewFoodPrice viewFoodPrice2 =
                new ViewFoodPrice("Chicken Burger", 15, R.drawable.saladburger_figma);

        ArrayList<ViewFoodPrice> viewFoodPriceArrayList = new ArrayList<>();

        viewFoodPriceArrayList.add(viewFoodPrice1);
        viewFoodPriceArrayList.add(viewFoodPrice2);

        FoodPriceAdapter adapter2 = new FoodPriceAdapter(viewFoodPriceArrayList);

        binding.rvFoodlist2.setAdapter(adapter2);
        binding.rvFoodlist2.setLayoutManager(
                new LinearLayoutManager(MenuActivity.this,
                LinearLayoutManager.HORIZONTAL, false));
    }
}