package uz.pdp.warehouseqoshimcha.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private String name;
    private Integer category;
    private Integer attachment;
    private String code;
    private Integer measurement;

}
