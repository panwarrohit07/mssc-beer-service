package com.udemy.msscbeerservice.services;

import com.udemy.msscbeerservice.web.model.BeerDto;
import com.udemy.msscbeerservice.web.model.BeerPagedList;
import com.udemy.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);
}
