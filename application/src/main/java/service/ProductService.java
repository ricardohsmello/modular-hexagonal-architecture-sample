package service;

import br.com.ricas.model.Product;
import br.com.ricas.port.ProductPort;
import request.ProductRequest;
import response.ProductResponse;

public class ProductService {

    private final ProductPort productPort;

    public ProductService(ProductPort productPort) {
        this.productPort = productPort;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productPort.save(productRequest.toModel());

        return new ProductResponse(product.id(), product.name(), product.description(), product.price());
    }
}
