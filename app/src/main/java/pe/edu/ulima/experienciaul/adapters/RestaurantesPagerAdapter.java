package pe.edu.ulima.experienciaul.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import pe.edu.ulima.experienciaul.RestauranteFragment;
import pe.edu.ulima.experienciaul.beans.Restaurante;

/**
 * Created by hernan on 10/27/16.
 */

public class RestaurantesPagerAdapter extends FragmentStatePagerAdapter{
    private List<Restaurante> mRestaurantes;
    public RestaurantesPagerAdapter(FragmentManager fm, List<Restaurante> restaurantes) {
        super(fm);
        mRestaurantes = restaurantes;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new RestauranteFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("RESTAURANTE", mRestaurantes.get(position));
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return mRestaurantes.size();
    }
}
