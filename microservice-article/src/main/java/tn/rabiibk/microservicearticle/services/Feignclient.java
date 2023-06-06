package tn.rabiibk.microservicearticle.services;

import entities.StockDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("microservice-stock")
public interface Feignclient {




//        @RequestMapping(method = RequestMethod.GET, value = "/getAll")
//        List<StockDto> getStocks();
     @RequestMapping(method = RequestMethod.GET, value = "stock/getstock/{id}")
     StockDto getStockById (@PathVariable Long id);
}
