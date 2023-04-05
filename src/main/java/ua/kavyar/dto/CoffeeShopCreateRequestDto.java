package ua.kavyar.dto;

import java.time.LocalTime;
import java.util.List;
import lombok.Data;

@Data
public class CoffeeShopCreateRequestDto {
    private Long cityId;
    private String title;
    private String description;
    private String phone;
    private LocalTime open;
    private LocalTime close;
    private String url;
    private Long logoId;
    private String location;
    private List<Long> photos;
    private List<Long> features;
    private List<ProductPriceRequestDto> productPrices;
}
