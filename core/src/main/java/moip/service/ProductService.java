package moip.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import moip.domain.Product;
import moip.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }
}