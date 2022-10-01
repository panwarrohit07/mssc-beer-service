package com.udemy.msscbeerservice.web.controller;

import com.udemy.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){

        //to do
        return new ResponseEntity<>(BeerDto.builder().beerName("Hoegarden").price(BigDecimal.valueOf(200)).build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        //todo impl
        BeerDto beerDto1 = BeerDto.builder().id(UUID.randomUUID()).build();
        return new ResponseEntity(beerDto1, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        //todo impl
        return new ResponseEntity(BeerDto.builder().id(UUID.randomUUID()).build(), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity deleteBeerById(@PathVariable("beerId") UUID beerId){
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
