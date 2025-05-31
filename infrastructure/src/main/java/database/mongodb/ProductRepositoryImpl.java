package database.mongodb;


import br.com.ricas.model.Product;
import br.com.ricas.port.ProductRepository;
import entity.ProductDocument;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final GenericRepository<ProductDocument> productRepository;

    ProductRepositoryImpl(final GenericRepository<ProductDocument> productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(new ProductDocument(product)).toModel();
    }
}
