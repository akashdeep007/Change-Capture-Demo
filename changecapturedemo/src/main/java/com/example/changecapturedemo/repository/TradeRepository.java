package com.example.changecapturedemo.repository;


import com.example.changecapturedemo.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepository extends JpaRepository<Trade, Long> {
}
