package uz.pdp.warehouseqoshimcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouseqoshimcha.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
