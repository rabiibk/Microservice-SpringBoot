package tn.rabiibk.microservicestock.services;

import tn.rabiibk.microservicestock.entities.Stock;

import java.util.List;
import java.util.Map;

public interface IStockService {




    Stock createStock (Stock stock);

    Stock updateStock(Map<Object,Object> fields , Long id);


    Boolean removeStock (Stock article);


    Stock findStockById( Long stockId);

    List<Stock> retrieveAllStock();
}
