package uz.pdp.warehouseqoshimcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouseqoshimcha.model.Client;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
