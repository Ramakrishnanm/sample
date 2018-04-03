package com.esfb.counterfeitnote.config;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrCode {

    UNKNOWN("PEC_000"),
    INVALID_DATA("PEC_001"),
    INVALID_RESPONSE("PEC_002"),
    PAYMENT_GATEWAY_NOT_FOUND("PEC_003"),
    INVALID_RESOURCE_PATH("PEC_004"),
    INVALID_KEYSTORE_PATH("PEC_005"),
    INVALID_TRACK_ID("PEC_006"),
    MERCHANT_NOT_FOUND("PEC_007"),
    INVALID_MERCHANT_CONFIG("PEC_008"),
    DATABASE_ERROR("PEC_009"),
    NOT_IMPLEMENTED("PEC_010"),
	INVALID_DEBIT_CARD("PEC_011");

    private String code;

    private ErrCode(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }
}
