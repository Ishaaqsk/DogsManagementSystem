package com.example.demo.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{

}
