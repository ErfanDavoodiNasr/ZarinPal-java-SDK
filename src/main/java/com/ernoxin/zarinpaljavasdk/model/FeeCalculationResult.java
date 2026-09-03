package com.ernoxin.zarinpaljavasdk.model;

/**
 * Result returned by fee calculation operation.
 *
 * @param amount          input amount used for fee calculation; {@code null} when absent
 * @param fee             calculated fee; {@code null} when absent
 * @param feeType         indicates who pays fee
 * @param suggestedAmount suggested amount string returned by gateway
 * @param code            gateway response code
 * @param message         gateway response message
 */
public record FeeCalculationResult(
        Long amount,
        Long fee,
        ZarinpalFeeType feeType,
        String suggestedAmount,
        int code,
        String message
) {
}
