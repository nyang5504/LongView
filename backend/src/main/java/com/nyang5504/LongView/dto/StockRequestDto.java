package main.java.com.nyang5504.LongView.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class StockRequestDto {
    private String ticker;
    private Double amount;
    private LocalDate date;
}
