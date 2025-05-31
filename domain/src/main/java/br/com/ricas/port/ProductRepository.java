package br.com.ricas.port;

import br.com.ricas.model.Product;

public interface ProductRepository {
    Product save(Product product);
}
