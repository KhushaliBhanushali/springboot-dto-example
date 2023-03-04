package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
