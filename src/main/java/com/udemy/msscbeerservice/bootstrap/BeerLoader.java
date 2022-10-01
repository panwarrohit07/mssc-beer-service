package com.udemy.msscbeerservice.bootstrap;

import com.udemy.msscbeerservice.domain.Beer;
import com.udemy.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                            .beerName("Mango Bobs")
                            .beerStyle("IPA")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(33923432L)
                            .price(new BigDecimal("12.94"))
                            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Hoegarden")
                    .beerStyle("Pale_Ale")
                    .quantityToBrew(220)
                    .minOnHand(15)
                    .upc(33936972L)
                    .price(new BigDecimal("12.05"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Budweiser")
                    .beerStyle("IPA")
                    .quantityToBrew(180)
                    .minOnHand(10)
                    .upc(33924862L)
                    .price(new BigDecimal("10.50"))
                    .build());

            System.out.println("Loaded Beers: " + beerRepository.count());
        }
    }
}
