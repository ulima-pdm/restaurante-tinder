package pe.edu.ulima.experienciaul;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import pe.edu.ulima.experienciaul.adapters.RestaurantesPagerAdapter;
import pe.edu.ulima.experienciaul.beans.Restaurante;

/**
 * Created by hernan on 10/27/16.
 */

public class CalificarFragment extends Fragment{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        getActivity().setTitle("Calificar");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ViewPager pager = (ViewPager) getView().findViewById(R.id.pager);
        pager.setAdapter(new RestaurantesPagerAdapter(getFragmentManager(), obtenerRestaurantes()));
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_restaurante, menu);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calificar, container, false);
    }

    private List<Restaurante> obtenerRestaurantes(){
        List<Restaurante> restaurantes = new ArrayList<>();
        restaurantes.add(new Restaurante(1, "Restaurante 1"));
        restaurantes.add(new Restaurante(2, "Restaurante 2"));

        return restaurantes;
    }
}
