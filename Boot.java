package com.codecademy.boots.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import com.codecademy.boots.enums.BootType;
@Entity
@Table(name = "BOOTS")
public class Boot {
  
  
  @Column(Id)
  @GeneratedValue
  private Integer id;
  public Integer setId(Integer id){
    this.id = id
  }
  public void getId(){
    return this.id
  }
  
  @Column(name = "TYPE")
  @Enumerated(EnumType.STRING)
  private BootType type;
  public BootType setBootType(BootType type){
    this.type = type
  }
  public void getBootType(){
    return this.type
  }
  
  
  @Column(name = "SIZE")
  private Float size;
  public Float setSize(Float size){
    this.size = size
  }
  public void getSize(){
    return this.size
  }
  
  @Column(name = "QUANTITY")
  private Integer quantity;
  public Integer setQuantity(Integer quantity){
    this.quantity = quantity
  }
  public void getQuantity(){
    return this.quantity
  }
  
  @Column(name = "MATERIAL")
  private String material;
  public String setMaterial(String material){
    this.material = material
  }
  public void getMaterial(){
    return this.material
  }
}
