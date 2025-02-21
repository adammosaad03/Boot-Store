package com.codecademy.boots.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.boots.entities.Boot;
import com.codecademy.boots.enums.BootType;

public interface BootRepository extends CrudRepository<Boot, Integer> {
  private BootRepository bootRepository;
List<Boot> findBySize(Integer size);
List<Boot> findByMaterial(String material);
List<Boot> findByMaterialAndType(String material, BootType type);
List<Boot> findBySizeAndType(Integer size, BootType type);
List<Boot> findBySizeAndMinQuantity(Integer size, Integer quantity );

List<Boot> findByQuantityAndType(Integer quantity, BootType type);
List<Boot> findByType(BootType type);
List<Boot> findBoots(String material, Bootype type, Integer size);
List<Boot> findAllBootsMorethanQuantity(String material, Bootype type, Integer size, Integer quantity);
List<Boot> findBootsLessthanQuantity(String material, Bootype type, Integer quantity);
List<Boot> findAllBootsLessthanQuantity(String material, Bootype type, Integer size, Integer quantity)
List<Boot> findAllBootsBySizeLessthanQuantity( Bootype type, Integer size, Integer quantity)
}
