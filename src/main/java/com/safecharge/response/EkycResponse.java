package com.safecharge.response;

import com.safecharge.model.MerchantDetails;

import javax.validation.constraints.Size;

/**
 * @author Steven Wallace
 */
public class EkycResponse extends UserResponse implements SafechargeOrderResponse {

    @Size(max = 255)
    private String userTokenId;

    @Size(max = 20)
    private String orderId;

    @Size(max = 20)
    private String transactionId;

    @Size(max = 20)
    private String transactionStatus;

    private MerchantDetails merchantDetails;
    private String customData;
    private String kycResult;
    private KycServiceDetails kycServiceDetails;
    private String kycErrorCode;
    private String kycErrorReason;


    public String getUserTokenId() {
        return userTokenId;
    }

    public void setUserTokenId(String userTokenId) {
        this.userTokenId = userTokenId;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public MerchantDetails getMerchantDetails() {
        return merchantDetails;
    }

    public void setMerchantDetails(MerchantDetails merchantDetails) {
        this.merchantDetails = merchantDetails;
    }

    public String getCustomData() {
        return customData;
    }

    public void setCustomData(String customData) {
        this.customData = customData;
    }

    public String getKycResult() {
        return kycResult;
    }

    public void setKycResult(String kycResult) {
        this.kycResult = kycResult;
    }

    public KycServiceDetails getKycServiceDetails() {
        return kycServiceDetails;
    }

    public void setKycServiceDetails(KycServiceDetails kycServiceDetails) {
        this.kycServiceDetails = kycServiceDetails;
    }

    public String getKycErrorCode() {
        return kycErrorCode;
    }

    public void setKycErrorCode(String kycErrorCode) {
        this.kycErrorCode = kycErrorCode;
    }

    public String getKycErrorReason() {
        return kycErrorReason;
    }

    public void setKycErrorReason(String kycErrorReason) {
        this.kycErrorReason = kycErrorReason;
    }
}
