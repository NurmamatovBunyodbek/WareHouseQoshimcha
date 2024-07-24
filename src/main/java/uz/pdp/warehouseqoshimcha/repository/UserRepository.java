package uz.pdp.warehouseqoshimcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouseqoshimcha.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

    boolean existsByPhoneNumber(String phoneNumber);
}
