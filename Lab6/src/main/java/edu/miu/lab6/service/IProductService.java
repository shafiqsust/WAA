package edu.miu.lab6.service;

import edu.miu.lab6.model.Product;

import java.util.List;

public interface IProductService {
    void save(Product p);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();
}
