package uz.pdp.warehouseqoshimcha.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.warehouseqoshimcha.model.Currency;
import uz.pdp.warehouseqoshimcha.model.Supplier;
import uz.pdp.warehouseqoshimcha.model.WareHouse;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputDto {

    private Integer wareHouse;
    private Integer supplier;
    private Integer currency;
    private String factureNumber;
    private String code;

}
