package com.example.kaori.trilhasweb.Model;

/**
 * Created by Kaori on 08/11/2017.
 */

public class Coordenada {

    private long idcoordenada;
    private String nome;
    private String imagem;
    private double latitude;
    private double longitude;
    private boolean inicioTrilha;
    private boolean fimTrilha;
    private long idTrilha;

    public Coordenada() {
    }

    public Coordenada(long idcoordenada, String nome, String imagem, double latitude, double longitude, boolean inicioTrilha, boolean fimTrilha, long idTrilha) {
        this.idcoordenada = idcoordenada;
        this.nome = nome;
        this.imagem = imagem;
        this.latitude = latitude;
        this.longitude = longitude;
        this.inicioTrilha = inicioTrilha;
        this.fimTrilha = fimTrilha;
        this.idTrilha = idTrilha;
    }

    public long getIdcoordenada() {
        return idcoordenada;
    }

    public void setIdcoordenada(long idcoordenada) {
        this.idcoordenada = idcoordenada;
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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isInicioTrilha() {
        return inicioTrilha;
    }

    public void setInicioTrilha(boolean inicioTrilha) {
        this.inicioTrilha = inicioTrilha;
    }

    public boolean isFimTrilha() {
        return fimTrilha;
    }

    public void setFimTrilha(boolean fimTrilha) {
        this.fimTrilha = fimTrilha;
    }

    public long getIdTrilha() {
        return idTrilha;
    }

    public void setIdTrilha(long idTrilha) {
        this.idTrilha = idTrilha;
    }

    @Override
    public String toString() {
        return "Coordenada{" +
                "idcoordenada=" + idcoordenada +
                ", nome='" + nome + '\'' +
                ", imagem='" + imagem + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", inicioTrilha=" + inicioTrilha +
                ", fimTrilha=" + fimTrilha +
                ", idTrilha=" + idTrilha +
                '}';
    }
}
