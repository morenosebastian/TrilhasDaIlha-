package com.example.kaori.trilhasweb.Model;

import java.util.ArrayList;

/**
 * Created by Kaori on 08/11/2017.
 */

public class ResCoordenada {

    ArrayList<Coordenada> Coordenadas =new ArrayList<Coordenada>();

    public ResCoordenada() {
    }

    public ResCoordenada(ArrayList<Coordenada> Coordenadas) {
        this.Coordenadas = Coordenadas;
    }

    public ArrayList<Coordenada> getCoordenadas() {
        return Coordenadas;
    }

    public void setCoordenadas(ArrayList<Coordenada> Coordenadas) {
        this.Coordenadas = Coordenadas;
    }

    @Override
    public String toString() {
        return "ResCoordenada{" +
                "Coordenadas=" + Coordenadas +
                '}';
    }
}
