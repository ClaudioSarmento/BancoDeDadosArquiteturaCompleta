package br.com.bancodedadosarquiteturacompleta.controller;

import android.content.Context;
import android.util.Log;

import br.com.bancodedadosarquiteturacompleta.api.AppUtil;
import br.com.bancodedadosarquiteturacompleta.datasource.AppDataBase;

public class ClienteController extends AppDataBase {

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG,"ClienteController: Conectado");
    }


}
