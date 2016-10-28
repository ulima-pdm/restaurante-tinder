package pe.edu.ulima.experienciaul;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pe.edu.ulima.experienciaul.beans.Restaurante;

/**
 * Created by hernan on 10/27/16.
 */

public class RestauranteFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_restaurante, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Restaurante restaurante = (Restaurante) getArguments().getSerializable("RESTAURANTE");
        TextView tviNombreRestaurante = (TextView) getView().findViewById(R.id.tviNombreRestaurante);
        tviNombreRestaurante.setText(restaurante.getNombre());

    }
}
