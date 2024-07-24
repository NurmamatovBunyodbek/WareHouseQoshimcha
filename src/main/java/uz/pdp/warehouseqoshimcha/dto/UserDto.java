package uz.pdp.warehouseqoshimcha.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Integer code;
    private String password;
    private boolean active;

}
