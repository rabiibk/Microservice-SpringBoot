package tn.rabiibk.microservicestock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.rabiibk.microservicestock.entities.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {
}
