package uz.pdp.warehouseqoshimcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouseqoshimcha.model.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
