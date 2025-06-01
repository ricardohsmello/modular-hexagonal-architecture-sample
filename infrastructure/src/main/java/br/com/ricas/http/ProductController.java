package br.com.ricas.http;

import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import request.ProductRequest;
import response.PageResponse;
import response.ProductResponse;
import service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> addProduct(@RequestBody ProductRequest product) {
        ProductResponse productResponse = productService.create(product);
        return ResponseEntity.ok(productResponse);
    }

    @GetMapping
    public ResponseEntity<PageResponse<ProductResponse>> getProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int sizePerPage,
            @RequestParam(defaultValue = "ID") String sortField,
            @RequestParam(defaultValue = "DESC") Sort.Direction sortDirection
    ) {
        List<ProductResponse> productResponses = productService.find(page, sizePerPage, sortField, sortDirection.name());
        PageResponse<ProductResponse> response = new PageResponse<>(
                productResponses,
                page,
                sizePerPage,
                productResponses.size()
        );

        return ResponseEntity.ok(response);
    }

}


