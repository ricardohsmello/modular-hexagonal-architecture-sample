package br.com.ricas.model;

public record Product(
        String id,
        String name,
        String description,
        double price
) {
}
