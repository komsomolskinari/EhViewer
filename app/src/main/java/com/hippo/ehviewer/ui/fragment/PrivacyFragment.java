package com.hippo.ehviewer.ui.fragment;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.text.TextUtils;

import com.hippo.ehviewer.R;
import com.hippo.ehviewer.Settings;

/**
 * Created by Mo10 on 2018/2/10.
 */

public class PrivacyFragment extends PreferenceFragment
        implements Preference.OnPreferenceChangeListener {
    private static final String KEY_PATTERN_PROTECTION = "pattern_protection";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.privacy_settings);
    }
    @Override
    public void onResume() {
        super.onResume();
        Preference patternProtection = findPreference(KEY_PATTERN_PROTECTION);
        patternProtection.setSummary(TextUtils.isEmpty(Settings.getSecurity()) ?
                R.string.settings_privacy_pattern_protection_not_set :
                R.string.settings_privacy_pattern_protection_set);
    }


    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }
}
