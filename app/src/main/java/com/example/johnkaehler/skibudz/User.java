package com.example.johnkaehler.skibudz;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by John Kaehler on 3/20/2018.
 */
/*MODEL OBJECT FOR USER*/

public class User {
    private int mUserId;
    private String mFirstName, mLastName, mEmail, mPassword, mZipCode;
    private Date mDateOfBirth;
    private AbilityLevel mAbilityLevel;
    private List<SkiResort> mSkiResorts;

    public User(String firstName, String lastName, String email, String password, String zipCode, Date dateOfBirth, AbilityLevel abilityLevel) {
        mFirstName = firstName;
        mLastName = lastName;
        mEmail = email;
        mPassword = password;
        mZipCode = zipCode;
        mDateOfBirth = dateOfBirth;
        mAbilityLevel = abilityLevel;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getZipCode() {
        return mZipCode;
    }

    public void setZipCode(String zipCode) {
        mZipCode = zipCode;
    }

    public Date getDateOfBirth() {
        return mDateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        mDateOfBirth = dateOfBirth;
    }

    public AbilityLevel getAbilityLevel() {
        return mAbilityLevel;
    }

    public void setAbilityLevel(AbilityLevel abilityLevel) {
        mAbilityLevel = abilityLevel;
    }
}
