package ch4_detailed_configure_spring.page_185_profiles;

import org.springframework.context.annotation.Profile;

import java.util.List;

public interface FoodProviderService {
    List<Food> provideLunchSet();
}
