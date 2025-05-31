package service;

import br.com.ricas.model.Product;
import br.com.ricas.port.ProductRepository;
import request.ProductRequest;
import response.ProductResponse;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productRequest.toModel());

        return new ProductResponse(product.id(), product.name(), product.description(), product.price());
    }
}
