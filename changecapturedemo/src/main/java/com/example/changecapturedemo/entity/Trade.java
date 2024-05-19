package com.example.changecapturedemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ticker;
    private Double price;
    private Integer quantity;
    private LocalDateTime timestamp;

}
