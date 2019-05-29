package com.safecharge.request;

import com.safecharge.model.*;
import com.safecharge.request.builder.SafechargeBuilder;
import com.safecharge.util.*;

import javax.validation.ConstraintViolationException;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author Steven Wallace
 */
@ValidChecksum(orderMappingName = Constants.ChecksumOrderMapping.EKYC)
public class EkycRequest extends SafechargeRequest {

    @Size(max = 255)
    @NotNull
    private String userTokenId;

    @Size(max = 20)
    @NotNull
    private String userId;

    @Size(max = 45)
    @NotNull
    private String clientUniqueId;
    private DeviceDetails deviceDetails;

    @NotNull
    private UserDetails userDetails;

    @NotNull
    private EkycUserDetails ekycUserDetails;
    private MerchantDetails merchantDetails;
    private UrlDetails urlDetails;
    private String customData;


    public String getUserTokenId() {
        return userTokenId;
    }

    public void setUserTokenId(String userTokenId) {
        this.userTokenId = userTokenId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClientUniqueId() {
        return clientUniqueId;
    }

    public void setClientUniqueId(String clientUniqueId) {
        this.clientUniqueId = clientUniqueId;
    }

    public DeviceDetails getDeviceDetails() {
        return deviceDetails;
    }

    public void setDeviceDetails(DeviceDetails deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public EkycUserDetails getEkycUserDetails() {
        return ekycUserDetails;
    }

    public void setEkycUserDetails(EkycUserDetails ekycUserDetails) {
        this.ekycUserDetails = ekycUserDetails;
    }

    public MerchantDetails getMerchantDetails() {
        return merchantDetails;
    }

    public void setMerchantDetails(MerchantDetails merchantDetails) {
        this.merchantDetails = merchantDetails;
    }

    public UrlDetails getUrlDetails() {
        return urlDetails;
    }

    public void setUrlDetails(UrlDetails urlDetails) {
        this.urlDetails = urlDetails;
    }

    public String getCustomData() {
        return customData;
    }

    public void setCustomData(String customData) {
        this.customData = customData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends SafechargeBuilder<EkycRequest.Builder> {

        private String userTokenId;
        private String userId;
        private String clientUniqueId;
        private DeviceDetails deviceDetails;
        private UserDetails userDetails;
        private EkycUserDetails ekycUserDetails;
        private MerchantDetails merchantDetails;
        private UrlDetails urlDetails;
        private String customData;

        /**
         * Adds user token id to the request.
         *
         * @param userTokenId The user token as {@link String}
         * @return this object
         */
        public EkycRequest.Builder addUserTokenId(String userTokenId) {
            this.userTokenId = userTokenId;
            return this;
        }

        /**
         * Adds SafeCharge user id to the request.
         *
         * @param userId The user id on SafeCharge's side as a {@link String}
         * @return this object
         */
        public EkycRequest.Builder addUserId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Adds a unique ID of the transaction in merchant system. This value must be unique, and is provided in order
         * to perform future actions, such as, reconciliation, identifying the transaction in the event of any issues, etc.
         *
         * @param clientUniqueId The unique id for this request in the merchant system as a {@link String}
         * @return this object
         */
        public EkycRequest.Builder addClientUniqueId(String clientUniqueId) {
            this.clientUniqueId = clientUniqueId;
            return this;
        }

        /**
         * Adds custom data to the request.
         *
         * @param customData The custom merchant data to attach to this request as a {@link String}.
         * @return this object
         */
        public EkycRequest.Builder addCustomData(String customData) {
            this.customData = customData;
            return this;
        }

        /**
         * Adds device details to the request.
         *
         * @param deviceDetails the {@link DeviceDetails} to add to the request
         * @return this object
         */
        public EkycRequest.Builder addDeviceDetails(DeviceDetails deviceDetails) {
            this.deviceDetails = deviceDetails;
            return this;
        }

        /**
         * Adds user details to the request.
         *
         * @param userDetails the {@link UserDetails} to add to the request
         * @return this object
         */
        public EkycRequest.Builder addUserDetails(UserDetails userDetails) {
            this.userDetails = userDetails;
            return this;
        }

        /**
         * Adds eKYC user details to the request.
         *
         * @param ekycUserDetails the {@link EkycUserDetails} to add to the request.
         * @return this object
         */
        public EkycRequest.Builder addEkycUserDetails(EkycUserDetails ekycUserDetails) {
            this.ekycUserDetails = ekycUserDetails;
            return this;
        }

        /**
         * Adds Merchant's specific custom data to the request.
         *
         * @param merchantDetails {@link MerchantDetails} object to add to the request
         * @return this object
         */
        public EkycRequest.Builder addMerchantDetails(MerchantDetails merchantDetails) {
            this.merchantDetails = merchantDetails;
            return this;
        }

        /**
         * Adds URLs to redirect to in case of success/failure and URL to send notification(DMN) to.
         *
         * @param urlDetails {@link UrlDetails} object to add to the request
         * @return this object
         */
        public EkycRequest.Builder addURLDetails(UrlDetails urlDetails) {
            this.urlDetails = urlDetails;
            return this;
        }

        /**
         * Adds device details to the request.
         *
         * @param deviceType the type of the device making the request
         * @param deviceName the type of the device making the request
         * @param deviceOS   the device operating system
         * @param browser    the browser that the device used making the request
         * @param ipAddress  the IP address of the device making the request
         * @return this object
         */
        public EkycRequest.Builder addDeviceDetails(String deviceType, String deviceName, String deviceOS, String browser,
                                                    String ipAddress) {

            DeviceDetails deviceDetails = DeviceUtils.createDeviceDetailsFromParams(deviceType, deviceName, deviceOS, browser, ipAddress);

            return addDeviceDetails(deviceDetails);
        }

        /**
         * Adds user details to the request.
         *
         * @param address     The address of the user
         * @param city        The city of the user
         * @param country     The city of the user(two-letter ISO country code)
         * @param email       The email of the user
         * @param firstName   The first name of the user
         * @param lastName    The last name of the user
         * @param phone       The phone number of the user
         * @param state       The state of the user(two-letter ISO state code)
         * @param zip         The postal code of the user
         * @param dateOfBirth The date of birth of the user
         * @return this object
         */
        public EkycRequest.Builder addUserDetails(String address, String city, String country, String email, String firstName,
                                                                String lastName, String phone, String state, String zip, String dateOfBirth,
                                                                String county, String locale) {

            UserDetails userDetails = AddressUtils.createUserDetailsFromParams(firstName, lastName, address, phone,
                    zip, city, country, state, email, locale, dateOfBirth, county);

            return addUserDetails(userDetails);
        }

        public EkycRequest.Builder addEkycUserDetails(String userName, String languageCode, String dateOfBirth, String title,
                                                      String gender, String building, String mobileCountryCode,
                                                      String mobileNumber, String identification,
                                                      Constants.IdentificationType identificationType) {

            EkycUserDetails ekycUserDetails = KycUtils.createEkycUserDetailsFromParams(userName, languageCode, dateOfBirth,
                    title, gender, building, mobileCountryCode, mobileNumber, identification, identificationType);

            return addEkycUserDetails(ekycUserDetails);
        }

        /**
         * Adds Merchant's specific custom data to the request.
         *
         * @param customField1  {@link String} to store in {@code customField1}
         * @param customField2  {@link String} to store in {@code customField2}
         * @param customField3  {@link String} to store in {@code customField3}
         * @param customField4  {@link String} to store in {@code customField4}
         * @param customField5  {@link String} to store in {@code customField5}
         * @param customField6  {@link String} to store in {@code customField6}
         * @param customField7  {@link String} to store in {@code customField7}
         * @param customField8  {@link String} to store in {@code customField8}
         * @param customField9  {@link String} to store in {@code customField9}
         * @param customField10 {@link String} to store in {@code customField10}
         * @param customField11 {@link String} to store in {@code customField11}
         * @param customField12 {@link String} to store in {@code customField12}
         * @param customField13 {@link String} to store in {@code customField13}
         * @param customField14 {@link String} to store in {@code customField14}
         * @param customField15 {@link String} to store in {@code customField15}
         * @return this object
         */
        public EkycRequest.Builder addMerchantDetails(String customField1, String customField2, String customField3,
                                                                    String customField4, String customField5, String customField6,
                                                                    String customField7, String customField8, String customField9,
                                                                    String customField10, String customField11, String customField12,
                                                                    String customField13, String customField14, String customField15) {

            MerchantDetails merchantDetails = MerchantUtils.createMerchantDetailsFromParams(customField1, customField2, customField3,
                    customField4, customField5, customField6, customField7, customField8, customField9, customField10, customField11,
                    customField12, customField13, customField14, customField15);

            return addMerchantDetails(merchantDetails);
        }


        /**
         * Adds URLs to redirect to in case of success/failure and URL to send notification(DMN) to.
         *
         * @param failureUrl      URL to redirect to in case of failed transaction
         * @param pendingUrl      URL to redirect to in case of pending transaction
         * @param successUrl      URL to redirect to in case of successful transaction
         * @param notificationUrl URL to send notification(DMN) to
         * @return this object
         */
        public EkycRequest.Builder addURLDetails(String failureUrl, String pendingUrl, String successUrl, String notificationUrl) {

            UrlDetails urlDetails = UrlUtils.createUrlDetails(failureUrl, pendingUrl, successUrl, notificationUrl);

            return addURLDetails(urlDetails);
        }

        /**
         * Builds the request.
         *
         * @return {@link SafechargeRequest} object build from the params set by this builder
         * @throws ConstraintViolationException if the validation of the params fails
         */
        @Override
        public SafechargeBaseRequest build() throws ConstraintViolationException {
            EkycRequest request = new EkycRequest();
            request.setUserTokenId(userTokenId);
            request.setUserId(userId);
            request.setClientUniqueId(clientUniqueId);
            request.setDeviceDetails(deviceDetails);
            request.setUserDetails(userDetails);
            request.setEkycUserDetails(ekycUserDetails);
            request.setMerchantDetails(merchantDetails);
            request.setUrlDetails(urlDetails);
            request.setCustomData(customData);

            return ValidationUtils.validate(super.build(request));
        }
    }

}
