package com.example.jonathas.roomcrud;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button btAdicionar, btListar, btDeletar;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btAdicionar = view.findViewById(R.id.btAdicionar);
        btListar = view.findViewById(R.id.btListar);
        btDeletar = view.findViewById(R.id.btDeletar);

        btListar.setOnClickListener(this);
        btAdicionar.setOnClickListener(this);
        btDeletar.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btAdicionar:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameConteiner, new AdicionarUsuarioFragment()).
                        addToBackStack(null).commit();
                break;

            case R.id.btListar:
                MainActivity.fragmentManager.beginTransaction().replace(
                        R.id.frameConteiner, new ListarUsuariosFragment()).addToBackStack(null).commit();
                break;
            case R.id.btDeletar:
                MainActivity.fragmentManager.beginTransaction().replace(
                        R.id.frameConteiner, new DeletarUsuarioFragment()).addToBackStack(null).commit();

        }

    }
}
