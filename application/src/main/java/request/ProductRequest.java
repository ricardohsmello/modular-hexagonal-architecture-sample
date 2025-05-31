package request;

import br.com.ricas.model.Product;

public record ProductRequest(
        String name,
        String description,
        double price
) {
    public Product toModel() {
        return new Product(null, name, description, price);
    }
}
