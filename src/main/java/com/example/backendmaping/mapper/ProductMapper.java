package com.example.backendmaping.mapper;

import com.example.backendmaping.dto.ProductDto;
import com.example.backendmaping.model.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    ProductDto modelToDto (Product product);
    Product dtoTomodel (ProductDto productDto);
}
