package com.example.nmd.controller;

import com.example.nmd.dto.request.CreateProductRequest;
import com.example.nmd.dto.response.BaseResponse;
import com.example.nmd.model.Product;
import com.example.nmd.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product/")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService ;



    @PostMapping("create")
    public BaseResponse createProduct (@RequestBody CreateProductRequest request){
        return  BaseResponse.successData( productService.createProduct(request));
    }

    @PostMapping("update")
    public BaseResponse updateProduct (@RequestBody CreateProductRequest request){
        return  BaseResponse.successData( productService.updateProduct(request));
    }

    @GetMapping("{id}")
    public BaseResponse getProductById (@PathVariable long id){
        return BaseResponse.successData(productService.getProductById(id));
    }

    @GetMapping("")
    public BaseResponse getAll (){
        return BaseResponse.successListData(productService.getAllProduct() , productService.getAllProduct().size() );
    }

    @GetMapping("del/{id}")
    public BaseResponse deleteProduct (@PathVariable long id){
        return BaseResponse.successData(productService.deleteProduct(id));
    }
}
