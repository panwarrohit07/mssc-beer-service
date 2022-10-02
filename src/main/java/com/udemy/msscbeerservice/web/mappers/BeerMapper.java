package com.udemy.msscbeerservice.web.mappers;

import com.udemy.msscbeerservice.domain.Beer;
import com.udemy.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
