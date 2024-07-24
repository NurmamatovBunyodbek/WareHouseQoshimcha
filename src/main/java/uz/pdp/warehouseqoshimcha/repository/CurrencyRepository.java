package uz.pdp.warehouseqoshimcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouseqoshimcha.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
