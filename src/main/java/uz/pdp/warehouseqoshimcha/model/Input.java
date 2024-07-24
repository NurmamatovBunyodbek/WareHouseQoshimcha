package uz.pdp.warehouseqoshimcha.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Timestamp date;
    @ManyToMany
    private List<WareHouse> wareHouse;
    @OneToOne
    private Supplier supplier;
    @OneToOne
    private Currency currency;
    @Column(nullable = false)
    private String factureNumber;
    @Column(nullable = false)
    private String code;

}
