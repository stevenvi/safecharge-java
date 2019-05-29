package com.safecharge.model;

import com.safecharge.util.APIConstants;
import com.safecharge.util.Constants;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author Steven Wallace
 */
public class EkycUserDetails {
    private String userName;
    private String languageCode;

    @Pattern(regexp = APIConstants.DATE_OF_BIRTH_REGEX, message = "the entered value is not a value date")
    private String dateOfBirth;
    private String title;
    private String gender;

    @NotNull(message = "the building property should be populated with house number or building name.")
    private String building;
    private String mobileCountryCode;
    private String mobileNumber;
    private String identification;
    private Constants.IdentificationType identificationType;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public Constants.IdentificationType getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(Constants.IdentificationType identificationType) {
        this.identificationType = identificationType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EkycUserDetails{");
        sb.append("userName='")
                .append(userName)
                .append('\'');
        sb.append(", languageCode='")
                .append(languageCode)
                .append('\'');
        sb.append(", dateOfBirth='")
                .append(dateOfBirth)
                .append('\'');
        sb.append(", title='")
                .append(title)
                .append('\'');
        sb.append(", gender='")
                .append(gender)
                .append('\'');
        sb.append(", building='")
                .append(building)
                .append('\'');
        sb.append(", mobileCountryCode='")
                .append(mobileCountryCode)
                .append('\'');
        sb.append(", mobileNumber='")
                .append(mobileNumber)
                .append('\'');
        sb.append(", identification='")
                .append(identification)
                .append('\'');
        sb.append(", identificationType=")
                .append(identificationType);
        sb.append('}');
        return sb.toString();
    }
}
