package uz.pdp.warehouseqoshimcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouseqoshimcha.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    boolean existsByName(String name);

}
