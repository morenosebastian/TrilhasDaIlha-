package com.example.kaori.trilhasweb.Model;

/**
 * Created by Kaori on 08/11/2017.
 */

public class Trilhas {

    private String idTrilha;
    private String nome;
    private String imagem;

    public Trilhas() {
    }

    public Trilhas(String idTrilha, String nome, String imagem) {
        this.idTrilha = idTrilha;
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getIdTrilha() {
        return idTrilha;
    }

    public void setIdTrilha(String idTrilha) {
        this.idTrilha = idTrilha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Trilhas{" +
                "\n" +"Nome="  + nome +"\n" +
                "Imagem="  + imagem +"\n" +
                "\n" ;
    }
}
