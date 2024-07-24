package uz.pdp.warehouseqoshimcha.dto;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.warehouseqoshimcha.model.Client;
import uz.pdp.warehouseqoshimcha.model.Currency;
import uz.pdp.warehouseqoshimcha.model.WareHouse;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OutPutDto {

    private Integer  wareHouseId;
    private Integer currencyId;
    private String factureNumber;
    private Integer code;
    private List<Client> client;
}
