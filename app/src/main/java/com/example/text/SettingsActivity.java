package com.example.text;

import android.os.PersistableBundle;
import android.preference.PreferenceActivity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class SettingsActivity extends PreferenceActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
