package com.react.crudreact.repository;

import com.react.crudreact.model.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductDAO extends MongoRepository<ProductDTO, String> {
}
