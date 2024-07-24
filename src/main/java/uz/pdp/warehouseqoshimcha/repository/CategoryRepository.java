package uz.pdp.warehouseqoshimcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouseqoshimcha.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
