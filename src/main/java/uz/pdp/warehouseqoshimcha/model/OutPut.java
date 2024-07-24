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
public class OutPut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Timestamp date;
    @ManyToOne
    private WareHouse wareHouse;
    @OneToMany
    private List<Currency> currency;
    @Column(nullable = false)
    private String factureNumber;
    @Column(nullable = false)
    private Integer code;
    @ManyToMany
    private List<Client> client;


}
