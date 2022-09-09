package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SaleService {
  
  private final SaleRepository repository;

  public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {

    LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

    LocalDate min =  !minDate.equals("") ? LocalDate.parse(minDate) : today.minusDays(365);
    LocalDate max = !maxDate.equals("") ? LocalDate.parse(maxDate) : today;

    return repository.findSales(min, max, pageable);
  }
}
