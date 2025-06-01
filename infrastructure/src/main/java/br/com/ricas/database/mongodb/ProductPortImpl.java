package br.com.ricas.database.mongodb;


import br.com.ricas.entity.ProductDocument;
import br.com.ricas.model.Product;
import br.com.ricas.port.ProductPort;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductPortImpl implements ProductPort {

    private final ProductRepository productRepository;

    ProductPortImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        var productDocument = new ProductDocument();

        productDocument.setId(product.id());
        productDocument.setName(product.name());
        productDocument.setDescription(product.description());
        productDocument.setPrice(product.price());

        return productRepository.save(productDocument).toModel();
    }

    @Override
    public List<Product> findAll(int page, int sizePerPage, String sortField, String sortDirection) {
        Pageable pageable = PageRequest.of(page, sizePerPage, Sort.by(sortDirection, sortField));

        return productRepository.findAll(pageable)
                .stream().map(it -> new Product(it.getId(), it.getName(), it.getDescription(), it.getPrice())).toList();
    }

}
