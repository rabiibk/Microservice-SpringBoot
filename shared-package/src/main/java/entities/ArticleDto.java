package entities;


import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {

    private Long id;
    private String name;
    private String quantity;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    private StockDto StockDto;

}
