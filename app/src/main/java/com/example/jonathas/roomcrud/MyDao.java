package com.example.jonathas.roomcrud;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void adicionarUsuario(Usuario usuario);

    @Query("select * from usuarios")
    public List<Usuario> getUsuarios();

    @Delete
    public void deletarUsuario(Usuario usuario);

}
