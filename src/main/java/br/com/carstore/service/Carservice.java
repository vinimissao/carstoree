package br.com.carstore.service;

import br.com.carstore.dto.CarDTO;


import java.util.List;

public interface Carservice {

   public List<CarDTO> findAll();


    void save(CarDTO carDTO);
    void deleteByID(String ID);
    void UPDATE(String ID, CarDTO carDTO);

}
