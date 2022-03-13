package br.com.bancodedadosarquiteturacompleta.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import br.com.bancodedadosarquiteturacompleta.api.AppUtil;
import br.com.bancodedadosarquiteturacompleta.datamodel.ClienteDataModel;
import br.com.bancodedadosarquiteturacompleta.datamodel.ProdutoDataModel;
import br.com.bancodedadosarquiteturacompleta.view.MainActivity;

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
        db.execSQL(ProdutoDataModel.criarTabela());
        Log.d(AppUtil.TAG,"onCreate: Tabela Produto "+ ProdutoDataModel.criarTabela());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    /**
     * Método para incluir dados no banco de dados
     * @return
     */
    public boolean insert(String tabela, ContentValues dados){
        boolean retorno = false;
        db = getWritableDatabase();
        try{
            retorno = db.insert(tabela,null,dados) > 0 ;
        }catch (Exception e){
            Log.e(AppUtil.TAG,e.getMessage());
        }finally {
            db.close();
        }
        return retorno;
    }

    /**
     * Método para deletar dados no banco de dados
     */
    public boolean deleteById(String tabela, int id){
        boolean retorno = false;
        db = getWritableDatabase();
        try{
            retorno = db.delete(tabela,"id = ?",new String[] {String.valueOf(id)}) > 0;
        }catch(Exception e){
            Log.e(AppUtil.TAG,e.getMessage());
        }finally {
            db.close();
        }
        return retorno;
    }
}
