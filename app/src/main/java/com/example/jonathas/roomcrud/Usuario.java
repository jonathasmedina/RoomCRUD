
package com.example.jonathas.roomcrud;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "usuarios")
public class Usuario {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "nome_usuario")
    private String nome;

    @ColumnInfo(name = "email_usuario")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
