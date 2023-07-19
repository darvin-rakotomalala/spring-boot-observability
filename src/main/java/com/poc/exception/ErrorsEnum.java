package com.poc.exception;

public enum ErrorsEnum {

    /**
     * ERR_MCS_POC
     */

    ERR_MCS_PRODUCT_TITLE_EMPTY("Error occurred - product title shouldn't be NULL or EMPTY"),
    ERR_MCS_PRODUCT_OBJECT_EMPTY("Error occurred - product object shouldn't be NULL or EMPTY"),
    ERR_MCS_PRODUCT_PARAM_NOT_VALID("Error occurred - parameter value is not valid"),
    ERR_MCS_PRODUCT_NOT_FOUND("Error occurred - no product found with this id");

    private final String errorMessage;

    private ErrorsEnum(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return " errorMessage : " + errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
