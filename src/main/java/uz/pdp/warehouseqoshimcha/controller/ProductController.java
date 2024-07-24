package uz.pdp.warehouseqoshimcha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.warehouseqoshimcha.dto.ProductDto;
import uz.pdp.warehouseqoshimcha.model.Product;
import uz.pdp.warehouseqoshimcha.model.Result;
import uz.pdp.warehouseqoshimcha.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> geTALL() {
        List<Product> list = productService.getProductAll();
        return list;
    }

    @GetMapping("/{id}")
    public Product getBYID(@PathVariable Integer id) {
        return productService.getBYIDProduct(id);
    }

    @PostMapping
    public Result add(@RequestBody ProductDto productDto) {
        Result result = productService.createProduct(productDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result edit(@PathVariable Integer id, @RequestBody ProductDto productDto) {
        Result result = productService.updated(id, productDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result del(@PathVariable Integer id) {
        Result result = productService.delete(id);
        return result;
    }


}
