package uz.pdp.warehouseqoshimcha.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;

    @ManyToMany
    private List<Category> category;
    @OneToOne
    private Attachment attachment;
    @Column(nullable = false)
    private String code;
    @OneToOne
    private Measurement measurement;
    private boolean active;

}
