package ru.mtuci.simpleapi.service;

import ru.mtuci.simpleapi.model.Product;

import java.util.List;

public interface ProductService {

    Product get(Long id);

    List<Product> getAll();

    Product save(Product product);

    void delete(Long id);
}