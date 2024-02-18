package com.example.Sem4HomeWork4.service;

import com.example.Sem4HomeWork4.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ProductService - служебный класс, реализующий методы работы с репозиторием
 */
@Service
public class ProductService {

    /**
     * интерфейс для создания продукта
     */
    private List<Product> products = new ArrayList<>();

    /**
     * addProduct - метод добавления продукта
     */
    public void addProduct(Product prod) {
        products.add(prod);
    }

    /**
     * findAll - метод получения всех продуктов
     */
    public List<Product> findAll() {
        return products;
    }
}
