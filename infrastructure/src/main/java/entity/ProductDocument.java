package entity;

import br.com.ricas.model.Product;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProductDocument {
    private String id;
    private String name;
    private String description;
    private double price;

    public ProductDocument(Product product) {
        this.id = product.id();
        this.name = product.name();
        this.description = product.description();
        this.price = product.price();

    }

    public Product toModel() {
        return new Product(id, name, description, price);
    }
}
