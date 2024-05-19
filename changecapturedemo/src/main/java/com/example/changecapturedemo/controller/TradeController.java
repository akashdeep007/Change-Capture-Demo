package com.example.changecapturedemo.controller;

import com.example.changecapturedemo.entity.Trade;
import com.example.changecapturedemo.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trades")
public class TradeController {

    private final TradeService tradeService;

    @Autowired
    public TradeController(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    @GetMapping
    public ResponseEntity<List<Trade>> getAllTrades() {
        List<Trade> trades = tradeService.getAllTrades();
        return ResponseEntity.ok(trades);
    }
}
