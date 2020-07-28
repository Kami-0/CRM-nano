package com.peterservice.rtco.sfa.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Instant;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SaleDto {
    private static final String MESSAGE_TO_NOT_VALID_ID = "Минимальный id сущности = 1";
    private static final int ID_MIN = 1;

    private long saleId;

    //    @NotEmpty(message = "Введите дату начала продажи")
    private Instant saleStartDate;

    private Instant saleEndDate;

    @NotNull(message = "Введите custId")
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private long custCustId;

    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    @NotNull(message = "Введите sstatId")
    private long sstatSstatId;

    @NotEmpty(message = "Введите причину отмены")
    private String cancelReason;

    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    @NotNull(message = "Введите cntrId")
    private long cntrCntrId;

    @Override
    public String toString() {
        return String.format(
                "Sale[saleId='%d', saleStartDate='%s', " +
                        "saleEndDate='%s', custCustId='%d', " +
                        "sstatSstatId='%d', sstatSstatId='%d', " +
                        "cancelReason='%s', cntrCntrId='%d']",
                saleId, saleStartDate, saleEndDate, custCustId,
                sstatSstatId, sstatSstatId, cancelReason, cntrCntrId);
    }
}
