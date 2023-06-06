package entities;


import lombok.*;

import java.time.LocalDate;


@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockDto {
    private Long id;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String nameStock;
    private String description;
    private String zone;
    private String classification;
}
