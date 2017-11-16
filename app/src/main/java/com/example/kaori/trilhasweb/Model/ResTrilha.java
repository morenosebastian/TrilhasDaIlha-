package com.example.kaori.trilhasweb.Model;

import java.util.ArrayList;

/**
 * Created by Kaori on 08/11/2017.
 */

public class ResTrilha {
    ArrayList<Trilhas> res;

    public ResTrilha() {
    }

    public ResTrilha(ArrayList<Trilhas> res) {
        this.res = res;
    }

    public ArrayList<Trilhas> getTrilhas() {
        return res;
    }

    public void setTrilhas(ArrayList<Trilhas> trilhas) {
        this.res = trilhas;
    }

    @Override
    public String toString() {
        return "ResTrilha{" +
                "Trilhas=" + res +
                '}';
    }
}
