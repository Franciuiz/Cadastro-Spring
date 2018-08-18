package com.pos.casa.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestRepository extends JpaRepository<Rest, Long> {

}