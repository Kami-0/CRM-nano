package cam.dto;


import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

    private Long id;

    @NotNull(message = "Please enter the type")
    private Long typeTypeId;

    @NotNull(message = "Please enter the status")
    private Long statusStatusId;

    @NotEmpty(message = "Please enter the name")
    private String nameCustomer;

    @NotNull(message = "Please enter the inn")
    private Long inn;

    @NotNull(message = "Please enter the kpp")
    private Long kpp;

    @NotNull(message = "Please enter the bankId")
    private Long bankId;
}
