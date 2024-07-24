package uz.pdp.warehouseqoshimcha.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WareHouseDto {

    private String name;
    private boolean active;
}
