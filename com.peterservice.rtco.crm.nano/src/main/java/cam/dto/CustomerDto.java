package cam.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
    private Long id;

    private Long typeTypeId;

    private Long statusStatusId;

    private String nameCustomer;

    private Long inn;

    private Long kpp;

    private Long bankId;
}
