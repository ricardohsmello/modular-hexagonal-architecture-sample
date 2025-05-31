package br.com.ricas.config;

import br.com.ricas.port.ProductPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.ProductService;

@Configuration
public class ApplicationServicesConfig {

    @Bean
    public ProductService productService(ProductPort productPort) {
        return new ProductService(productPort);
    }
}
