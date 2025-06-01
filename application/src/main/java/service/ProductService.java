package service;

import br.com.ricas.model.Product;
import br.com.ricas.port.ProductPort;
import request.ProductRequest;
import response.ProductResponse;

import java.util.List;

public class ProductService {

    private final ProductPort productPort;

    public ProductService(ProductPort productPort) {
        this.productPort = productPort;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productPort.save(productRequest.toModel());
        return new ProductResponse(product.id(), product.name(), product.description(), product.price());
    }

    public List<ProductResponse> find(
            int page,
            int sizePerPage,
            String sortField,
            String sortDirection
    ) {
        return productPort.findAll(page, sizePerPage, sortField, sortDirection).stream().map(
                it -> new ProductResponse(it.id(), it.name(), it.description(), it.price())
        ).toList();
    }
}
