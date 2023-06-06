package tn.rabiibk.microservicestock.controllers;





import entities.StockDto;
import lombok.RequiredArgsConstructor;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import tn.rabiibk.microservicestock.entities.Stock;
import tn.rabiibk.microservicestock.services.IStockService;

import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("stock")
public class StockController {

    private final IStockService StockService;



    @PatchMapping("{id}")
    Stock updateStock( @RequestBody  Map<Object,Object> fields , @PathVariable  Long id) {

        return StockService.updateStock(fields,id);
    }

    @GetMapping("/getstock/{id}")
    Stock findStockById(@PathVariable  Long id) {

        return StockService.findStockById(id);
    }



}

