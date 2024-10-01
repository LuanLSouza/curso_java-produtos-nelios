package com.educandoWeb.courseSpring.services;

import com.educandoWeb.courseSpring.entities.Order;
import com.educandoWeb.courseSpring.entities.Product;
import com.educandoWeb.courseSpring.entities.User;
import com.educandoWeb.courseSpring.repositories.OrderRepository;
import com.educandoWeb.courseSpring.repositories.ProductRepository;
import com.educandoWeb.courseSpring.services.exceptions.DatabaseException;
import com.educandoWeb.courseSpring.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }

    public void delete(Long id){
        try{
            productRepository.deleteById(id);

        }catch (EmptyResultDataAccessException e ){
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e ){
            throw new DatabaseException(e.getMessage());
        }
    }

    public Product update(Long id, Product obj){
        try {
            Product entity = productRepository.getReferenceById(id);
            updateData(entity, obj);
            return productRepository.save(entity);
        } catch (EntityNotFoundException e ){
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(Product entity, Product obj) {
        entity.setName(obj.getName());
        entity.setImgUrl(obj.getImgUrl());
        entity.setDescription(obj.getDescription());
        entity.setPrice(obj.getPrice());
    }

}
