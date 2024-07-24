package uz.pdp.warehouseqoshimcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouseqoshimcha.model.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement , Integer> {
}
