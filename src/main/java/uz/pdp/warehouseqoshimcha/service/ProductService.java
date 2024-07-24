package uz.pdp.warehouseqoshimcha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.warehouseqoshimcha.dto.ProductDto;
import uz.pdp.warehouseqoshimcha.model.*;
import uz.pdp.warehouseqoshimcha.repository.AttachmentRepository;
import uz.pdp.warehouseqoshimcha.repository.CategoryRepository;
import uz.pdp.warehouseqoshimcha.repository.MeasurementRepository;
import uz.pdp.warehouseqoshimcha.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    MeasurementRepository measurementRepository;

    @Autowired
    AttachmentRepository attachmentRepository;

    public List<Product> getProductAll() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    // getById
    public Product getBYIDProduct(Integer id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.get();
    }

    // create
    public Result createProduct(ProductDto productDto) {
        boolean exists = productRepository.existsByName(productDto.getName());
        if (exists) {
            return new Result(false, "Product already exists");
        }
        Product product = new Product();
        product.setName(productDto.getName());
        product.setCode(productDto.getCode());
        Optional<Category> categoryOptional = categoryRepository.findById(productDto.getCategory());
        Category category = categoryOptional.get();
        product.setCategory((List<Category>) category);

        Optional<Measurement> measurementOptional = measurementRepository.findById(productDto.getMeasurement());
        Measurement measurement = measurementOptional.get();
        product.setMeasurement(measurement);


        Optional<Attachment> attachmentOptional = attachmentRepository.findById(productDto.getAttachment());
        Attachment attachment = attachmentOptional.get();

        product.setAttachment(attachment);

        productRepository.save(product);
        return new Result(true, "Created");

    }

    // update
    public Result updated(Integer id, ProductDto productDto) {

        return new Result(false, "not found");
    }

    // deleted
    public Result delete(Integer id) {
        productRepository.deleteById(id);
        return new Result(true, "Deleted");
    }


}
