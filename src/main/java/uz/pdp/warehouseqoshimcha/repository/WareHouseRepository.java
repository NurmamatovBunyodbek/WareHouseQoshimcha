package uz.pdp.warehouseqoshimcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouseqoshimcha.model.WareHouse;

public interface WareHouseRepository extends JpaRepository<WareHouse, Integer> {
}
