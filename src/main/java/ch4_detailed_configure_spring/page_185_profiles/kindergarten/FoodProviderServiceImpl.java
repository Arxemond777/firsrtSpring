package ch4_detailed_configure_spring.page_185_profiles.kindergarten;

import java.util.ArrayList;
import java.util.List;

import ch4_detailed_configure_spring.page_185_profiles.Food;
import ch4_detailed_configure_spring.page_185_profiles.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));

        return lunchSet;
    }
}
