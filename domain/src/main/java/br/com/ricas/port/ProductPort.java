package br.com.ricas.port;

import br.com.ricas.model.Product;

import java.util.List;

public interface ProductPort {
    Product save(Product product);
    List<Product> findAll(
            int page,
            int sizePerPage,
            String sortField,
            String sortDirection
    );
}
