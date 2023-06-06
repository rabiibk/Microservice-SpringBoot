package tn.rabiibk.microservicestock.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;
import tn.rabiibk.microservicestock.entities.Stock;
import tn.rabiibk.microservicestock.repositories.StockRepository;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StockServiceImp implements IStockService{


    private final StockRepository stockRepository ;


    @Override
    public Stock createStock(Stock stock){
        stock.setCreatedAt(LocalDate.now());
        return stockRepository.save(stock);
    }


    @Override
    public Stock updateStock(Map<Object,Object> fields , Long id){

        Optional<Stock> stock= stockRepository.findById(id);
        Assert.isTrue(stock.isPresent(),"no stock");


        fields.forEach((key,value)->{

            Field field = ReflectionUtils.findField(Stock.class,(String) key);
            field.setAccessible(true);

            ReflectionUtils.setField(field,stock ,value);
        });


        return  stockRepository.save(stock.get()) ;

    }

    @Override
    public Boolean removeStock(Stock stock) {
        return null;
    }

    @Override
    public Stock findStockById(Long stockId) {

        Optional<Stock>stock =stockRepository.findById(stockId);
        Assert.isTrue(stock.isPresent(),"no stock");

        return stock.get();

    }

    @Override
    public List<Stock> retrieveAllStock() {
        return null;
    }
}
