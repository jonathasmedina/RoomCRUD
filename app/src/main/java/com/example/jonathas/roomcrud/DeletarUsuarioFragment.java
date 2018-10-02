package com.example.jonathas.roomcrud;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeletarUsuarioFragment extends Fragment {

    EditText edIdUsuario;
    Button deleteButton;

    public DeletarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_deletar_usuario, container, false);

        edIdUsuario = view.findViewById(R.id.editTextDeletar);
        deleteButton = view.findViewById(R.id.buttonDeletar);

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(edIdUsuario.getText().toString());
                Usuario usuario = new Usuario();
                usuario.setId(id);
                MainActivity.myAppDatabase.myDao().deletarUsuario(usuario);

                Toast.makeText(getActivity(), "Usuário deletado", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }

}
