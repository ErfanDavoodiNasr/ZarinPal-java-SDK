package com.ernoxin.zarinpaljavasdk.model;

import java.util.List;

/**
 * Result returned by verification operation.
 *
 * @param code     gateway response code
 * @param message  gateway response message
 * @param cardHash masked card hash
 * @param cardPan  masked card PAN
 * @param refId    gateway reference id; {@code null} when absent
 * @param feeType  indicates who paid gateway fee
 * @param fee      fee amount reported by gateway; {@code null} when absent
 * @param wages    wage details returned by gateway when applicable
 */
public record VerifyResult(
        int code,
        String message,
        String cardHash,
        String cardPan,
        Long refId,
        ZarinpalFeeType feeType,
        Long fee,
        List<PaymentWage> wages
) {
}
