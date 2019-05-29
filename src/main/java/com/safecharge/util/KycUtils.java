package com.safecharge.util;

import com.safecharge.model.EkycUserDetails;

/**
 * @author Steven Wallace
 */
public final class KycUtils {

    public static EkycUserDetails createEkycUserDetailsFromParams(String userName, String languageCode, String dateOfBirth,
                                                                  String title, String gender, String building,
                                                                  String mobileCountryCode, String mobileNumber,
                                                                  String identification,
                                                                  Constants.IdentificationType identificationType) {

        EkycUserDetails details = new EkycUserDetails();
        details.setUserName(userName);
        details.setLanguageCode(languageCode);
        details.setDateOfBirth(dateOfBirth);
        details.setTitle(title);
        details.setGender(gender);
        details.setBuilding(building);
        details.setMobileCountryCode(mobileCountryCode);
        details.setMobileNumber(mobileNumber);
        details.setIdentification(identification);
        details.setIdentificationType(identificationType);

        return details;
    }
}
