package com.example.mercadoemcasa.repository;





import com.example.mercadoemcasa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Repositório básico com os métodos CRUD
}

