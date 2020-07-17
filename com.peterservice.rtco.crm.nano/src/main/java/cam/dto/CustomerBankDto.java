package cam.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerBankDto {
    private Long bankId;

    private String name;
}