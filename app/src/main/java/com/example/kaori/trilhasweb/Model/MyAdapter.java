package com.example.kaori.trilhasweb.Model;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kaori.trilhasweb.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private ArrayList<Trilhas> listTrilhas;
    private LayoutInflater inflater;

    public MyAdapter(ArrayList<Trilhas> trilha, Context context) {
        this.listTrilhas = trilha;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listTrilhas.size();
    }

    @Override
    public Object getItem(int i) {
        return listTrilhas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public void add(Trilhas t){
        listTrilhas.add(t);
    }

    public void remover(Trilhas t){
        listTrilhas.remove(t);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Trilhas torcedor = listTrilhas.get(i);
        view = inflater.inflate(R.layout.item_listview, null);

        TextView tvNome = (TextView) view.findViewById(R.id.tvNome);
        TextView tvNomeTrilha = (TextView) view.findViewById(R.id.tvNomeTrilha);
        ImageView ivImagem = (ImageView) view.findViewById(R.id.imageView);

        tvNome.setText(torcedor.getNome());


        return view;
    }
}
