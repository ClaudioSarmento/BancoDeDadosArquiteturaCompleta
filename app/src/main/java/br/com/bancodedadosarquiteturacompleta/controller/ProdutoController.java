package br.com.bancodedadosarquiteturacompleta.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.bancodedadosarquiteturacompleta.api.AppUtil;
import br.com.bancodedadosarquiteturacompleta.datamodel.ClienteDataModel;
import br.com.bancodedadosarquiteturacompleta.datamodel.ProdutoDataModel;
import br.com.bancodedadosarquiteturacompleta.datasource.AppDataBase;
import br.com.bancodedadosarquiteturacompleta.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto>{

    ContentValues dadoDoOjeto;

    public ProdutoController(Context context) {
        super(context);
        Log.d(AppUtil.TAG,"ClienteController: Conectado");
    }

    @Override
    public boolean incluir(Produto obj) {
        dadoDoOjeto = new ContentValues();
        // Key, Value

        //dadoDoOjeto.put(ClienteDataModel.ID,obj.getId());
        dadoDoOjeto.put(ProdutoDataModel.NOME,obj.getNome());
        dadoDoOjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());
        return true;
    }

    @Override
    public boolean alterar(Produto obj) {
        dadoDoOjeto = new ContentValues();
        // Key, Value

        dadoDoOjeto.put(ClienteDataModel.ID,obj.getId());
        dadoDoOjeto.put(ProdutoDataModel.NOME,obj.getNome());
        dadoDoOjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());
        return true;
    }

    @Override
    public boolean deletar(Produto obj) {
        dadoDoOjeto.put(ClienteDataModel.ID,obj.getId());
        return true;
    }

    @Override
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();

        return lista;
    }
}
