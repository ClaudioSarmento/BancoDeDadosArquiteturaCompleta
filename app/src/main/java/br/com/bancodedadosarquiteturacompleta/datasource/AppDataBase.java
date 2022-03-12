package br.com.bancodedadosarquiteturacompleta.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import br.com.bancodedadosarquiteturacompleta.api.AppUtil;
import br.com.bancodedadosarquiteturacompleta.datamodel.ClienteDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME =  "AppBancoDeDados.sqlite";
    public static final int DB_VERSION = 1;
    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG,"AppDataBase: Criando Banco de Dados");
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClienteDataModel.criarTabela());
        Log.d(AppUtil.TAG,"onCreate: Tabela Cliente "+ ClienteDataModel.criarTabela());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
