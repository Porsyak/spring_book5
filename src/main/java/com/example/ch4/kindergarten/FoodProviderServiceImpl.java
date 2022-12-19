package com.example.ch4.kindergarten;

import com.example.ch4.Food;
import com.example.ch4.FoodProviderService;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<>();
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));
        return lunchSet;
    }
}
