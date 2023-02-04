package com.somelier.model.vinos_marcolaureano;

import java.util.ArrayList;
import java.util.List;

public class ViExpert {
    ArrayList<Vins> list = new ArrayList<>();

    public void AddVins(Vins vins){
        list.add(vins);
    }

    public List<String> getMarques(String tipusVi){
        List<String> listaVino = new ArrayList<>();

        for(Vins v: list){
            if(v.getTipus().equals(tipusVi)){
                listaVino.add(v.getMarca());
            }
        }
        return listaVino;
    }
}
