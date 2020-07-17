package cam.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerStatusDto {
    private Long statusId;

    private String keyName;

    private String name;
}