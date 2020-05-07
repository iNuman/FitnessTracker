package i.numan.fitnessapp.licenses;

import android.content.Context;

import de.psdev.licensesdialog.licenses.License;

/**
 * Created by iNuman on 20/03/10.
 */

 public class CustomLicense extends License {

    private static final long serialVersionUID = 6731568354346413769L;
    private String mLicenseName = "";
    private String mLicenseURL = "";

    public CustomLicense(String pName, String pURL) {
        mLicenseName = pName;
        mLicenseURL = pURL;
    }

    @Override
    public String getName() {
        return mLicenseName;
    }

    public void setName(String pName) {
        mLicenseName = pName;
    }

    @Override
    public String readSummaryTextFromResources(final Context context) {
        return "";
    }

    @Override
    public String readFullTextFromResources(final Context context) {
        return "";
    }

    @Override
    public String getVersion() {
        return "";
    }

    @Override
    public String getUrl() {
        return mLicenseURL;
    }

    public void setUrl(String pURL) {
        mLicenseURL = pURL;
    }
}

