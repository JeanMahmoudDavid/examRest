package com.nm.examRest.repository;

import com.nm.examRest.model.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorRepository extends CrudRepository<Color, Long> {
    @Override
    List<Color> findAll();
}
