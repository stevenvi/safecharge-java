package com.safecharge.response;

/**
 * @author Steven Wallace
 */
public class KycServiceDetails {

    private String serviceDescription;
    private String subPoviderDescription;
    private String resultDescription;
    private String referenceId;
    private String rawProviderData;

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getSubPoviderDescription() {
        return subPoviderDescription;
    }

    public void setSubPoviderDescription(String subPoviderDescription) {
        this.subPoviderDescription = subPoviderDescription;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getRawProviderData() {
        return rawProviderData;
    }

    public void setRawProviderData(String rawProviderData) {
        this.rawProviderData = rawProviderData;
    }
}
