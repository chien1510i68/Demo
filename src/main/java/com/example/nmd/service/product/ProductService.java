package com.example.nmd.service.product;

import com.example.nmd.dto.request.CreateProductRequest;
import com.example.nmd.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductService {

    Product createProduct(CreateProductRequest request);
    Product updateProduct(CreateProductRequest request);

    Product getProductById (long id );

    List<Product> getAllProduct();

    Product deleteProduct(long id);

}
