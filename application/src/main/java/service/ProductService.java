package service;

import br.com.ricas.model.Product;
import br.com.ricas.port.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(Product productRequest) {
       return productRepository.save(productRequest);
    }
}
