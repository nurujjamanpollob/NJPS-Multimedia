/*
 * Copyright (c) 2020 Nurujjaman Pollob.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nurujjamanpollob.njpsmultimedia;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class Settings extends AppCompatActivity {

    static final String PREFS_NAME = "com.nurujjamanpollob.njpsmultimedia_preferences";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportFragmentManager().beginTransaction().replace(R.id.settings_fragment, new SettingsFragment()).commit();

        setContentView(R.layout.app_settings);

        getPrefs(this);
    }

    static void getPrefs(Context context) {
        PreferenceManager.  setDefaultValues(context, PREFS_NAME, MODE_PRIVATE,
                R.xml.settings, false);
        context.getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

    }

}
