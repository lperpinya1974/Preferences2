package net.sgoliver.android.preferences2;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import net.sgoliver.android.preferences2.R;

/**
 * Created by Lluis_2 on 09/11/2016.
 */

public class OpcionesFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.opciones);
    }
}