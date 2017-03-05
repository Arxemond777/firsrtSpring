package ch3.page_94_collections.annotation;

import org.springframework.stereotype.Service;

import ch3.page_94_collections.Oracle;

@Service("oracle")
public class BookwormOracle implements Oracle {
    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use the Internet";
    }
}
