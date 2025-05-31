package br.com.ricas.database.mongodb;


import br.com.ricas.model.Product;
import br.com.ricas.port.ProductPort;
import br.com.ricas.entity.ProductDocument;
import org.springframework.stereotype.Repository;

@Repository
public class ProductPortImpl implements ProductPort {

    private final ProductRepository productRepository;

    ProductPortImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(new ProductDocument(product)).toModel();
    }

}
