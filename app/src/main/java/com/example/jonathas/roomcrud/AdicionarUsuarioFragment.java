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
public class AdicionarUsuarioFragment extends Fragment {

    Button btAdicionar2;
    EditText UsuarioId, UsuarioNome, UsuarioEmail;

    public AdicionarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adicionar_usuario, container, false);


        btAdicionar2 = view.findViewById(R.id.btSalvarUsuario);
        UsuarioId = view.findViewById(R.id.editTextId);
        UsuarioNome = view.findViewById(R.id.editTextNome);
        UsuarioEmail = view.findViewById(R.id.editTextEmail);


        btAdicionar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userId = Integer.parseInt(UsuarioId.getText().toString());
                String userNome = UsuarioNome.getText().toString();
                String userEmail = UsuarioEmail.getText().toString();

                Usuario usuario = new Usuario();
                usuario.setId(userId);
                usuario.setNome(userNome);
                usuario.setEmail(userEmail);

                MainActivity.myAppDatabase.myDao().adicionarUsuario(usuario);
                Toast.makeText(getActivity(), "Usuário adicionado com sucesso.", Toast.LENGTH_SHORT).show();

                UsuarioId.setText("");
                UsuarioEmail.setText("");
                UsuarioNome.setText("");


            }
        });



        return view;

    }

}
