package main.java.com.nyang5504.LongView.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class StockResultDto {
    private Double purchasePrice;
    private Integer shares;
    private Double currentPrice;
    private Double currentValue;
    private Double gains;
    private Double percentGain;
}
