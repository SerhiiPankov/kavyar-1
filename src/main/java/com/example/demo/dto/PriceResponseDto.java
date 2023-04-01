package com.example.demo.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class PriceResponseDto {
    private Long coffeeShopId;
    private String coffeeShopTitle;
    private Long productId;
    private String productName;
    private BigDecimal price;
}
